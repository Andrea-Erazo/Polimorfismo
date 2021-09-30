/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.model;

/**
 *
 * @author Usuario
 */
public class VehiculoDeportivo extends Vehiculo {
    private int cilindrada;
    protected String matricula;
    protected String marca;
    protected String modelo;

    public VehiculoDeportivo() {
    }

    public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
        this.cilindrada = cilindrada;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    
    
    
    @Override
    public String mostrarDatos(){
    return "Matricula: "+matricula+"\nMarca:"+marca+"\nModelo:"+modelo+"\nCilindrada:"+cilindrada;

    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    
    
    
}

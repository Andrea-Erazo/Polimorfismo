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
public class VehiculoTurismo extends Vehiculo {
    private int numeropuertas;
    protected String matricula;
    protected String marca;
    protected String modelo;

    public VehiculoTurismo() {
    }

    public VehiculoTurismo(int numeropuertas, String matricula,String marca,String modelo) {
        this.numeropuertas = numeropuertas;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo= modelo;
    }
    
    @Override
    public String mostrarDatos(){
    return "Matricula: "+matricula+"\nMarca:"
            +marca+"\nModelo:"+modelo+"\nNumero de puertas:"+numeropuertas;
    

        
        
    }

    public int getNumeropuertas() {
        return numeropuertas;
    }

    public void setNumeropuertas(int numeropuertas) {
        this.numeropuertas = numeropuertas;
    }
    
    
    
    
}

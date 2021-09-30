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
public class VehiculoFurgoneta extends Vehiculo {
    private int carga;
    protected String matricula;
    protected String marca;
    protected String modelo;

    public VehiculoFurgoneta() {
    }

    public VehiculoFurgoneta(int carga, String matricula, String marca, String modelo) {
        this.carga = carga;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    
    
    @Override
     public String mostrarDatos(){
     return "Matricula: "+matricula+"\nMarca:"+marca+"\nModelo:"+modelo+"\nCarga:"+carga;

         
        
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    
}

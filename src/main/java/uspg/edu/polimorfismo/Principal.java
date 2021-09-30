/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu.polimorfismo;

import uspg.model.Vehiculo;
import uspg.model.VehiculoDeportivo;
import uspg.model.VehiculoFurgoneta;
import uspg.model.VehiculoTurismo;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo misVehiculos[] = new Vehiculo[4];
        
        
        misVehiculos[0]= new Vehiculo("FFE3","Ferrari","A89");
        misVehiculos[1]= new VehiculoTurismo(1,"FR2","Audi","P2E");
        misVehiculos[2]= new VehiculoDeportivo(23,"FFR1","Ford","FRH4");
        misVehiculos[3]= new VehiculoFurgoneta(32,"SD3","Jip","FFGS");
        
        for(Vehiculo vehiculos: misVehiculos){
            System.out.println(vehiculos.mostrarDatos() );
            System.out.println("");
        }
    }
    
}

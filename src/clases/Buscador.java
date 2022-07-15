package clases;

import java.util.ArrayList;

import javax.swing.JOptionPane;


//Clase con metodos para buscar por tipo de nave

public class Buscador {
	
	
    	 public void filtrarNavesPorClase(ArrayList<Object> naves){
          int buscar=Integer.parseInt(JOptionPane.showInputDialog("Ingrese los tipos de nave "
          		+ "que quiere listar\n" +
        		  "1. Vehiculos Lanzadera \n"
        		 +"2. Naves no Tripuladas \n" +
        		  "3. Naves Tripuladas"));
               
              switch(buscar) {
              case 1:{
            	  filtrarVehiculosLanzadera(naves);
            	  break;
              }
              case 2:{
            	  filtrarNavesNoTripuladas(naves);
            	  break;
              }
              case 3:{
            	  filtrarNavesTripuladas(naves);
            	  break;
              }
              }
         
         
  }
	   void filtrarVehiculosLanzadera(ArrayList<Object> naves) {
		   String resultado="";
	     for(int i=0;i<naves.size();i++){
          if(naves.get(i).getClass().getName().equalsIgnoreCase("clases.VehiculoLanzadera")) {
                 resultado+=((VehiculoLanzadera) naves.get(i)).getNombre() + "\n";
          }                                                                                      
	     }

     JOptionPane.showMessageDialog(null,resultado);	   
}
	   
	   void filtrarNavesNoTripuladas(ArrayList<Object> naves) {
		   String resultado="";
	     for(int i=0;i<naves.size();i++){
          if(naves.get(i).getClass().getName().equalsIgnoreCase("clases.NaveNoTripulada")) {
                 resultado+=((NaveNoTripulada) naves.get(i)).getNombre() + "\n";
          }                                                                                      
	     }

     JOptionPane.showMessageDialog(null,resultado);	   
}
	   
	   void filtrarNavesTripuladas(ArrayList<Object> naves) {
		   String resultado="";
	     for(int i=0;i<naves.size();i++){
          if(naves.get(i).getClass().getName().equalsIgnoreCase("clases.NaveTripulada")) {
                 resultado+=((NaveTripulada) naves.get(i)).getNombre() + "\n";
          }                                                                                      
	     }

     JOptionPane.showMessageDialog(null,resultado);	   
}
	   
}
	   


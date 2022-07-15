package principal;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import clases.Buscador;
import clases.NaveNoTripulada;
import clases.NaveTripulada;
import clases.VehiculoLanzadera;


// Clase principal desde donde se crean las naves espaciales

public class Main {
	
	static String nombre = "";
	static ArrayList<Object> listaNaves = new ArrayList<Object>();
	static Buscador b = new Buscador();
	
    public static void main(String[] args) throws Exception {

        int valor = 0;
        
        // Un do-while con switch case para simular un menu
        do {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese que nave espacial desea crear \n" +
                    "1. Vehiculo Lanzadera \n" +
                    "2. Nave espacial no tripulada \n" +
                    "3. Nave espacial tripulada \n" +
                    "4. Filtrar naves por tipo \n" +
                    "0. Salir"));

            

            switch (valor) {
                case 1: {
                	crearVehiculoLanzadera();
                    break;
                }
                case 2: {
                    crearNaveNoTripulada();
                    break;
                }
                case 3: {
                    crearNaveTripulada();                    
                    break;
                }
                case 4:{
                	b.filtrarNavesPorClase(listaNaves);
                	break;
                }
                case 0:
                    break;
            }

        } while (valor != 0);

    }
        // Metodos para crear los objetos tipo naves
        static void crearVehiculoLanzadera() {
    	nombre = JOptionPane.showInputDialog("Ingrese el nombre del vehiculo lanzadera");
        VehiculoLanzadera v = new VehiculoLanzadera(nombre);
        JOptionPane.showMessageDialog(null, "Se creo el vehiculo lanzadera " + v.getNombre());
        listaNaves.add(v);        
        }
        
        static void crearNaveNoTripulada() {
        	nombre = JOptionPane.showInputDialog("Ingrese el nombre de la nave no tripulada");
            NaveNoTripulada n = new NaveNoTripulada(nombre);
            JOptionPane.showMessageDialog(null, "Se creo la nave no triuplada " + n.getNombre());
            listaNaves.add(n);
        }
        
        static void crearNaveTripulada() {
        	 nombre = JOptionPane.showInputDialog("Ingrese el nombre de la nave tripulada");
             NaveTripulada n = new NaveTripulada(nombre);
             JOptionPane.showMessageDialog(null, "Se creo la nave triuplada " + n.getNombre());
             listaNaves.add(n);
        }
}

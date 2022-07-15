package clases;

import java.util.ArrayList;

import interfaces.NaveEspacial;

public class VehiculoLanzadera extends Nave implements NaveEspacial {
	
	 ArrayList<String> cargas;

	    public VehiculoLanzadera(String nombre) {
	        super(nombre);
	    }

	    public float getToneladasEmpuje() {
	        return this.toneladasEmpuje;
	    }

	    public ArrayList<String> getCargas() {
	        return cargas;
	    }

	    public void setCargas(ArrayList<String> cargas) {
	        this.cargas = cargas;
	    }

	    @Override
	    public void acelerar() {
	        this.velocidad = 100;
	    }

	    @Override
	    public void regularPotencia() {
	        System.out.println("Se ha regulado la potencia ");
	    }

	    @Override
	    public void abastecerPotencia() {
	        System.out.println("Se aumento la potencia");
	    }

	    @Override
	    public void calcularOrbita() {
	        System.out.println("Se hizo el calculo de la orbitra actual");
	    }

	    @Override
	    public void despegar() {
	        System.out.println("Ha iniciado el despegue");

	    }

	    @Override
	    public void aterrizar() {
	        System.out.println("Ha iniciado el aterrizaje");

	    }

}

package clases;

import java.util.ArrayList;

import interfaces.NaveEspacial;

public class NaveTripulada extends Nave implements NaveEspacial {
	
	ArrayList<String> tipoMision;
    ArrayList<String> tripulantes;

    public NaveTripulada(String nombre) {
        super(nombre);
    }

    @Override
    public void acelerar() {
        this.velocidad = 500;
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

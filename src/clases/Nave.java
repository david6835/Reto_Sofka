package clases;

public abstract class Nave extends Vehiculo {
	
	    String sistemaPropulsion;
	    String tipoCombustible;
	    float pesoTransportableOrbita;
	    float potencia;
	    float toneladasEmpuje;

	    public Nave() {
	        this.sistemaPropulsion = "";
	        this.pesoTransportableOrbita = 0;
	        this.potencia = 0;
	        this.tipoCombustible = "";
	        this.toneladasEmpuje = 0;
	    }

	    public Nave(String nombre) {
	        this.nombre = nombre;
	    }

	    public abstract void despegar();

	    public abstract void aterrizar();

	    public String getSistemaPropulsion() {
	        return sistemaPropulsion;
	    }

	    public void setSistemaPropulsion(String sistemaPropulsion) {
	        this.sistemaPropulsion = sistemaPropulsion;
	    }

	    public String getTipoCombustible() {
	        return tipoCombustible;
	    }

	    public void setTipoCombustible(String tipoCombustible) {
	        this.tipoCombustible = tipoCombustible;
	    }

	    public float getPesoTransportableOrbita() {
	        return pesoTransportableOrbita;
	    }

	    public void setPesoTransportableOrbita(float pesoTransportableOrbita) {
	        this.pesoTransportableOrbita = pesoTransportableOrbita;
	    }

	    public float getPotencia() {
	        return potencia;
	    }

	    public void setPotencia(float potencia) {
	        this.potencia = potencia;
	    }

	    public float getToneladasEmpuje() {
	        return toneladasEmpuje;
	    }

	    public void setToneladasEmpuje(float toneladasEmpuje) {
	        this.toneladasEmpuje = toneladasEmpuje;
	    }


}

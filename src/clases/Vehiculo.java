package clases;

public abstract class Vehiculo {
	
	String nombre;
    int velocidad;
    int peso;
    int altura;

    public Vehiculo() {
        this.velocidad = 0;
        this.peso = 0;
        this.altura = 0;
        this.nombre = "";
    }

    public abstract void acelerar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}

package ar.com.onready.entities;

public class Moto extends Vehiculo {

    private String cilindradas;

    public Moto(String marca, String modelo, Double precio, String cilindradas) {
        super(marca, modelo, precio);
        this.cilindradas = cilindradas;

    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void mostrarDatosVehiculo() {
        System.out.println("Marca: " + super.getMarca() + " // Modelo: " + super.getModelo() + " // Puertas: " + this.cilindradas + " // Precio: $"
                + super.getPrecio());
    }

}

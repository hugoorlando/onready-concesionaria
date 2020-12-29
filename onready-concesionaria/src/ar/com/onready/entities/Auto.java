package ar.com.onready.entities;

public class Auto extends Vehiculo {

    private int cantidadPuertas;

    public Auto(String marca, String modelo, Double precio, int cantidadPuertas) {
        super(marca, modelo, precio);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarDatosVehiculo() {
        System.out.println("Marca: " + super.getMarca() + " // Modelo: " + super.getModelo() + " // Puertas: " + this.cantidadPuertas
                + " // Precio: $" + super.getPrecio());
    }

}

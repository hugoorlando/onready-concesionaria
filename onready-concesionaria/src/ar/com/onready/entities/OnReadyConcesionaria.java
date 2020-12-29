package ar.com.onready.entities;

import java.util.ArrayList;
import java.util.Optional;

import ar.com.onready.interfaces.IConcesionario;

public class OnReadyConcesionaria implements IConcesionario {

    private ArrayList<Vehiculo> listaDeVehiculos = new ArrayList<Vehiculo>();

    public OnReadyConcesionaria() {
    }

    public void datosVehiculos() {
        Auto auto1 = new Auto("Peugeot", "206", 200000.0, 4);
        Auto auto2 = new Auto("Peugeot", "208", 250000.0, 5);
        Moto moto1 = new Moto("Honda", "Titan", 60000.0, "125cc");
        Moto moto2 = new Moto("Yamaha", "YBR", 80500.50, "160cc");

        this.listaDeVehiculos.add(auto1);
        this.listaDeVehiculos.add(moto1);
        this.listaDeVehiculos.add(auto2);
        this.listaDeVehiculos.add(moto2);
    }

    public void addListaDeVehiculos(Vehiculo vehiculo) {
        this.listaDeVehiculos.add(vehiculo);
    }

    public ArrayList<Vehiculo> getListaDeVehiculos() {
        return this.listaDeVehiculos;

    }

    @Override
    public void ordernarVehiculoPorPrecio(ArrayList<Vehiculo> list) {

        list.sort((o1, o2) -> o2.getPrecio().compareTo(o1.getPrecio()));

        System.out.println("Vehiculos ordenados por precio de mayor a menor:");
        list.stream().forEach((vehiculo) -> {
            System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo());
        });

    }

    @Override
    public void buscarModeloVehiculoPorLetra(ArrayList<Vehiculo> list) {
        Optional<Vehiculo> result = list.stream().filter(vehiculo -> vehiculo.getModelo().contains("Y")).findFirst();
        System.out.println("Vehiculo que contiene en el modelo la letra 'Y': " + result.get().getMarca() + " " + result.get().getModelo() + " $"
                + result.get().getPrecio());

    }

    public void vehiculoMasCaroYMasBarato() {

        Optional<Vehiculo> resultMax = this.listaDeVehiculos.stream()
                .max((vehiculo1, vehiculo2) -> vehiculo1.getPrecio().compareTo(vehiculo2.getPrecio()));
        System.out.println("El vehiculo mas caro: " + resultMax.get().getMarca() + " " + resultMax.get().getModelo());

        Optional<Vehiculo> resultMin = this.listaDeVehiculos.stream()
                .min((vehiculo1, vehiculo2) -> vehiculo1.getPrecio().compareTo(vehiculo2.getPrecio()));
        System.out.println("El vehiculo mas barato: " + resultMin.get().getMarca() + " " + resultMin.get().getModelo());

    }

}

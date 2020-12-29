package ar.com.onready.interfaces;

import java.util.ArrayList;

import ar.com.onready.entities.Vehiculo;

public interface IConcesionario {

    public default void listarDatosVehiculos(ArrayList<Vehiculo> list) {
        list.stream().forEach((obj) -> {
            obj.mostrarDatosVehiculo();
        });

    }

    public abstract void ordernarVehiculoPorPrecio(ArrayList<Vehiculo> list);

    public abstract void buscarModeloVehiculoPorLetra(ArrayList<Vehiculo> list);

}

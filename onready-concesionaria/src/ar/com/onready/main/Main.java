package ar.com.onready.main;

import ar.com.onready.entities.OnReadyConcesionaria;

public class Main {

    public static void main(String[] args) {
        OnReadyConcesionaria con = new OnReadyConcesionaria();

        con.datosVehiculos();

        con.listarDatosVehiculos(con.getListaDeVehiculos());

        System.out.println("=============================");

        con.vehiculoMasCaroYMasBarato();

        con.buscarModeloVehiculoPorLetra(con.getListaDeVehiculos());

        System.out.println("=============================");

        con.ordernarVehiculoPorPrecio(con.getListaDeVehiculos());

    }

}

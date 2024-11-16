package br.altieres;

import java.util.ArrayList;
import java.util.List;

public class ListaCarros {
    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Fiat"));

        System.out.println(listaCarros.contains(new Carro("BMW")));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Fiat").equals(new Carro("Ford")));
        System.out.println(listaCarros.get(0));
        listaCarros.set(0, new Carro ("Hyundai"));
        System.out.println(listaCarros);
    }
}

package br.altieres;

import java.util.LinkedList;
import java.util.Queue;

public class FilaCarros {
    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros);
 //       System.out.println("Carro removido: " + queueCarros.poll());
        System.out.println(queueCarros.peek());
        System.out.println("Tamanho da fila: " + queueCarros.size());
        System.out.println("É vazia? " + queueCarros.isEmpty());
        System.out.println("Carro procurado: " + queueCarros.contains(new Carro("Ford")));
        System.out.println("Carro procurado: " + queueCarros.contains(new Carro("BMW")));
        System.out.println("Primeiro carro da fila: " + queueCarros.element());
        System.out.println("Primeiro carro da fila: " + queueCarros.poll());
        System.out.println(queueCarros);
        System.out.println("Tamanho da fila: " + queueCarros.size());
        System.out.println("Primeiro carro da fila: " + queueCarros.peek());

    }
}

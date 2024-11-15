package br.altieres;

import java.util.Stack;

public class PilhaCarros {
    public static void main(String[] args) {

        Stack<Carro>  stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println(stackCarros);
        System.out.println("Carro removido: " + stackCarros.pop());
        System.out.println(stackCarros);
        System.out.println("Tamanho da pilha: " + stackCarros.size());
        System.out.println("É vazia? " + stackCarros.isEmpty());
        System.out.println(stackCarros.peek());
        System.out.println("Carro procurado: " + stackCarros.search(new Carro("Ford")));

    }
}

package org.karamon.poo.interfaces.imprenta.domain;

public interface Imprimible {

    static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }

    String imprimir();
}

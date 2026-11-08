package org.karamon.poo.interfaces.imprenta.domain;

public abstract class Hoja {
    protected String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    public abstract String imprimir();
}

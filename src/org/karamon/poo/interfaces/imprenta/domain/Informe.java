package org.karamon.poo.interfaces.imprenta.domain;

public class Informe extends Hoja implements Imprimible {
    private Autor autor;
    private Revisor revisor;

    public Informe(Autor autor, Revisor revisor, String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Este informe ha sido escrito por: " + autor + ".\nY revisado por: " + revisor + "\nContenido: " + this.contenido;
    }
}

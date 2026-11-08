package org.karamon.poo.interfaces.imprenta.domain;

public class Autor extends Persona {
    public Autor(String nombre, String apellido, String telefono, String email) {
        super(nombre, apellido, telefono, email);
    }

    @Override
    public String toString() {
        return "Autor: " + super.toString();
    }
}

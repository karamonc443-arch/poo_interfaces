package org.karamon.poo.interfaces.imprenta.domain;

public class Revisor extends Persona {
    public Revisor(String nombre, String apellido, String telefono, String email) {
        super(nombre, apellido, telefono, email);
    }

    @Override
    public String toString() {
        return "Revisor: " + super.toString();
    }
}

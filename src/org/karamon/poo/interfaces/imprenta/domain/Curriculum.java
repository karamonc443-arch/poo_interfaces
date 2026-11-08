package org.karamon.poo.interfaces.imprenta.domain;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible {
    private Persona persona;
    private String profesion;
    private List<String> estudios;
    private List<String> experiencias;
    private List<String> habilidades;
    private List<String> idiomas;

    public Curriculum(Persona persona, String profesion, String contenido) {
        super(contenido);
        this.persona = persona;
        this.profesion = profesion;
        this.estudios = new ArrayList<>();
        this.experiencias = new ArrayList<>();
        this.habilidades = new ArrayList<>();
        this.idiomas = new ArrayList<>();

    }

    public Curriculum addEstudios(String estudio) {
        this.estudios.add(estudio);
        return this;
    }

    public Curriculum addExperiencias(String experiencia) {
        this.experiencias.add(experiencia);
        return this;
    }

    public Curriculum addHabilidades(String virtudes) {
        this.habilidades.add(virtudes);
        return this;
    }

    public Curriculum addIdiomas(String idioma) {
        this.idiomas.add(idioma);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(persona).append("\n")
                .append("Detalles: ").append(this.contenido).append("\n")
                .append("Profesión: ").append(this.profesion).append("\n")
                .append("Experiencias: \n");
        for (String experiencia : this.experiencias) {
            sb.append(" _ ").append(experiencia).append("\n");
        }
        sb.append("Formación académica: \n");
        for (String estudio : this.estudios) {
            sb.append(" _ ").append(estudio).append("\n");
        }
        sb.append("Habilidades: \n");
        for (String habilidad : this.habilidades) {
            sb.append(" _ ").append(habilidad).append("\n");
        }
        sb.append("Idiomas: \n");
        for (String idioma : this.idiomas) {
            sb.append(" _ ").append(idioma).append("\n");
        }
        return sb.toString();
    }
}

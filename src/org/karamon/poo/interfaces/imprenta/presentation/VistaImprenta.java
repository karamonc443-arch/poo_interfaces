package org.karamon.poo.interfaces.imprenta.presentation;

import org.karamon.poo.interfaces.imprenta.domain.*;

import static org.karamon.poo.interfaces.imprenta.domain.Genero.PROGRAMACION;
import static org.karamon.poo.interfaces.imprenta.domain.Imprimible.imprimir;

public class VistaImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum(new Persona("John", "Doe", "(+34) 600-00-00-00", "john.doe@correo.com"), "Ingeniero de Sistemas", "Resumen laboral...");
        cv.addExperiencias("Java");
        cv.addExperiencias("Oracle DBA");
        cv.addExperiencias("PHP");
        cv.addExperiencias("Kotlin");
        cv.addExperiencias("Spring Framework");
        cv.addExperiencias("Desarrollador Fullstack");
        cv.addExperiencias("Angular");
        cv.addExperiencias("HTML 5");
        cv.addExperiencias("CSS 3");

        cv.addEstudios("Ingeniería de Informática");
        cv.addEstudios("Grado Superior de Administración de Sistemas Informáticos");
        cv.addEstudios("Grado Superior de Desarrollo de Aplicaciones Web");
        cv.addEstudios("Grado Superior de Desarrollo de Aplicaciones Multiplataforma");
        cv.addEstudios("Grado Medio de Sistemas Microinformáticos y Redes");

        cv.addHabilidades("Resolución de problemas");
        cv.addHabilidades("Diseño de Interfaces Web");
        cv.addHabilidades("Diseño de UX");

        cv.addIdiomas("Inglés");
        cv.addIdiomas("Español");
        cv.addIdiomas("Francés");
        cv.addIdiomas("Alemán");

        Libro libro = new Libro(new Persona("Erich", "Gamma", "(+33) 555-44-77-00", "erigam@gam.correo"), "Patrones de diseños: Elementos Reusable POO", PROGRAMACION);
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));

        Informe informe = new Informe(new Autor("Martin", "Fowler", "(+44) 000-11-22-33", "martinfow@ler.correo"), new Revisor("James", "Gosling", "(+55) 11-22-33-77", "jamesgos@ling.correo"), "Estudio sobre microservicios");

        imprimir(cv);
        imprimir(informe);

    }

}

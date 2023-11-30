/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1f;

/**
 *
 * @author eduar
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GeneradorRegistrosAcademicos {
    /**
     * NUM_SEMESTRES es el número de semestres de la carrera de Ingeniería en Computación
     * ASIGNATURAS_POR_SEMESTRE es el maximo de asignaturas que puede llevar una alumno
     * CALIFICACION_MAXIMA es la calificación maxima que puede tener un alumno en cada asignatura
     */

    private static final int NUM_SEMESTRES = 10;
    private static final int ASIGNATURAS_POR_SEMESTRE = 5;
    private static final int CALIFICACION_MAXIMA = 10;
    
    /**
     * Constructor vacío
     */
    public GeneradorRegistrosAcademicos() {
        
    }
    
    /**
     * Lista de asignaturas en la carrera de Ingeniería en Computación
     */

    private static final List<String> asignaturas = List.of(
        "algebra", "calculo", "quimica", "fundamentos de fisica", "fundamentos de programacion",
        "igualdad de genero en ingenieria", "algebra lineal", "calculo integral", "mecanica",
        "redaccion", "EDA1", "probabilidad", "calculo vectorial", "ecuaciones diferenciales",
        "cultura y comunicación", "EDA 2", "POO", "fundamentos fisica", "electricidad y magnetismo",
        "analisis numerico", "matematicas avanzadas", "estructuras discretas",
        "estructura y programacion de computadoras", "dispositivos electricos",
        "lenguajes formales y automatas", "señales y sistemas", "ingenieria de software",
        "sistemas operativos", "diseño digital", "bases de datos", "circuitos electricos",
        "administracion de proyectos de software", "finanzas en la ingenieria de computacion",
        "diseño digital vlsi", "inteligencia artificial", "compiladores",
        "sistemas de comunicación", "intrpduccion a la economia", "creatividad",
        "microcomputadoras", "computacion grafica", "etica", "redes de datos",
        "arquitectura de computadoras", "fundamentos de sistemas embebidos", "sistemas distribuidos",
        "recursos y necesidades de mexico", "criptografia", "fisica cuantica", "computo movil",
        "robots moviles", "seguridad informatica", "procesamiento de voz"
    );

 

    /**
     * Metodo que genera los registros academicos de los alumnos dependiendo del semestre
     * @return regresa los registros academicos
     */
    public  List<RegistroAcademico> generarRegistrosAcademicos() {
        Random rand = new Random();
        List<RegistroAcademico> registros = new ArrayList<>();

        // Shuffle de las asignaturas para asignarlas aleatoriamente a los semestres
        List<String> asignaturasShuffle = new ArrayList<>(asignaturas);
        Collections.shuffle(asignaturasShuffle);

        // Llenar registros académicos
        for (int semestre = 1; semestre <= NUM_SEMESTRES; semestre++) {
            int asignaturasCursadas = Math.min(ASIGNATURAS_POR_SEMESTRE, asignaturas.size());
            
            for (int i = 0; i < asignaturasCursadas; i++) {
                String asignatura = asignaturasShuffle.get(i);
                int creditos = rand.nextInt(15) + 1; // Créditos entre 1 y 15
                int calificacion = rand.nextInt(CALIFICACION_MAXIMA + 1); // Calificación entre 0 y 10

                registros.add(new RegistroAcademico(asignatura, semestre, creditos, calificacion));
            }
        }

        return registros;
    }

    
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1f;

/**
 *
 * @author eduar
 */
import java.util.List;
/**
 * Metodo que nos genera el numero de inscripcion 
 */
public class GeneradorNumeroInscripcion {
    
    
    public GeneradorNumeroInscripcion() {
        
    }

    /**
     * Ecuacion principal que nos dicta el numero de inscripcion 
     * convierte  el indicador escolar a un número de inscripción (considerando el formato especificado por la 
     * SIAE)
     * @param registros datos que se toman de la trayectoria escolar
     * @return el numero de inscripcion 
     */
    public  int generarNumeroInscripcion(List<RegistroAcademico> registros) {
        double promedio = calcularPromedio(registros);
        double escolaridad = calcularEscolaridad(registros);
        double velocidad = calcularVelocidad(registros);

        double indicadorEscolar = promedio * escolaridad * velocidad;

        int numeroInscripcion = (int) (indicadorEscolar * 1000000);

        return numeroInscripcion;
    }

    /**
     * Metodo que Calcula el promedio 
     * @param registros datos que se toman de la trayectoria escolar 
     * @return
     */
    private  double calcularPromedio(List<RegistroAcademico> registros) {

        double sumaCalificaciones = 0;
        int totalCalificaciones = 0;

        for (RegistroAcademico registro : registros) {
            sumaCalificaciones += registro.getCalificacion();
            totalCalificaciones++;
        }

        return totalCalificaciones > 0 ? sumaCalificaciones / totalCalificaciones : 0;
    }

    /**
     * Metodo que Implementa la lógica para calcular la escolaridad
     * @param registros datos que se toman de la trayectoria escolar 
     * @return
     */
    private  double calcularEscolaridad(List<RegistroAcademico> registros) {
        long asignaturasAprobadas = registros.stream().filter(registro -> registro.getCalificacion() >= 6).count();
        long asignaturasTotales = registros.size();

        return asignaturasTotales > 0 ? (double) asignaturasAprobadas / asignaturasTotales : 0;
    }

    /**
     * Implementa la lógica para calcular la velocidad
     * @param registros datos que se toman de la trayectoria escolar
     * @return
     */
    private  double calcularVelocidad(List<RegistroAcademico> registros) {

        int creditosAprobados = registros.stream().mapToInt(RegistroAcademico::getCreditos).sum();
        int creditosTotales = registros.stream().mapToInt(RegistroAcademico::getCreditos).sum();

        return creditosTotales > 0 ? (double) creditosAprobados / creditosTotales : 0;
    }

    /*public  void main(String[] args) {
        // Ejemplo de uso: pasando registros académicos
        List<RegistroAcademico> registros = generarRegistrosAcademicos();

        int numeroInscripcion = generarNumeroInscripcion(registros);
        System.out.println("Número de Inscripción Generado: " + numeroInscripcion);
    }*/
}


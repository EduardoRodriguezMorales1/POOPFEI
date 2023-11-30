/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pro1f;

/**
 *
 * @author eduar
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Pro1F {

    public static void main(String[] args) {
        
        /*
        // Prueba 1
        // Llamar al método generarNombreAleatorio() de GeneradorNombres
        String nombreAleatorio = GeneradorNombres.generarNombreAleatorio();
        // Imprimir el nombre generado
        System.out.println("Nombre Aleatorio: " + nombreAleatorio);*/
        //GeneradorDatosPersonales genDatos = new GeneradorDatosPersonales();

        /*// Generar e imprimir algunos datos personales aleatorios
        for (int i = 0; i < 5; i++) {
            Alumno alu = genDatos.generarDatosPersonalesAleatorios();
            alu.mostrarInformacionImportante();
        }*/
        
        /*
        GeneradorRegistrosAcademicos generador=new GeneradorRegistrosAcademicos();
        GeneradorNumeroInscripcion numin=new GeneradorNumeroInscripcion();
        
        List<RegistroAcademico> registros = generador.generarRegistrosAcademicos();
            System.out.println(numin.generarNumeroInscripcion(registros));
        */
    
        CrudAlumnos crudAlumnos = new CrudAlumnos();
        GeneradorDatosPersonales generadorDatosPersonales = new GeneradorDatosPersonales();
        GeneradorRegistrosAcademicos generadorRegistrosAcademicos = new GeneradorRegistrosAcademicos();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Generar Datos Personales");
            System.out.println("2. Generar Registro Académico");
            System.out.println("3. Agregar Alumno");
            System.out.println("4. Imprimir Alumnos");
            System.out.println("5. Actualizar Alumno");
            System.out.println("6. Exportar a CSV");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Generando Datos Personales...");
                    crudAlumnos.agregarAlumno(generadorDatosPersonales.generarDatosPersonalesAleatorios());
                    break;
                case 2:
                    System.out.println("Generando Registro Académico...");
                    // Puedes modificar este método según tus necesidades
                    crudAlumnos.agregarAlumno(generadorRegistrosAcademicos.generarRegistroAcademicoAleatorio());
                    break;
                case 3:
                    System.out.println("Agregando Alumno...");
                    // Puedes modificar este método según tus necesidades
                    crudAlumnos.agregarAlumno(generarAlumnoAleatorio());
                    break;
                case 4:
                    System.out.println("Imprimiendo Alumnos...");
                    crudAlumnos.imprimirAlumnos();
                    break;
                case 5:
                    System.out.println("Actualizando Alumno...");
                    // Puedes modificar este método según tus necesidades
                    actualizarAlumno(crudAlumnos);
                    break;
                case 6:
                    System.out.println("Exportando a CSV...");
                    crudAlumnos.exportarACSV();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
    }

    // Método para generar un alumno aleatorio (puedes modificar según tus necesidades)
    private static Alumno generarAlumnoAleatorio() {
        return generadorDatosPersonales.generarDatosPersonalesAleatorios();
    }

    // Método para actualizar un alumno existente
    private static void actualizarAlumno(CrudAlumnos crudAlumnos) {
        System.out.print("Ingrese el número de inscripción del alumno a actualizar: ");
        Scanner scanner = new Scanner(System.in);
        int numeroInscripcion = scanner.nextInt();

        // Puedes modificar este método según tus necesidades
        Alumno nuevoAlumno = generarAlumnoAleatorio();

        crudAlumnos.actualizarAlumno(numeroInscripcion, nuevoAlumno);
    }
        
        
        
}

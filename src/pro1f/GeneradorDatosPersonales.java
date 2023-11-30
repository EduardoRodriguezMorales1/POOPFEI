/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1f;

/**
 *
 * @author eduar
 */
/**
 * Importaciones de paquetes y clases 
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * Clase GeneradorDatosPersonales - que proporciona métodos para generar datos personales aleatorios de estudiantes.
 */
public class GeneradorDatosPersonales {
    /**
     * Edad mínima y máxima para la generación de datos aleatorios
     */
    private static final int EDAD_MINIMA = 18;
    private static final int EDAD_MAXIMA = 27;
    /**
     * Ruta al archivo que contiene las direcciones
     */
    private static final String DIRECCIONES_ARCHIVO = "C:\\Users\\roman\\OneDrive\\Documentos\\NetBeansProjects\\Pro1F\\direcciones.csv";
    /**
     * ista para almacenar las direcciones cargadas desde el archivo
     */
    private static final List<String> direcciones = cargarDireccionesDesdeArchivo();

    

    // Método para generar datos personales aleatorios y retornar un objeto Alumno
    /**
     * Genera datos personales aleatorios para un estudiante y retorna un objeto Alumno.
     * @return Un objeto Alumno con datos personales aleatorios.
     */
    public static Alumno generarDatosPersonalesAleatorios() {
        Random rand = new Random();

        /**
         * Generar edad aleatoria entre 18 y 27
         */
        int edad = rand.nextInt(EDAD_MAXIMA - EDAD_MINIMA + 1) + EDAD_MINIMA;

        /**
         * Seleccionar una dirección aleatoria desde la lista cargada desde el archivo
         */
        String direccion = direcciones.get(rand.nextInt(direcciones.size()));

        /**
         * Generar número de cuenta
         */
        String numeroCuenta = generarNumeroDeCuenta();

        /**
         * Crear un objeto Alumno con los datos generados
         */
        return new Alumno("", "", edad, direccion, numeroCuenta, new ArrayList<>());
    }

    // Método para cargar direcciones desde el archivo "direcciones.csv"

    /**
     * Carga las direcciones desde el archivo especificado y las devuelve como una lista.
     * @return Una lista de direcciones cargadas desde el archivo.
     */
    private static List<String> cargarDireccionesDesdeArchivo() {
        /**
         * Lista que almacenará las direcciones cargadas desde el archivo
         */
        List<String> direcciones = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(DIRECCIONES_ARCHIVO))) {
            String linea;
            /**
             * Itera sobre cada línea en el archivo.
             */
            while ((linea = br.readLine()) != null) {
                /**
                 * Ajusta según el formato real de tus datos CSV. 
                 * Divide la línea en campos utilizando la coma como separado
                 */
                String[] campos = linea.split(",");
                /**
                 * Concatena los campos relevantes para formar la dirección
                 */
                String direccion = campos[1].trim() + ", " + campos[2].trim() + ", " + campos[3].trim() + ", " + campos[4].trim();
                /**
                 * Agrega la dirección a la lista
                 */
                direcciones.add(direccion);
            }
        } catch (IOException e) {
            /**
             * En caso de error al leer el archivo, imprime la traza de la excepción
             */
            e.printStackTrace();
        }
        /**
         * Devuelve la lista de direcciones cargadas desde el archivo
         */
        return direcciones;
    }

    // Método para generar un número de cuenta aleatorio
    /**
     * Genera un número de cuenta aleatorio con un formato específico.
     * @return Un número de cuenta aleatorio.
     */
    private static String generarNumeroDeCuenta() {
        Random rand = new Random();
        int numeroCuentaBase = 314000000 + rand.nextInt(1000000);
        return String.format("314%06d", numeroCuentaBase);
    }
}


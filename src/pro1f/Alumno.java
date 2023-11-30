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
 * La clase Alumno representa a un estudiante en un sistema de gestión escolar.
 * Cada instancia de esta clase contiene información personal y académica de un alumno.
 */
public class Alumno {
    /**
     * Atributos  de la clase Alumno 
     * nombre , apellido, direccion, numeroCuenta son de tipo String
     * edad y numeroInscripcion son de tipo int
     * historialAcademico es de tipo List < String>
     */
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private String numeroCuenta;
    private List<String> historialAcademico;
    private int numeroInscripcion;
    /**
     * Constructor Vacio
     * 
     */
    public Alumno() {
        
    }
    /**
     * Constructor No vacio - clase Alumno utilizado para crear instancias con información inicial.
     * @param nombre El nombre del alumno.
     * @param apellido El apellido del alumno.
     * @param edad La edad del alumno.
     * @param direccion La dirección del alumno.
     * @param numeroCuenta El número de cuenta del alumno.
     * @param historialAcademico La lista que contiene el historial académico del alumno.
     */
    public Alumno(String nombre, String apellido, int edad, String direccion, String numeroCuenta, List<String> historialAcademico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.numeroCuenta = numeroCuenta;
        this.historialAcademico = historialAcademico;
        // El número de inscripción se generará posteriormente
    }
    
    
    /**
     * Metodos de Servicio - getter y setter para acceder y modificar los atributos
     */

    /**
     * Método getter para obtener el nombre del alumno.
     * @return El nombre del alumno.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece el nombre de la persona.
     * @param nombre El nuevo nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene el apellido de la persona.
     * @return El apellido de la persona.
     */

    public String getApellido() {
        return apellido;
    }
    /**
     * Establece el apellido de la persona.
     * @param apellido El nuevo apellido de la persona.
     */

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * Obtiene la edad de la persona.
     * @return La edad de la persona.
     */

    public int getEdad() {
        return edad;
    }
    /**
     * Establece la edad de la persona.
     * @param edad La nueva edad de la persona.
     */

    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Obtiene la dirección de la persona.
     * @return La dirección de la persona.
     */

    public String getDireccion() {
        return direccion;
    }
    /**
     * Establece la dirección de la persona.
     * @param direccion La nueva dirección de la persona.
     */

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * Obtiene el número de cuenta de la persona.
     * @return El número de cuenta de la persona.
     */

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    /**
     * Establece el número de cuenta de la persona.
     * @param numeroCuenta El nuevo número de cuenta de la persona.
     */

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    /**
     * Obtiene el historial académico de la persona.
     * @return El historial académico de la persona como una lista de strings.
     */

    public List<String> getHistorialAcademico() {
        return historialAcademico;
    }
    /**
     * Establece el historial académico de la persona.
     * @param historialAcademico El nuevo historial académico de la persona.
     */

    public void setHistorialAcademico(List<String> historialAcademico) {
        this.historialAcademico = historialAcademico;
    }
    /**
     * Obtiene el número de inscripción de la persona.
     * @return El número de inscripción de la persona.
     */

    public int getNumeroInscripcion() {
        return numeroInscripcion;
    }
    /**
     * Establece el número de inscripción de la persona.
     * @param numeroInscripcion El nuevo número de inscripción de la persona.
     */

    public void setNumeroInscripcion(int numeroInscripcion) {
        this.numeroInscripcion = numeroInscripcion;
    }

    /**
     * Método para mostrar información importante del alumno en la consola.
     * Este método imprime  el nombre, apellido, edad, dirección, número de cuenta
     * y número de inscripción del alumno.
     */    
    public void mostrarInformacionImportante() {
    System.out.println("Información Importante del Alumno:");
    System.out.println("Nombre: " + nombre + " " + apellido);
    System.out.println("Edad: " + edad);
    System.out.println("Dirección: " + direccion);
    System.out.println("Número de Cuenta: " + numeroCuenta);
    System.out.println("Número de Inscripción: " + numeroInscripcion);
    System.out.println("---------------------------------------");
    
    }
}

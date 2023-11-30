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
import java.util.Arrays;
import java.util.Random;

public class GeneradorNombres {
    private static final ArrayList<String> nombresHombre = crearListaNombresHombre();
    private static final ArrayList<String> nombresMujer = crearListaNombresMujer();
    private static final ArrayList<String> apellidos = crearListaApellidos();

    
    /**
     * Método para generar un nombre aleatorio
     */
    public static String generarNombreAleatorio() {
        Random rand = new Random();
        boolean esHombre = rand.nextBoolean(); // Determinar si será un nombre de hombre o mujer

        if (esHombre) {
            return nombresHombre.get(rand.nextInt(nombresHombre.size())) + " " + apellidos.get(rand.nextInt(apellidos.size()))+ " " + apellidos.get(rand.nextInt(apellidos.size()));
        } else {
            return nombresMujer.get(rand.nextInt(nombresMujer.size())) + " " + apellidos.get(rand.nextInt(apellidos.size()))+ " " + apellidos.get(rand.nextInt(apellidos.size()));
        }
    }

    /**
     * Métodos privados para crear las listas de nombres de hombres  
     * @return
     */
    private static ArrayList<String> crearListaNombresHombre() {
        //ist<String> nombres = new ArrayList<>();
        // Agregar aquí 50 nombres de hombre
        
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("David","Antonio","Jos","Manuel","Francisco","Javier","Juan","Pedro","Miguel","Carlos","Alejandro","Daniel","Jos Luis","Rafael","Fernando","Andrs","Sergio","Luis","Jorge","Alberto","ngel","Gabriel","Ramn","Juan Carlos","Enrique","Diego","Ignacio","Jos Antonio","Guillermo","Eduardo","Vctor","Mario","Jos Manuel","Rubn","Oscar","Adrin","Roberto","Arturo","Emilio","Juan Jos","Salvador","Hctor","Csar","Juan Manuel","Ricardo","Jaime","Israel","Francisco Javier","Martn","Alejandro Jos","Jorge Luis","Juan Pablo","Juan Antonio","Juan Carlos","Juan Jos","Juan Manuel","Juan Miguel","Juan Pablo","Juan Pedro","Juan Ramn","Juan Vicente","Julio","Julio Csar","Leonardo","Lorenzo","Luis Alberto","Luis ngel","Luis Antonio","Luis Carlos","Luis Enrique","Luis Fernando","Luis Francisco","Luis Gabriel","Luis Guillermo","Luis Javier","Luis Jos","Luis Manuel","Luis Miguel","Luis ngel","Luis Roberto","Luis Vicente","Manuel Alejandro","Manuel Antonio","Manuel Eduardo","Manuel Francisco","Manuel Jess","Manuel Jos","Manuel Luis","Manuel ngel","Manuel Roberto","Manuel Vicente","Marco Antonio","Marcos","Mario Alberto","Mario Alejandro","Mario Antonio","Mario Eduardo","Mario Enrique","Mario Francisco","Mario Jos"));
        
        return nombres;
    }

    /**
     * Métodos privados para crear las listas de nombres de mujeres 
     * @return
     */
    private static ArrayList<String> crearListaNombresMujer() {
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Mara","Carmen","Ana","Laura","Isabel","Patricia","Rosa","Beatriz","Elena","ngela","Marta","Susana","Cristina","Silvia","Sonia","Raquel","Carolina","Mara Jos","Mara Carmen","Mara Isabel","Mara Pilar","Mara Dolores","Mara Luisa","Mara Teresa","Mara Fernanda","Mara Eugenia","Mara Victoria","Mara Guadalupe","Mara Laura","Mara Elena","Mara ngela","Mara Patricia","Mara Rosa","Mara Beatriz","Mara Sofa","Mara ngel","Mara Cristina","Mara Silvia","Mara Sonia","Mara Raquel","Mara Carolina","Mara Marta","Mara Susana","Mara Gabriela","Mara Alejandra","Mara Gabriela","Mara Alejandra","Mara Fernanda","Mara Eugenia","Mara Victoria","Mara Guadalupe","Mara Laura","Mara Elena","Mara ngela","Mara Patricia","Mara Rosa","Mara Beatriz","Mara Sofa","Mara ngel","Mara Cristina","Mara Silvia","Mara Sonia","Mara Raquel","Mara Carolina","Mara Marta","Mara Susana","Mara Gabriela","Mara Alejandra","Mara Fernanda","Mara Eugenia","Mara Victoria","Mara Guadalupe","Mara Laura","Mara Elena","Mara ngela","Mara Patricia","Mara Rosa","Mara Beatriz","Mara Sofa","Mara ngel","Mara Cristina","Mara Silvia","Mara Sonia","Mara Raquel","Mara Carolina","Mara Marta","Mara Susana","Mara Gabriela","Mara Alejandra","Mara Fernanda","Mara Eugenia","Mara Victoria","Mara Guadalupe","Mara Laura","Mara Elena","Mara ngela","Mara Patricia","Mara Rosa","Mara Beatriz","Mara Sofa"));
        // Agregar aquí 50 nombres de mujer
        return nombres;
    }

    /**
     * Métodos privados para crear las listas de apellidos
     * @return
     */
    private static ArrayList<String> crearListaApellidos() {
        ArrayList<String> apellidos = new ArrayList<>(Arrays.asList("Gonzalez","Rodríguez","López","Martínez","Sanchez","Perez","Gómez","Fernandez","Torres","Ramírez","Morales","Ortega","Delgado","Castro","Herrera","Medina","Ríos","Mendoza","Aguilar","Vargas","Reyes","Jimenez","Ruiz","Hernandez","Díaz","Moreno","alvarez","Romero","Navarro","Silva","Flores","Paredes","Cordero","Rojas","Espinoza","Caceres","Valenzuela","Miranda","Bravo","Contreras","Sepúlveda","Munoz","Araya","Salazar","Castillo","Aguilar","Pizarro","Figueroa","Leiva","Orellana","Carvajal","Morales","Villalobos","Fuentes","Pena","Moya","Alvarado","Tapia","Riquelme","Soto","Fuentealba","Campos","Henríquez","Guzman","Pizarro","Jara","Navarro","Rojas","Espinoza","Orellana","Moya","Alvarado","Soto","Campos","Henríquez","Guzman","Jara","Pizarro","Navarro","Rojas","Espinoza","Orellana","Moya","Alvarado","Soto","Campos","Henríquez","Guzman","Jara","Pizarro","Navarro","Rojas","Espinoza","Orellana","Moya","Alvarado","Soto","Campos","Henríquez","Guzman"));
        // Agregar aquí 50 apellidos
        return apellidos;
    }
}

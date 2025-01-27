package utils;

import java.util.Comparator;
import models.Contacto;

public class ContactoComparator implements Comparator<Contacto>{

    @Override
    public int compare(Contacto c1, Contacto c2) {

        // Comparar por apellido
        int comparacionApellido = c1.getApellido().compareToIgnoreCase(c2.getApellido());
        
        if (comparacionApellido != 0) {
            return comparacionApellido;  // Si los apellidos son diferentes, devuelve el resultado
        }
        // Si los apellidos son iguales, comparar por nombre
        int comparacionNombre = c1.getNombre().compareToIgnoreCase(c2.getNombre());
    
        if (comparacionNombre != 0) {
            return comparacionNombre;  // Si los nombres son diferentes, devuelve el resultado
        }
        // Si los nombres y apellidos son iguales, comparar por teléfono
        return c1.getTelefono().compareTo(c2.getTelefono());
    }
}

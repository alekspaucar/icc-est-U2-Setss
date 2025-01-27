package models;

public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;

    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre='" + nombre + '\'' + ", apellido='" + apellido + '\'' + ", telefono='" + telefono + '\'' + '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) // mismas referencias en memoria
            return true;
        if (obj == null) // objeto es null
            return false;
        if (getClass() != obj.getClass()) // si no son de la misma clase
            return false;
    
        Contacto other = (Contacto) obj;
        return nombre.equals(other.nombre) && apellido.equals(other.apellido) && telefono.equals(other.telefono);
    }
    
    @Override
    public int hashCode() {
        // Incluyendo el teléfono en el hash
        return nombre.hashCode() + apellido.hashCode() + telefono.hashCode();
    }
}    
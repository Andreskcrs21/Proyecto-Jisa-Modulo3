
package Clases;

public class Empleado {
    private String nombre;
    private String apellido;
    private String Dni;
    private String edad;
    private String cargo;
    private String direccion;
    private String telefono;
    private String titulacion;

    public Empleado(String nombre, String apellido, String Dni, String edad, String cargo, String direccion, String telefono, String titulacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Dni = Dni;
        this.edad = edad;
        this.cargo = cargo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.titulacion = titulacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

   
    
    
    
}

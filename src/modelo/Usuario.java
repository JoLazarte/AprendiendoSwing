package modelo;

public class Usuario {
    private String dni;
    private String nombre;
    private String rol;

    public Usuario(String dni, String nombre, String rol) {
        this.dni = dni;
        this.nombre = nombre;
        this.rol = rol;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
}

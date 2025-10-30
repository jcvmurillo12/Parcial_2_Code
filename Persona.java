package persona_jugador;

public class Persona {
    private String nombre;
    private String nif;
    private String fechaNac;

    public Persona(String nombre, String nif, String fechaNac) {
        this.nombre = nombre;
        this.nif = nif;
        this.fechaNac = fechaNac;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("NIF: " + nif);
        System.out.println("Fecha de Nacimiento: " + fechaNac);
    }
}

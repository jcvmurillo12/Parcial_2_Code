package persona_jugador;

public class Jugador extends Persona {
    private int numFed;

    public Jugador(String nombre, String nif, String fechaNac, int numFed) {
        super(nombre, nif, fechaNac);
        this.numFed = numFed;
    }

    public int getNumFed() {
        return numFed;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número Federado: " + numFed);
    }

    public static void main(String[] args) {
        Jugador jugador = new Jugador("Juan Camilo Vélez", "12345678X", "2003-05-10", 101);
        jugador.mostrarInfo();
    }
}

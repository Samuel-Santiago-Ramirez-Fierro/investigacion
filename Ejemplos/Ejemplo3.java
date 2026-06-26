import java.util.List;

public class Ejemplo3 {
    public static void main(String[] args) {
        List<String> nombres = List.of("Ana", "Juan", "Pedro");
        // Abreviado (Ciclo For-each) en lugar de bucle con indexador o iterador tradicional
        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }
    }
}

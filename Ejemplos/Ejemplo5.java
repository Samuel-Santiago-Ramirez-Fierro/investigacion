public class Ejemplo5 {
    public static void main(String[] args) {
        // Abreviado (Expresión Lambda) en lugar de una clase anónima Runnable
        Runnable r = () -> System.out.println("Ejecutando hilo con expresión lambda");
        r.run();
    }
}

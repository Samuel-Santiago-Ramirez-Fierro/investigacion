import java.util.HashMap;
import java.util.List;

public class Ejemplo4 {
    public static void main(String[] args) {
        // Abreviado (Inferencia de tipo local 'var') en lugar de especificar Map<String, List<String>>
        var mapas = new HashMap<String, List<String>>();
        mapas.put("Clave", List.of("Valor1", "Valor2"));
        System.out.println("Contenido del mapa: " + mapas);
    }
}

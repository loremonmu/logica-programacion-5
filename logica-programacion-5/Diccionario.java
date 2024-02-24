import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Diccionario {
    private static final int PALABRAS_ALEATORIAS = 5;

    public static void main(String[] args) {
        // Crear el diccionario
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("mesa", "table");
        diccionario.put("libro", "book");
        diccionario.put("manzana", "apple");
        diccionario.put("computadora", "computer");
        diccionario.put("lápiz", "pencil");
        diccionario.put("teléfono", "phone");
        diccionario.put("ventana", "window");
        diccionario.put("puerta", "door");
        diccionario.put("silla", "chair");
        diccionario.put("pluma", "pen");
        diccionario.put("automóvil", "car");
        diccionario.put("bicicleta", "bicycle");
        diccionario.put("hombre", "man");
        diccionario.put("mujer", "woman");
        diccionario.put("niño", "child");
        diccionario.put("agua", "water");
        diccionario.put("leche", "milk");

        // Selección de palabras aleatorias
        String[] palabrasEspañol = seleccionarPalabrasAleatorias(diccionario);

        // Pedir al usuario las traducciones
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;
        Scanner scanner = new Scanner(System.in);
        for (String palabra : palabrasEspañol) {
            System.out.print("Traduce \"" + palabra + "\": ");
            String respuestaUsuario = scanner.nextLine().trim().toLowerCase();
            if (diccionario.containsKey(palabra) && diccionario.get(palabra).equalsIgnoreCase(respuestaUsuario)) {
                respuestasCorrectas++;
            } else {
                respuestasIncorrectas++;
            }
        }

        // Mostrar resultados
        System.out.println("\nRespuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }

    private static String[] seleccionarPalabrasAleatorias(Map<String, String> diccionario) {
        String[] palabras = diccionario.keySet().toArray(new String[0]);
        Random random = new Random();
        String[] palabrasAleatorias = new String[PALABRAS_ALEATORIAS];
        for (int i = 0; i < PALABRAS_ALEATORIAS; i++) {
            palabrasAleatorias[i] = palabras[random.nextInt(palabras.length)];
        }
        return palabrasAleatorias;
    }
}

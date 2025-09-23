import java.util.Scanner;
public class Hola_personalizado {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;

        do {
            System.out.print("Introduce tu nombre: ");
            nombre = sc.nextLine().trim(); // quitamos espacios en blanco al inicio y al final

            if (nombre.isEmpty()) {
                System.out.println("El nombre no puede estar vacío.");
            }

        } while (nombre.isEmpty());

        // Saludo con el nombre introducido
        System.out.println("¡Hola, " + nombre + "!");
        
        sc.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("¡Hola Mundo desde CursoTalentoTech!");
        System.out.println("Java 21 detectado y funcionando.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Bienvenida " + nome);

    }
}

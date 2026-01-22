import java.util.Scanner;

public class UI {
    public static void main(String[] args) {
        // Initialisierung
        Scanner scanner = new Scanner(System.in);

        // Set lives
        Lifes lifes = new Lifes(3);

        // Eingabe
        int eingabe;


        System.out.println("Wilkommen beim Rechenspiel\ngeben sie das fehlende Teil des folgenden Terms an");

        // Gameloop
        while(lifes.getLifes() > 0) {
            // Aufgabe ausgeben

            // Nutzereingabe
            System.out.println("Ihre Antwort");
            eingabe = scanner.nextInt();

            // Validierung und Abzug der Leben
            if(/*Falsche Validierung*/) {
                lifes.loseLife();
            }
        }
    }
}

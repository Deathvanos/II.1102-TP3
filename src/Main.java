import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //SafeScanner();
        ASCII_art(1, 1);

    }

    /**
     * Exercice 1.2
     */
    public static void SafeScanner() {
        boolean inputValid = false;
        while(!inputValid) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("What is your age ?");
                int answer = sc.nextInt();
                System.out.printf("Your age is : " + answer);
                sc.close();
                inputValid = true;
            }
            catch (InputMismatchException e) {
                System.out.println("Erreur, recommencer");
            }
        }
    }

    public static void ASCII_art_xxx() {
        System.out.println("|\\---/|");
        System.out.println("| o_o |");
        System.out.println(" \\_^_/");

        System.out.println("");

        System.out.println("|\\-----/|");
        System.out.println("|       |");
        System.out.println("| o--_o |");
        System.out.println("|       |");
        System.out.println(" \\_^^^_/");
    }

    public static void ASCII_art(int height, int width) {

        // Variation de la longueur
        StringBuilder w1 = new StringBuilder("-");
        StringBuilder w2 = new StringBuilder("^");
        StringBuilder w3 = new StringBuilder(" ");
        for (int i = 0; i < width; i++) {
            w1.append("--");
            w2.append("^^");
            w3.append("  ");
        }

        // Variation de la hauteur
        StringBuilder h = new StringBuilder("|  " + w3 + "  |");
        for (int i = 0; i < height; i++) {
            h.append("\n|  ").append(w3).append("  |");
        }

        // Affichage du chat
        System.out.println("|\\--" + w1 + "/|"); // nb de - en w
        System.out.println(h); // nb de " " en h
        System.out.println("| o" + w1 + "o |"); // nb de - en w
        System.out.println(h); // nb de " " en h
        System.out.println(" \\_"+ w2 +"_/"); // nb de ^ en w
    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // user input
        System.out.println("Masukkan inputan sebuah kata: ");
        String inputString = scanner.nextLine();

        ReverseStringLetter reverseStringLetter = new ReverseStringLetter(inputString);

        // reverse string per huruf
        System.out.println("Kata inputan sebelum reverse: " + inputString);
        System.out.println("Kata inputan setelah reverse: " + reverseStringLetter.reverseString());

        System.out.println("Masukkan inputan sebuah kalimat: ");
        String inputStringKalimat = scanner.nextLine();

        ReverseStringWord reverseStringWord = new ReverseStringWord(inputStringKalimat);
        System.out.println("Kalimat inputan sebelum reverse: " + inputStringKalimat);
        System.out.println("Kalimat inputan setelah reverse: " + reverseStringWord.reverseString());
    }
}
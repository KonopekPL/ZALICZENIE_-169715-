//    Napisz program, który określa płeć osoby na podstawie jej PESEL-u:
//  - Program powinien wczytać numer PESEL wprowadzony przez użytkownika.
//  - Sprawdzić, jaka jest płeć osoby na podstawie numeru PESEL.
//  - Wyświetlić wynik.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj numer PESEL: ");
        String pesel = scanner.nextLine();

        if (isValidPesel(pesel)) {
            char genderDigit = pesel.charAt(9);
            String gender = (genderDigit % 2 == 0) ? "Kobieta" : "Mężczyzna";
            System.out.println("Płeć osoby o numerze PESEL " + pesel + " to: " + gender);
        } else {
            System.out.println("Nieprawidłowy numer PESEL.");
        }
    }

    private static boolean isValidPesel(String pesel) {
        return pesel.matches("\\d{11}");
    }
}

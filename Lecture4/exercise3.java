package lecture4_;

import java.util.Scanner;
import java.time.LocalDate;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String ime = scanner.nextLine();

        System.out.print("Enter your birth year: ");
        int godina = scanner.nextInt();

        int godina1 = LocalDate.now().getYear();
        int age = godina1 - godina;

        System.out.print("Enter your height in meters: ");
        double visinaVoMetri = scanner.nextDouble();

       double visinaVoCM = visinaVoMetri * 100;

        System.out.println("Name: " + ime);
        System.out.println("Age: " + age + " years");
        System.out.println("Height: " + visinaVoCM + " centimeters");

        scanner.close();
    }
}

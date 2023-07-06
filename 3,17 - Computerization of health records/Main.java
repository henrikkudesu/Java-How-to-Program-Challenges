package exercise3_17;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		;
		try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
			// try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter your name: ");
			String name = scanner.nextLine();

			System.out.println("Enter your surname: ");
			String surname = scanner.nextLine();

			System.out.println("Enter your birthday: ");
			int birthDay = scanner.nextInt();

			System.out.println("Enter your birth month: ");
			int birthMonth = scanner.nextInt();

			System.out.println("Enter your birth year:");
			int birthYear = scanner.nextInt();

			System.out.println("Enter the height (in meters, use dot to separate decimals): ");
			double tall = scanner.nextDouble();

			System.out.println("Enter the weight (in kilograms, use dot to separate decimals): ");
			double weight = scanner.nextDouble();

			HealthProfile profile = new HealthProfile(name, surname, birthDay, birthMonth, birthYear, tall, weight);

			// Imprimir informações
			System.out.println("Name: " + profile.getName());
			System.out.println("Surname: " + profile.getSurname());
			System.out.println("Date of Birth: " + profile.getBirthDay() + "/" + profile.getBirthMonth() + "/"
					+ profile.getBirthYear());
			System.out.println("Height: " + profile.getTall() + " meters");
			System.out.println("Weight: " + profile.getWeight() + " kilograms");
			System.out.println("Age: " + profile.ageCalc());
			System.out.println("Max Heart Rate: " + profile.calculateMaxHeartRate());
			System.out.println("Target Heart Rate: " + profile.calculateTargetHeartRate());
			System.out.println("Your BMI: " + profile.calculateBMI());
			System.out.println("__________ ");
			profile.displayBMIInfo();

		}

	}

}

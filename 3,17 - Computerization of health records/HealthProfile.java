package exercise3_17;

import java.time.LocalDate;
import java.time.Period;

public class HealthProfile {

	private String name;
	private String surname;
	private int birthDay;
	private int birthMonth;
	private int birthYear;
	private double tall;
	private double weight;

	public HealthProfile(String name, String surname, int birthDay, int birthMonth, int birthYear, double tall,
			double weight) {
		this.name = name;
		this.surname = surname;
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
		this.birthYear = birthYear;
		this.tall = tall;
		this.weight = weight;
	}

	// Calculador de idade
	public int ageCalc() {
		LocalDate currentDate = LocalDate.now();
		LocalDate anniversary = LocalDate.of(birthYear, birthMonth, birthDay);
		Period period = Period.between(anniversary, currentDate);

		return period.getYears();
	}

	// Calculador de frequência cardíaca máxima
	public int calculateMaxHeartRate() {
		int age = ageCalc();

		return 220 - age;
	}

	// Calculador de frequência cardíaca alvo
	public String calculateTargetHeartRate() {
		int maxHeartRate = calculateMaxHeartRate();
		int lowerRange = (int) (maxHeartRate * 0.5);
		int upperRange = (int) (maxHeartRate * 0.85);

		return lowerRange + "% - " + upperRange + "%";
	}

	// Calcula Índice de Massa Corporal
	public double calculateBMI() {
		double heightSquared = Math.pow(tall, 2);

		return weight / heightSquared;
	}

	// Avaliação do Índice de Massa Corporal
	public void displayBMIInfo() {
		double bmi = calculateBMI();

		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal: between 18.5 and 24.9");
		System.out.println("Overweight: between 25 and 29.9");
		System.out.println("Obese: 30 or greater");

		System.out.println("Your BMI is: " + bmi);

		if (bmi < 18.5) {
			System.out.println("You are underweight.");
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("Your weight is within the normal range.");
		} else if (bmi >= 25 && bmi <= 29.9) {
			System.out.println("Are you overweight.");
		} else {
			System.out.println("You are obese.");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public int getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public double getTall() {
		return tall;
	}

	public void setTall(double tall) {
		this.tall = tall;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}

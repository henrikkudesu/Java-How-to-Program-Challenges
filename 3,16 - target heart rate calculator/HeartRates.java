import java.time.LocalDate;
import java.time.Period;

public class HeartRates {

    private String name;
    private String surname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;

    public HeartRates(String name, String surname, int birthDay, int birthMonth, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
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

    // Getters e Setters
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

}
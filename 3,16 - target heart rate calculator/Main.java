public class Main {

    public static void main(String[] args) {

        HeartRates leo = new HeartRates("Leonardo", "Nascimento", 6, 9, 1996);

        System.out.println("Age: " + leo.ageCalc());
        System.out.println("Maximum Heart Rate: " + leo.calculateMaxHeartRate() + " bpm");
        System.out.println("Target Heart Rate Range: " + leo.calculateTargetHeartRate() + " bpm");

    }

}
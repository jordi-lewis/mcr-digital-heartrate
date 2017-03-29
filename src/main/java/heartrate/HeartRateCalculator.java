package heartrate;

import java.util.ArrayList;
import java.util.Scanner;

public class HeartRateCalculator {

    public static void main(String[] args) {
        HeartRateCalculator calculator = new HeartRateCalculator();
        calculator.calculateHeartRateIntensity();
        calculator.run();
    }

    ArrayList<Integer> intensity = new ArrayList<>();

    private void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter resting heart rate: ");
        String restingHeartRate = scanner.nextLine();
        System.out.print("Enter age: ");
        String age = scanner.nextLine();

        System.out.printf("Age: %s, Resting heart rate: %s\n", age, restingHeartRate);

        System.out.printf("Intensity\t| Heart rate\n");

        int TargetHeartRate;

        for (Integer intensity: intensity){

            System.out.println(intensity + "\n");
        }

        for (Integer intensityPercent: intensity){
            TargetHeartRate =+ (((220 - Integer.parseInt(age)) - Integer.parseInt(restingHeartRate)) * intensityPercent/100) + Integer.parseInt(restingHeartRate);
            System.out.println(TargetHeartRate + "\n");
        }

    }

    private void calculateHeartRateIntensity(){
        for (int i = 55; i <= 95; i ++){
            if (i % 5 == 0){
                intensity.add(i);
            }
        }
    }
}

import java.util.*;
public class roadRace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many racers?");
        int numRacers = scan.nextInt();
        scan.nextLine();
        runner[] runners = new runner[numRacers];
        for (int i = 0; i < numRacers; i++) {
            System.out.println("enter time for runner");
            int time = scan.nextInt();
            runners[i].setTime(time);
            scan.nextLine();

            System.out.println("enter gender (M/F) for runner");
            String gender = scan.nextLine();
            runners[i].setTime(gender);
        }

        int overallOne = 0;
        int overallTwo = 0;
        int femaleOne = 0;
        int femaleTwo = 0;
        int maleOne = 0;
        int maleTwo = 0;

        // overall
        int greatest = 0;
        for (int j = 0; j < numRacers; j++) {
            if (runners[j] != null && j = 0) {
                int overallOne = runners[j].getTime();
                greatest = ;
            }
            else if (runners[i] != null) {
                if (runners[i].getTime > overallOne) {
                    int overallOne = runners[i].getTime();
                }
            }
        }
    }
}

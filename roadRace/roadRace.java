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
            scan.nextLine();
            System.out.println("enter gender (M/F) for runner");
            String gender = scan.nextLine();
            runners[i] = new runner(time, gender);
        }

        // sort runners
        for (int i = 0; i < runners.length; i++) {
            for (int j = 0; j < runners.length-1; j++) {
                if (runners[j].getTime() > runners[j+1].getTime()) {
                    runner temp = new runner(runners[j].getTime(), runners[j].getGender());
                    runners[j] = runners[j+1];
                    runners[j+1] = temp;
                }
            }
        }

        // overall winner
        System.out.println("Overall winner #1: " + runners[0].getTime());
        // remove first 2 elements
        for (int i = 0; i < runners.length-2; i++) {
            runners[i] = runners[i+2];
        }

        boolean femaleFound = false;
        int fcounter = 0;
        while (femaleFound == false) {
            if (runners[fcounter].getGender().equals("F")) {
                System.out.println("female winner #1: " + runners[fcounter].getTime());
                femaleFound = true;
            }
            else {
                fcounter++;
            }
        }

        int nmf = 1;
        int mcounter = 0;
        while (nmf < 3) {
            if (runners[mcounter].getGender().equals("M")) {
                System.out.println("male winner #" + nmf + ": " + runners[mcounter].getTime());
                nmf++;
                mcounter++;
            }
            else {
                mcounter++;
            }
        }
    }
}

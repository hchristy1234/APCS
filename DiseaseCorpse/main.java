public class main {
    public static void main(String[] args){
        hospital();
    }

    public static void hospital(){
        Scanner nines = new Scanner(System.in);

        Image pill = new Image("pill bottle.png");
        Image bear = new Image("teddy bear.png");
        Image masks = new Image("masks.png");
        Image cylinder = new Image("graduated cylinder.png");
        Image sanitizer = new Image("hand sanitizer.png");
        Image hospitalShelf = new Image("hospital shelf.png");
        Image syrup = new Image("syrup bottle.png");
        Image mug = new Image("#1 boss mug.png");
        Image ointment = new Image("ointment.png");
        Image safe = new Image("safe.png");
        Image bag = new Image("paper bag.png");

        boolean runHospital = true;
        boolean enterCombo = true;
        boolean rightCombo = true;
        String guess;
        int slotCount = 1;
        hospitalShelf.show(true);

        int input;
        int input2;

        while (runHospital){
            System.out.println("Select an object to view");
            input = nines.nextInt();
            nines.nextLine();

            if (input == 1){
                System.out.println("A pill bottle:\nFull of yellow tablets with an odd perscription.");
                pill.show(true);
            }
            else if (input == 2){
                System.out.println("A box of masks:\nSingle-use, surgical mask with three layers.");
                masks.show(true);
            }
            else if (input == 3){
                System.out.println("A bottle of hand sanitizer:\nPurell advanced hand sanitizer 70% alcohol.");
                sanitizer.show(true);
            }
            else if (input == 4){
                System.out.println("A teddy bear:\nSlightly worn, well-loved.");
                bear.show(true);
            }
            else if (input == 5){
                System.out.println("A graduated cylinder:\nSeems to contain a viscous yellow liquid.");
                cylinder.show(true);
            }
            else if (input == 6){
                System.out.println("A plastic bottle:\nYou shake it. It is empty.");
                syrup.show(true);
            }
            else if (input == 7){
                System.out.println("A tube of ointment:\n9 oz large size tube.");
                ointment.show(true);
            }
            else if (input == 8){
                System.out.println("A mug:\nSays #1 boss. The coffee is still warm.");
                mug.show(true);
            }
            else if (input == 9){
                System.out.println("Pharmacy bag:\nNote says \"FOR PICKUP\"\nPerscription:\n1. Pills\n2. Ointment\n3. Cough Syrup");
                bag.show(true);
            }
            else if (input == 10){
                System.out.println("Locked cabinet:\nWhat you're looking for might be in this safe. Its door has three slots and is covered with drawings of shapes.");
                safe.show(true);
                System.out.println("Input code? Y/N");
                while(enterCombo){
                    if (nines.nextLine().equals("Y")){
                        while(slotCount <= 3){
                            System.out.println("Slot " + slotCount + ": ___");
                            guess = nines.nextLine();
                            if ((slotCount == 1 && (!guess.equals("triangle") && !guess.equals("trigon")))
                                || (slotCount == 2 && (!guess.equals("nonagon") && !guess.equals("enneagon") && !guess.equals("9-gon")))
                                || (slotCount == 3 && (!guess.equals("hexadecagon") && !guess.equals("hexakaidecagon") && !guess.equals("16-gon")))){
                                rightCombo = false;
                            }
                            slotCount++;
                        }
                        if (rightCombo){
                            System.out.println("Success! The safe door swings open.");
                            System.out.println("You pull out a vial containing a highly virulent sample of COVID-19 and put carefully store it away on your person. ");
                            enterCombo = false;
                        }
                        else{
                            System.out.println("The door doesn't budge.\nTry again? Y/N");
                        }
                        slotCount = 1;
                        rightCombo = true;
                    }
                    else{
                        enterCombo = false;
                    }
                }
            }

            System.out.println("Press 1 to exit");
            input2 = nines.nextInt();
            nines.nextLine();

            if (input2 == 1){
                input = 0;
                bear.show(false);
                pill.show(false);
                cylinder.show(false);
                sanitizer.show(false);
                masks.show(false);
                syrup.show(false);
                ointment.show(false);
                mug.show(false);
                bag.show(false);
                safe.show(false);
            }
        }

    }
}

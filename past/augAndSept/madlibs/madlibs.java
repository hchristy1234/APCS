import java.util.*;

public class madlibs {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("month");
    String month = scan.nextLine();
    
    System.out.println("number from 1-31");
    int day = scan.nextInt();
    scan.nextLine();
    
    System.out.println("female name");
    String name = scan.nextLine();
    
    System.out.println("number");
    int age = scan.nextInt();
    scan.nextLine();
    
    System.out.println("verb + ing");
    String action = scan.nextLine();
    
    System.out.println("clothing item (plural)");
    String clothing = scan.nextLine();
    
    System.out.println("animal");
    String boopAnimal = scan.nextLine();
    
    System.out.println("noun");
    String boopNoun = scan.nextLine();
    
    System.out.println("a sound");
    String sound = scan.nextLine();
    
    System.out.println("animal");
    String animal2 = scan.nextLine();
    
    System.out.println("animal");
    String animal3 = scan.nextLine();
    
    System.out.println("teacher name");
    String teacher = scan.nextLine();
    
    System.out.println("number");
    int hours = scan.nextInt();
    scan.nextLine();
    
    System.out.println("a social media");
    String sm1 = scan.nextLine();
    
    System.out.println("another social media");
    String sm2 = scan.nextLine();
    
    System.out.println("color");
    String eyeColor = scan.nextLine();
    
    System.out.println("number");
    int mathNum = scan.nextInt();
    scan.nextLine();
    int otherMathNum = mathNum - 1; // MODIFYING AN INPUT
    
    System.out.println("number");
    int price = scan.nextInt();
    scan.nextLine();
    
    System.out.println("color");
    String mechColor = scan.nextLine();
    
    System.out.println("a name");
    String friendName = scan.nextLine();
    
    System.out.println("a person's relation (e.g. mom, dad, friend, cousin)");
    String relation = scan.nextLine();
    
    System.out.println("flavor");
    String flavor = scan.nextLine();
    
    System.out.println("number");
    int backpackNum = scan.nextInt();
    scan.nextLine();
    
    System.out.println("plural noun");
    String backpackItem = scan.nextLine();
    
    System.out.println("plural animal");
    String animalPile = scan.nextLine();
    
    System.out.println("subject");
    String subject = scan.nextLine();
    
    System.out.println("body part");
    String bodyPart = scan.nextLine();
    
    System.out.println("number");
    int seconds = scan.nextInt();
    scan.nextLine();
    
    System.out.println("color");
    String octoColor = scan.nextLine();
    
    System.out.println("room number");
    String room = scan.nextLine();
    
    System.out.println("food");
    String home = scan.nextLine();
    
    System.out.println("\tToday is " +  month + " " + day + ", and " + name + " is turning " + age + " years old. " + name + " has just dreadfully arrived at school, ready for another delightful day of mental torture. In fact, she is so overjoyed that she is " + action + " from happiness. While " + name + " is " + action + ", her " + clothing + " suddenly fly off, causing her to flop into a puddle of decomposed " + boopAnimal + "-" + boopNoun + " concoction. However, " + name + " has no time left to spare. The warning bell (the one that sounds like an annoying " + sound + ") has just rung and she must make it to her first class, unless she wants to face the wrath of the snarling " + animal2 + ".");
    System.out.println("\t" + name + " is now sitting at the edge of her seat during math, hunched into the shape of a " + animal3 + ", ready to fast-walk to the board to solve the next problem. Today, " + teacher + " is in a bad mood, as he solemnly announces, \?Last week?s exam was the most tragic exam I?ve ever graded in my life.\? (true quote!). " + name + ", unable to keep her eyes open any longer, begins to drone off, since she only got " + hours + " hours of sleep last night, which was totally due to too much homework and definitely not because she was browsing " + sm1 + " and " + sm2 + " for too long. Suddenly, her " + eyeColor + " eyes light up as she notices " + teacher + " writing a problem on the board: " + mathNum + "-" + otherMathNum + "=?. " + name + ", unable to contain her excitement, jolts to the board, and shouts \?Zero!\? before she even makes it halfway there.");
    System.out.println("\tUnfortunately, " + name + " has forgotten that her shoes are still covered in " + boopAnimal + " remains, and as a result, slips, hits her head on " + teacher + "?s $" + price + " mechanical keyboard with " + mechColor + " switches, and falls into a deep concussion. Meanwhile, " + teacher + " laughs as he exclaims \"Zero does not equal one unless you?re on drugs!\? (another true quote!). As terrible as " + name + "?s fall is, " + friendName + ", " + name + "?s " + relation + ", knows " + name + " well enough to know that her favorite drink is " + flavor + " milk tea with boba. " + friendName + " pulls out a cup of " + flavor + " milk tea with boba from his hat and waves it in front of " + name + "?s nose, magically reviving her. Now that " + name + " has been revived, she sadly has no more excuse for missing class and must trudge along to her next class, " + subject + ", while carrying her extremely heavy backpack which holds " + backpackNum + " " + backpackItem + "."); 
    System.out.println("\tBefore she makes it to her next class, she runs into a pile of " + animalPile + " and falls in " + bodyPart + "-first. How unfortunate. No one cares though. She forces herself up and enters the classroom with " + seconds + " seconds to spare. Phew! What she sees in the classroom doesn?t come as a surprise. Cute " + octoColor + " octocats fly in circles around the students. Three students debate about milk first or cereal first (milk, obviously). Four labrador retrievers (the best dog breed <3) race around the room. Just another typical day in room " + room + ". Soon, the bell rings and it?s time to head back to " + home + " mountain, where " + name + " gets to eat unlimited " + home + "s. " + name + "?s birthday was indeed a blast!");
  }
}

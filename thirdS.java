import java.util.*;
public class thirdS {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String find = scan.nextLine();
       int counter = 0;
       int indexcounter = 0;
       int sindex = 0;
       while (counter != 3) {
           sindex = find.indexOf("s");
           indexcounter+=(sindex+1);
           find = find.substring(sindex+1);
           counter++;
       }
       System.out.println(indexcounter-1);
   } 
}

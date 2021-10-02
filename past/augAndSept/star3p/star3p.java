import java.util.*;

public class star3p
{
  public static void main(String[] args)
  {
    Scanner dog = new Scanner(System.in);

    System.out.println("How many rows do you want?");
    int x = dog.nextInt();
    dog.nextLine();

    for (int i = 1; i<=x; i++)
    {

      //prints out spaces
      for (int j = 1; j<=x-i; j++)
      {
       System.out.print(" "); 
      }

      //prints out Xs
      for (int k = 0 ; k <= (2*(i-1)); k++)
      {
        System.out.print("X");
      }
      System.out.println();
  }
}
}
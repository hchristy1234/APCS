import java.util.*;
import java.io.*;
public class advancedMadlibs {
    public static void main(String[] args) {
        try {  
            FileWriter myWriter = new FileWriter("advancedMadlibsWriter.txt");
            // story is a paragraph from the davinci code
            File myObj = new File("C:/Christy/Coding/APCS/advancedMadlibsStory.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                for (int i = 0; i < data.length()-6; i++) {
                    if (data.substring(i, i+6).equals("Sophie")) {
                        data = data.substring(0, i) + "Christy" + data.substring(i+6, data.length()-1);
                    }
                }
                myWriter.write(data + "\n");
            }
            myWriter.close();
            myReader.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.exit(0);
    }
}

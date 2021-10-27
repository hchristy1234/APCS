public class oct27 {
    public static void main(String[] args) {
        // shoe x;
        // this has no values
        // cannot user getter / setter / methods

        // to make a shoe with no values
        // shoe x = null;
        // you can use getter / setter / methods. ( you'll get junk though when getting stuff )

        // gets "port"
        String sport = "sportsauthority";
        String sub = sport.substring(1, 5);
        // gets "port thor"
        String portthor = sport.substring(1, 5) + " " + sport.substring(8, 12);

        // counts how many "i" there are in the word
        int counter = 0;
        String word = "Mississippi";
        while (word != "") {
            int j = word.indexOf("i");
            word = word.substring(j+1);
            counter++;
        }

        // patrick is 16. christy is 3. difference is 13.
        System.out.println("patrick".compareTo("christy"));

        // o is 15, y is 25. 15-25 = -10
        System.out.println("christopher".compareTo("christy"));

        // 3 + 4 + "troll" + 3 + 4
        // 7troll34

        // 3 + 3 + "MJ" + (20 + 3)
        // 6MJ23

        String miss = "Mississippi"; //doesnt work
        int count = 0;
        for(int c = 0; c<miss.length(); c++) {
            if(miss.substring(c,c+1) == "i") {
                count++;
            }
        }
        System.out.println(count);
    }

    }
}

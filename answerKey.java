public class answerKey {
    public static void main(String[] args) {
        String[] key = {"a", "a", "b", "b"};
        String[] answers = {"a", "a", "b", "b"};
        System.out.println(scoreUp(key, answers));
    }
    public static int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for (int i = 0; i < key.length; i++) {
            if (key[i].equals(answers[i])) {
                score+=4;
            }
            else {
                if (answers[i].equals("?")) {
                    score+=0;
                }
                else {
                    score-=1;
                }
            }
        }
        return score;
    }
}

import java.util.Random;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Random ForRandom = new Random();
        Random CharRandom = new Random();
        Scanner Input = new Scanner(System.in);
        while (true)  {
            int i = ForRandom.nextInt(1000);
            char[] Answer = new char[i];
            Input.nextLine();
            for (int a = 0; a < i; a++) {
                int x = CharRandom.nextInt(1103 - 1040 + 1) + 1040;
                Answer[a] = (char) x;
            }
            String CharTr = new String(Answer);
            System.out.println(CharTr);
        }
    }
}
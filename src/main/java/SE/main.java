package SE;

import java.io.InputStreamReader;
import java.io.*;
public class main {
    public static void main(String[] args) {
        System.out.print("Enetr the score = ");
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int score = Integer.parseInt(br.readLine());
            SE_Class SE = new SE_Class();
            char grade = SE.letterGrade(score);
            System.out.println("The grade of " + score + " is " + grade);
        } catch (NumberFormatException ex) {
            System.out.println("Not an integer!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
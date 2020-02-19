import java.util.*;
/**
 * Write a description of class Hang_man here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hang_man
{
    public static char g1;
    public static boolean c1 = true;
    public static char charAt;
    public static void main(){
        System.out.println("Put the word you want to play with");
        Scanner in = new Scanner(System.in);
        String phrase = in.nextLine();
        String word = phrase;
        phrase = phrase.toLowerCase();
        String under = "";
        int count = 0;
        for(int i = 0; i < phrase.length(); i++){
            if(phrase.charAt(i) == ' ')
            {
                under += " ";
            }
            else
                under += "_";
        }
        System.out.print("\f");
        char[] answer = under.toCharArray();
        System.out.println(answer);

        while (underscoreCheck(answer) && count < 7)
        {
            System.out.println("enter a character: ");
            String guess1 = in.next().toLowerCase();
            char guess = guess1.charAt(0);
            boolean right = false;

            if(count == 7)
            {
                System.out.println("You have lost the man.... What have you done!");
            }
            for(int i = 0; i < phrase.length(); i++){
                if(phrase.charAt(i) == guess){
                    answer[i] = guess;
                    right = true;
                }
            }
            if (right == false)
            {
                System.out.println("The game");
                count ++;
            }
            if(count == 0){
                System.out.println("----------");
                System.out.println("|       |");
                System.out.println("|       |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("---------");
            }
            if(count == 1){
                System.out.println("----------");
                System.out.println("|       |");
                System.out.println("|       |");
                System.out.println("|      ( )");
                System.out.println("|       ");
                System.out.println("|");
                System.out.println("|");
                System.out.println("---------");
            }
            if(count == 2){
                System.out.println("----------");
                System.out.println("|       |");
                System.out.println("|       |");
                System.out.println("|      ( )");
                System.out.println("|       |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("---------");
            }
            if(count == 3){
                System.out.println("----------");
                System.out.println("|       |");
                System.out.println("|       |");
                System.out.println("|      ( )");
                System.out.println("|      /|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("---------");
            }
            if(count == 4){
                System.out.println("----------");
                System.out.println("|       |");
                System.out.println("|       |");
                System.out.println("|      ( )");
                System.out.println("|      /|\\");
                System.out.println("|");
                System.out.println("|");
                System.out.println("---------");
            }
            if(count == 5){
                System.out.println("----------");
                System.out.println("|       |");
                System.out.println("|       |");
                System.out.println("|      ( )");
                System.out.println("|      /|\\");
                System.out.println("|      /");
                System.out.println("|");
                System.out.println("---------");
            }
            if(count == 6){
                System.out.println("----------");
                System.out.println("|       |");
                System.out.println("|       |");
                System.out.println("|      ( )");
                System.out.println("|      /|\\");
                System.out.println("|      / \\");
                System.out.println("|");
                System.out.println("---------");
            }
            System.out.println(answer);
            if(count == 7)
            {
                System.out.println("You lost.");
                System.out.println(word);
            }
        }
    }

    public static boolean underscoreCheck(char[] u)
    {
        for(char c: u)
        {
            if(c == '_')
                return true;
        }
        return false;
    }

}

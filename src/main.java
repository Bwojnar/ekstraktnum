/**
 * Created by bwojn on 14.11.2017.
 */
import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        String str;
        String numery;

        Scanner SC=new Scanner(System.in);

        System.out.print("Podaj ciag: ");
        str=SC.nextLine();

        numery=str.replaceAll("[^0-9]", "");

        System.out.println("Numery: " + numery);
    }
}

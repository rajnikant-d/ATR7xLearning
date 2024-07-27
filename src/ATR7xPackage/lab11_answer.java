package ATR7xPackage;
import java.util.Scanner;

public class lab11_answer {
    public static void main(String[] args) {
        int[][] pattern = new int[5][5];
        for (int i = 0; i < pattern.length; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print('*');
            }
            System.out.println();


        }
    }
}

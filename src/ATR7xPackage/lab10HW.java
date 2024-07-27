package ATR7xPackage;

public class lab10HW {
    public static void main(String[] args) {


        //Right Triangle Star Pattern using array

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

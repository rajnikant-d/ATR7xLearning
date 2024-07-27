package ATR7xPackage;

public class lab11HW_pattern2 {
    public static void main(String[] args) {
        //Left Triangle Star Pattern using Array

        int[][] left_traingle_pattern= new int[5][5];

        for (int i = 0; left_traingle_pattern.length > i; i++)
        {
            for (int j = 0; left_traingle_pattern.length > j ; j++) {
                if (j >= i) {
                    System.out.print('*');

                }
            }
            System.out.println();

        }


    }
}

package ATR7xPackage;

import java.util.Arrays;

public class lab9ArrayHW {
    public static void main(String[] args) {

        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};

        int max = salaries[0];
        int max_index = 0;
        int second_Highest_Salary = salaries[0];

        for (int i = 0; i < salaries.length; i++) {
            if(salaries[i]>max){
                max=salaries[i];
            }

        }
            System.out.println(max);
            //System.out.println(index.max[]);



        // Find 2nd highest salary by sort
        Arrays.sort(salaries);
        System.out.println("2nd Highest salary from the array by sorting is"+salaries[salaries.length-2]);

    }
}

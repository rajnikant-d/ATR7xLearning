package ATR7xPackage;

import java.util.Scanner;

public class lab07Array {
    public static void main(String[] args) {
        int[] classes = new int[7];
        System.out.println(classes[1]);
        Scanner sc = new Scanner(System.in);
        //System.out.println(classes);
        classes[3] = sc.nextInt();
        System.out.println(classes[3]);
    }
}

package task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100) + 1;
        }

        try {
            int a = in.nextInt();
            System.out.println(array[a]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("out");
        }
    }
}
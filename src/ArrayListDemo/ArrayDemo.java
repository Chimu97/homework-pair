package ArrayListDemo;

import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args){
        int[] numbers = new int[5];
        int[] numbers2 = {10, 3, 33, 89, 90};

        Random random = new Random();
        int j = 0;
        for (int i:numbers){
            numbers[i] = random.nextInt(1000);
            System.out.println("Element " + i + " is " + numbers[i]);

        }

        numbers[0] = 999;

        System.out.println("numbers[0] is " + numbers[0]);
    }
}

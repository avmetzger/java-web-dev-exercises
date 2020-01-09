package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
        int[] fibonacci = {1, 1, 2, 3, 5, 8, 13};
        for (int num : fibonacci){
            if (num % 2 == 0){
                continue;
            }
            System.out.println(num);
        }
        String greenEggs = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitEggs = greenEggs.split("\\. ");
        System.out.println(Arrays.toString(splitEggs));
    }
}

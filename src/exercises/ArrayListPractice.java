package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
    public static Integer addEvens(List<Integer> list) {
        Integer sum = 0;
        for(Integer num : list){
            if(num % 2 == 0){
                sum += num;
            }
        }
        return sum;
    }
    public static void printEach5Char(List<String> list){
        for(String word : list) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> fibonacci = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        fibonacci.add(1);
        fibonacci.add(1);
        fibonacci.add(2);
        fibonacci.add(3);
        fibonacci.add(5);
        fibonacci.add(8);
        fibonacci.add(13);
        fibonacci.add(21);
        fibonacci.add(34);
        fibonacci.add(55);
        System.out.println(ArrayListPractice.addEvens(fibonacci));
        List<String> words = new ArrayList<>();
        words.add("It");
        words.add("was");
        words.add("the");
        words.add("best");
        words.add("of");
        words.add("times");
        words.add("it");
        words.add("was");
        words.add("the");
        words.add("worst");
        words.add("of");
        words.add("times");
        ArrayListPractice.printEach5Char(words);
        List<String> newList = new ArrayList<>();

        String newWord;
        do {
            newWord = input.nextLine();
            if(newWord.equals("")){
                break;
            } else{
                newList.add(newWord);
            }
        } while (!newWord.equals(""));
        ArrayListPractice.printEach5Char(newList);
        String greenEggs = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitEggs = greenEggs.split(" ");
        List<String> eggArrayList = new ArrayList<>();
        for (String eggs : splitEggs){
            eggArrayList.add(eggs);
        }
        ArrayListPractice.printEach5Char(eggArrayList);
    }
}

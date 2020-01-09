package exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args){
        Map<Integer, String> newMap = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer idNum = 0;
        String studentName;
        do {
            System.out.println("Enter ID number: ");
            idNum = input.nextInt();
            input.nextLine();
            System.out.println("Enter Name (leave blank to end): ");
            studentName = input.nextLine();
            if(studentName.equals("")){
                break;
            }else {
                newMap.put(idNum, studentName);
            }
        } while (!studentName.equals(""));
        input.close();
        for (Map.Entry<Integer, String> eachStudent : newMap.entrySet()) {
            System.out.println("ID: " + eachStudent.getKey() + " Name: " + eachStudent.getValue());
        }
    }
}

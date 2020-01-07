package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("Enter a search term for the first sentence of Lewis Caroll's Alice in Wonderland:");
        String searchTerm = input.nextLine();
        if(firstSentence.toLowerCase().contains(searchTerm.toLowerCase())){
            System.out.println("True; the term is included.");
            int occurance = firstSentence.toLowerCase().indexOf(searchTerm.toLowerCase());
            System.out.println("The index of its first occurence is " + occurance +
                " and the length is " + searchTerm.length());
            String extractedSentence = firstSentence.substring(0,occurance).concat(firstSentence.substring(occurance + searchTerm.length()));
            System.out.println(extractedSentence);
        } else {
            System.out.println("False; the term is not included.");
        }
    }
}

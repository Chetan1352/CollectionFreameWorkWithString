/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package amstack.minorprojectamstech;

import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author Asus
 */
public class MinorProjectamstech {

    public static void main(String[] args) throws FileNotFoundException {
         String inputString = FileOperations.getInput("C:\\Users\\Asus\\OneDrive\\Documents\\NetBeansProjects\\MinorProjectamstech\\src\\main\\java\\amstack\\minorprojectamstech\\input.txt");
        inputString = DataOperations.removeSymbols(inputString);
        inputString = DataOperations.removeStopwords(inputString);
        System.out.println("************ Input String ************");
        UserOperations.print(inputString);
        System.out.println("************ WordList ************");
        ArrayList<String> wordList = UserOperations.getInputWordList(inputString);
        UserOperations.print(wordList);
        System.out.println("************ Unique WordList ************");
        TreeSet<String> uniqueWordList = UserOperations.getUniqueWordList(wordList);
        UserOperations.print(uniqueWordList);
        System.out.println("************ WordCount ************");
        String wordCount[][] = UserOperations.getWordCount(wordList, uniqueWordList);
        UserOperations.printWordCount(wordCount);
        System.out.println("************ Char Count ************");
        char charCount[][] = UserOperations.getCharCount(wordList);
        UserOperations.printCharCount(charCount);
        System.out.println("************ Top5 Count ************");
        String top5[][] = UserOperations.getTop5WordList(wordCount);
        UserOperations.printWordCount(top5);
        System.out.println("************ Top10 Count ************");
        String top10[][] = UserOperations.getTop10WordList(wordCount);
        UserOperations.printWordCount(top10);
        System.out.println("************ Bottom5 Count ************");
        String bottom5[][] = UserOperations.getBottom5WordList(wordCount);
        UserOperations.printWordCount(bottom5);
        System.out.println("************ Bottom10 Count ************");
        String bottom10[][] = UserOperations.getBottom10WordList(wordCount);
        UserOperations.printWordCount(bottom10);
        System.out.println("************ Top5 Count ************");
        char top5Char[][] = UserOperations.getTop5charList(charCount);
        UserOperations.printCharCount(top5Char);
        System.out.println("************ Top10 Count ************");
        char top10Char[][] = UserOperations.getTop10charList(charCount);
        UserOperations.printCharCount(top10Char);
        System.out.println("************ Bottom5 Count ************");
        char bottom5Char[][] = UserOperations.getBottom5charList(charCount);
        UserOperations.printCharCount(bottom5Char);
        System.out.println("************ Bottom10 Count ************");
        char bottom10Char[][] = UserOperations.getBottom10charList(charCount);
        UserOperations.printCharCount(bottom10Char);

    
    }
}

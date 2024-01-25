/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package amstack.minorprojectamstech;

import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author Asus
 */
public class DataOperations {

    public static String removeSymbols(String inputString) throws FileNotFoundException {
        ArrayList<Character> symbolList = FileOperations.getsymbolsList("C:\\Users\\Asus\\OneDrive\\Documents\\NetBeansProjects\\MinorProjectamstech\\src\\main\\java\\amstack\\minorprojectamstech\\symbols.txt");
        ArrayList<Character> inputlist = new ArrayList<>();
        char ch[] = inputString.toCharArray();

        for (char string : ch) {
            inputlist.add(string);
        }

        inputlist.removeAll(symbolList);
        String str = "";

        for (Character c : inputlist) {
            str = str + String.valueOf(c);
        }

        return str;
    }
    
  public static String removeStopwords(String inputString) throws FileNotFoundException {
        String stringArray[] = inputString.split(" ");
        ArrayList<String> stringList = new ArrayList();

        for (String c : stringArray) {
            stringList.add(c);
        }
        ArrayList<String> stopwordList = FileOperations.getStopWords("C:\\Users\\Asus\\OneDrive\\Documents\\NetBeansProjects\\MinorProjectamstech\\src\\main\\java\\amstack\\minorprojectamstech\\stopwords.txt");
        stringList.removeAll(stopwordList);
        inputString = "";
        for (String str : stringList) {
            inputString = inputString + str+" ";
        }
        return inputString;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package amstack.minorprojectamstech;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class FileOperations {

    public static String getInput(String filepath) throws FileNotFoundException {
        File file = new File(filepath);
        Scanner sc = new Scanner(file);
        String inputString = "";

        while (sc.hasNext()) {
            inputString = inputString + sc.next() + " ";
        }

        return inputString.toLowerCase();
    }

    public static ArrayList<Character> getsymbolsList(String filepath) throws FileNotFoundException {
        File file = new File(filepath);
        Scanner sc = new Scanner(file);
        ArrayList<Character> symbolList = new ArrayList<>();

        while (sc.hasNext()) {
            symbolList.add(sc.next().charAt(0));
        }
        return symbolList;

    }

    public static ArrayList<String> getStopWords(String filepath) throws FileNotFoundException {
        File file = new File(filepath);
        Scanner sc = new Scanner(file);
        ArrayList<String> stopWords = new ArrayList<>();
        while (sc.hasNext()) {
            stopWords.add(sc.next());
        }
        return stopWords;

    }

    public static ArrayList<String> getWordList(String input) {
        String inputString[] = input.split(" ");
        ArrayList<String> wordList = new ArrayList<>();
        wordList.addAll(Arrays.asList(inputString));
        return wordList;
    }

}

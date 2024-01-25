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
public class UserOperations {

 public static void printAll(Collection<String>list)
 {
     for(String string:list)
     {
         System.out.println(string);
     }
 }
  public static void printAll(String[][] list) {
        for (String[] strings : list) {
            System.out.println(strings[0] + " " + strings[1]);
        }
    }
  public static ArrayList<String> getInputWordList(String inputString) {
        String stringArray[] = inputString.split(" ");
        ArrayList<String> stringList = new ArrayList();

        for (String c : stringArray) {
            stringList.add(c);
        }
        return stringList;
    }
  
   public static TreeSet<String> getUniqueWordList(ArrayList<String> wordList) {
        return new TreeSet<>(wordList);
    }
   
   public static String[][] getWordCount(ArrayList<String>inputWordList,TreeSet<String>uniqueWordList)
   {
       String[][]wordCount=new String[uniqueWordList.size()][2]; 
       int row=0;
       for(String string:inputWordList)
       {
           int count=Collections.frequency(inputWordList, string);
           wordCount[row][0]=string;
           wordCount [row][1]=String.valueOf(count);
           row++;
       }
       return wordCount;
   }
   public static char[][] getCharCount(ArrayList<String> inputWordList) {
        char[][] charCount = new char[26][2];
        String input = "";
        for (String string : inputWordList) {
            input = input + string;
        }
        char[] inputArray = input.toCharArray();
        ArrayList<String> inputCharList = new ArrayList<String>();
        for (char c : inputArray) {
            inputCharList.add(String.valueOf(c));
        }
        int row = 0;
        for (int i = 97; i <= 122; i++) {
            char c = (char) i;
            int count = Collections.frequency(inputCharList, String.valueOf(c));
            charCount[row][0] = c;
            charCount[row][1] = (char) count;
            row++;
        }

        return charCount;
    }

    public static void print(String input) {
        System.out.println(input);
    }

    public static void print(Collection<String> inputList) {
        for (String string : inputList) {
            System.out.println(string);
        }
    }

    public static void printChar(ArrayList<Character> inputList) {
        for (char c : inputList) {
            System.out.println(c);
        }
    }

    public static void printWordCount(String[][] wordCount) {
        for (String string[] : wordCount) {
            System.out.println(string[0] + " " + Integer.parseInt(string[1]));
        }
    }

    public static void printCharCount(char[][] charCount) {
        for (char ch[] : charCount) {
            System.out.println(ch[0] + " " + (int) ch[1]);
        }
    }

    public static String[][] getTop5WordList(String[][] wordCount) {
        String[][] top5 = new String[5][2];
        for (int i = 0; i < wordCount.length; i++) {
            for (int j = i; j < wordCount.length; j++) {
                int value1 = Integer.parseInt(wordCount[i][1]);
                int value2 = Integer.parseInt(wordCount[j][1]);
                if (value1 < value2) {
                    String temp = wordCount[i][0];
                    wordCount[i][0] = wordCount[j][0];
                    wordCount[j][0] = temp;

                    temp = wordCount[i][1];
                    wordCount[i][1] = wordCount[j][1];
                    wordCount[j][1] = temp;
                }

                for (int k = 0; k < 5; k++) {
                    top5[k][0] = wordCount[k][0];
                    top5[k][1] = wordCount[k][1];
                }

            }
        }
        return top5;

    }

    public static String[][] getTop10WordList(String[][] wordCount) {
        String[][] top10 = new String[10][2];
        for (int i = 0; i < wordCount.length; i++) {
            for (int j = i; j < wordCount.length; j++) {
                int value1 = Integer.parseInt(wordCount[i][1]);
                int value2 = Integer.parseInt(wordCount[j][1]);
                if (value1 < value2) {
                    String temp = wordCount[i][0];
                    wordCount[i][0] = wordCount[j][0];
                    wordCount[j][0] = temp;

                    temp = wordCount[i][1];
                    wordCount[i][1] = wordCount[j][1];
                    wordCount[j][1] = temp;
                }

                for (int k = 0; k < 10; k++) {
                    top10[k][0] = wordCount[k][0];
                    top10[k][1] = wordCount[k][1];
                }

            }
        }
        return top10;

    }

    public static String[][] getBottom5WordList(String[][] wordCount) {
        String[][] bottom5 = new String[5][2];
        for (int i = 0; i < wordCount.length; i++) {
            for (int j = i; j < wordCount.length; j++) {
                int value1 = Integer.parseInt(wordCount[i][1]);
                int value2 = Integer.parseInt(wordCount[j][1]);
                if (value1 > value2) {
                    String temp = wordCount[i][0];
                    wordCount[i][0] = wordCount[j][0];
                    wordCount[j][0] = temp;

                    temp = wordCount[i][1];
                    wordCount[i][1] = wordCount[j][1];
                    wordCount[j][1] = temp;
                }

                for (int k = 0; k < 5; k++) {
                    bottom5[k][0] = wordCount[k][0];
                    bottom5[k][1] = wordCount[k][1];
                }

            }
        }
        return bottom5;

    }

    public static String[][] getBottom10WordList(String[][] wordCount) {
        String[][] bottom10 = new String[10][2];
        for (int i = 0; i < wordCount.length; i++) {
            for (int j = i; j < wordCount.length; j++) {
                int value1 = Integer.parseInt(wordCount[i][1]);
                int value2 = Integer.parseInt(wordCount[j][1]);
                if (value1 > value2) {
                    String temp = wordCount[i][0];
                    wordCount[i][0] = wordCount[j][0];
                    wordCount[j][0] = temp;

                    temp = wordCount[i][1];
                    wordCount[i][1] = wordCount[j][1];
                    wordCount[j][1] = temp;
                }

                for (int k = 0; k < 10; k++) {
                    bottom10[k][0] = wordCount[k][0];
                    bottom10[k][1] = wordCount[k][1];
                }

            }
        }
        return bottom10;

    }
 
    public static char[][] getTop5charList(char[][] charCount) {
        char[][] top5 = new char[5][2];
        for (int i = 0; i < charCount.length; i++) {
            for (int j = i; j < charCount.length; j++) {
                int value1 = (int)(charCount[i][1]);
                int value2 = (int)(charCount[j][1]);
                if (value1 < value2) {
                    char temp = charCount[i][0];
                    charCount[i][0] = charCount[j][0];
                    charCount[j][0] = temp;

                    temp = charCount[i][1];
                    charCount[i][1] = charCount[j][1];
                    charCount[j][1] = temp;
                }

                for (int k = 0; k < 5; k++) {
                    top5[k][0] = charCount[k][0];
                    top5[k][1] = charCount[k][1];
                }

            }
        }
        return top5;

    }

    public static char[][] getTop10charList(char[][] charCount) {
        char[][] top10 = new char[10][2];
        for (int i = 0; i < charCount.length; i++) {
            for (int j = i; j < charCount.length; j++) {
                int value1 = (int)(charCount[i][1]);
                int value2 = (int)(charCount[j][1]);
                if (value1 < value2) {
                    char temp = charCount[i][0];
                    charCount[i][0] = charCount[j][0];
                    charCount[j][0] = temp;

                    temp = charCount[i][1];
                    charCount[i][1] = charCount[j][1];
                    charCount[j][1] = temp;
                }

                for (int k = 0; k < 10; k++) {
                    top10[k][0] = charCount[k][0];
                    top10[k][1] = charCount[k][1];
                }

            }
        }
        return top10;

    }

    public static char[][] getBottom5charList(char[][] charCount) {
        char[][] bottom5 = new char[5][2];
        for (int i = 0; i < charCount.length; i++) {
            for (int j = i; j < charCount.length; j++) {
                int value1 = (int)(charCount[i][1]);
                int value2 = (int)(charCount[j][1]);
                if (value1 > value2) {
                    char temp = charCount[i][0];
                    charCount[i][0] = charCount[j][0];
                    charCount[j][0] = temp;

                    temp = charCount[i][1];
                    charCount[i][1] = charCount[j][1];
                    charCount[j][1] = temp;
                }

                for (int k = 0; k < 5; k++) {
                    bottom5[k][0] = charCount[k][0];
                    bottom5[k][1] = charCount[k][1];
                }

            }
        }
        return bottom5;

    }

    public static char[][] getBottom10charList(char[][] charCount) {
        char[][] bottom10 = new char[10][2];
        for (int i = 0; i < charCount.length; i++) {
            for (int j = i; j < charCount.length; j++) {
                int value1 = (int)(charCount[i][1]);
                int value2 = (int)(charCount[j][1]);
                if (value1 > value2) {
                    char temp = charCount[i][0];
                    charCount[i][0] = charCount[j][0];
                    charCount[j][0] = temp;

                    temp = charCount[i][1];
                    charCount[i][1] = charCount[j][1];
                    charCount[j][1] = temp;
                }

                for (int k = 0; k < 10; k++) {
                    bottom10[k][0] = charCount[k][0];
                    bottom10[k][1] = charCount[k][1];
                }

            }
        }
        return bottom10;

    }
   
}

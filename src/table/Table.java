/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mad Max
 */
public class Table {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static void main(String[] args) {

    int correctAnswers = 0;
    int Answers = 0;
    Random numGenerator = new Random();
    Scanner inputScanner = new Scanner(System.in);
    int[] nums =  new int[2];

    while(Answers != 5) {
        nums[0] = numGenerator.nextInt(9)+1;
        nums[1] = numGenerator.nextInt(9)+1;
        System.out.print(nums[0]+" * "+nums[1]+" = ");
        int answer = inputScanner.nextInt();
        ++Answers;
        if(answer == nums[0]*nums[1]) {
            System.out.println(ANSI_GREEN + "Правильно!" + ANSI_RESET);
            ++correctAnswers;
        }
        else

            System.out.println(ANSI_RED + "Неправильно!" + ANSI_RESET);
    }
    System.out.println("правильных ответов: " + correctAnswers);
    
    if (correctAnswers > 5) 
        System.out.println("о_О");
    
    else if(correctAnswers > 4)
            System.out.println("Молодец!");
    else if(correctAnswers > 3)
            System.out.println("Надо бы еще подучить");
    else if(correctAnswers > 2)
            System.out.println("Надо бы еще подучить");
    else if(correctAnswers > 1)
            System.out.println("-_-");
    else if(correctAnswers < 2)
            System.out.println("Иди учить, бездарь");
    }
}

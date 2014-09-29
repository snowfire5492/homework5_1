package homework5_1_1;

/* 
 * Chapter No. 5    Excercise No. 1
 * File Name: HomeWork5_1_1.java
 * @author: Eric Schenck
 * Date: September 29, 2012
 * 
 * 
 * Problem Statement: Write a program that takes a one-line sentence as input
 * and outputs the following response: If the sentence ends with a question 
 * mark '?' and the input contains an even number of characters, then output
 * the word "Yes". If the sentence ends with a question mark '?' and the input
 * contains an odd number of characters, then output the word "No". If the 
 * sentence ends with an exclamation mark '!', output the word "Wow". In all
 * other cases, your program will output the string "You always say" followed
 * by the input string ENCLOSED IN QUOTES. your output should all be on one line
 * 
 * Also: Be sure to note that in the last case, your output must include 
 * quotation marks around the echoed input string. In all other cases, there 
 * are no quotes in the output. Your program does not have to check the input
 * to see that the user has entered a legitimate sentence. Test your program
 * with at least 4 strings of different lengths and ending punctuation.
 * 
 * Overall plan:
 * 1.) save the user input to a string
 * 2.) use the length method to return the length of the input
 * 3.) use the charAt(length - 1) to return the last character of the input
 * 4.) construct a series of if-else statements to compare the user input
 * to the specified instructions.
 * 5.) Print out the appropriate message
 *
 * 
 */
import java.util.Scanner;


public class HomeWork5_1_1 
{

  
    public static void main(String[] args) 
    {
        //create new scanner object called keyboard
        Scanner keyboard = new Scanner(System.in);
     
        //print out a short message informing the user to input a sentence
        System.out.println("Please input a one-line sentence with or without"
                + " question marks, or exclamation marks:");
        
        //set the user's sentence equal to the string userInput
        String userInput = keyboard.nextLine();
        
        //return the length of the userInput
        int inputLength = userInput.length();
        
        //return the last character of the userInput
        char lastChar = userInput.charAt(inputLength - 1);
        
        //compare the length and last character of the input to the req. specs.
        if (inputLength % 2 == 0 && lastChar == '?')
            {
                System.out.println("Yes");
            }
        else if (inputLength % 2 != 0  && lastChar == '?')
            {
                System.out.println("No");
            }
        else if (lastChar == '!')
            {
                System.out.println("Wow");
            }
        else 
            {
                System.out.println("You always say " + "'" + userInput + "'");
            }
        
       
    }// end of main
}// end of public class HomeWork5_1_1

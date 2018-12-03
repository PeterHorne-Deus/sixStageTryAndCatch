/*
 * Peter Horne-Deus 
 * This program has the user go through 6 stages of things to do 
 * SixStageTryAndCatch.java
 * Novemeber 28, 2018
 */

package sixstagetryandcatch;
    

import javax.swing.*;
/**
 *
 * @author pehor9164
 */

public class SixStageTryAndCatch {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        String userEnteredString = "test";
        int stage = 0;
        int error = 0;
        int userEnteredInt;
        
        if (stage == 0){
            System.out.println("You will be prompted each stage to enter different info \n"
                    + "You will then enter the correct info and move on \n"
                    + "Try to get all the questions right on the first try");
            
            stage = 1;
        }
        if(stage == 1){
            while (stage == 1){
                try{
                    
                    userEnteredString = JOptionPane.showInputDialog("Enter a string with atleast 6 characters");
                    
                    
                    if(userEnteredString.length() >= 6 ){
                        if (userEnteredString.contains("1")||userEnteredString.contains("2")||userEnteredString.contains("3")||userEnteredString.contains("4")||userEnteredString.contains("5")||userEnteredString.contains("6")||userEnteredString.contains("7")||userEnteredString.contains("8")||userEnteredString.contains("9")||userEnteredString.contains("0")){
                            error = 0;
                            throw new Exception("Not A String");
                        }
                        else{
                            System.out.println("Test");
                            stage = 2;
                        }
                    }
                    else if(userEnteredString.contains("1")||userEnteredString.contains("2")||userEnteredString.contains("3")||userEnteredString.contains("4")||userEnteredString.contains("5")||userEnteredString.contains("6")||userEnteredString.contains("7")||userEnteredString.contains("8")||userEnteredString.contains("9")||userEnteredString.contains("0")) {
                        error = 0;
                        throw new Exception("Not A String");
                        
                    }
                    else{
                        error = 1;
                        throw new Exception("Must be atleast 6 letters long");
                    }
                }
                catch (Exception e){
                    if (userEnteredString.length() < 6 && error == 1){
                        System.err.println("You must enter a string longer than 6 characters");
                        System.err.println("Exception: " + e);
                    }
                    else{
                        System.err.println("You must use a string");
                        System.err.println("Exception: " + e);
                    }
                    
                }

            }
        }
        if (stage == 2){
            
            while (stage == 2){
                
                try{
                    userEnteredString = JOptionPane.showInputDialog("Enter a string with atleast one lowercase \"a\"");
                    
                    if (userEnteredString.contains("1")||userEnteredString.contains("2")||userEnteredString.contains("3")||userEnteredString.contains("4")||userEnteredString.contains("5")||userEnteredString.contains("6")||userEnteredString.contains("7")||userEnteredString.contains("8")||userEnteredString.contains("9")||userEnteredString.contains("0")){
                        error = 2;
                        throw new Exception("Not A String");
                    }
                    if (userEnteredString.contains("a")){
                        System.out.println("Well Done");
                        stage = 3;
                    }
                    else {
                        error = 1;
                        throw new Exception("Must have \"a\"");
                    }
                }
                catch (Exception e){
                    if (error == 1){
                        System.err.println("You Must Have A Lower Case \"a\"");
                        System.err.println("Exception: " + e);
                    }
                    else{
                        System.err.println("You must use a string");
                        System.err.println("Exception: " + e);
                    }
                    
                }
                    
                

            }
        }
        if (stage == 3){
            
            while (stage == 3){
                
                try{
                    userEnteredString = JOptionPane.showInputDialog("Enter a string with a \"z\" between 5 and 15 characters");
                    
                    if (userEnteredString.contains("1")||userEnteredString.contains("2")||userEnteredString.contains("3")||userEnteredString.contains("4")||userEnteredString.contains("5")||userEnteredString.contains("6")||userEnteredString.contains("7")||userEnteredString.contains("8")||userEnteredString.contains("9")||userEnteredString.contains("0")){
                        error = 2;
                        throw new Exception("Not A String");
                    }
                    if (userEnteredString.length() >= 5 && userEnteredString.length() <= 15 && userEnteredString.contains("z") || userEnteredString.contains("Z")  ){
                        System.out.println(userEnteredString.length());
                        System.out.println("Well Done");
                        stage = 4;
                    }
                    else {
                        error = 1;
                        throw new Exception("Must have a \"z\" and be between 5 and 15 characters");
                    }
                }
                catch (Exception e){
                    if (error == 1){
                        System.err.println("Must have a \"z\" and be between 5 and 15 characters long!");
                        System.err.println("Exception: " + e);
                    }
                    else{
                        System.err.println("You must use a string");
                        System.err.println("Exception: " + e);
                    }
                    
                }
                    
                

            }
        }
        if (stage == 4){
            
            while (stage == 4){
                
                
                try{
                    userEnteredString = JOptionPane.showInputDialog("Enter a integer over 5 and less then 500");
                    
                    userEnteredInt = Integer.parseInt(userEnteredString);
                    
                    if (userEnteredInt >= 5 && userEnteredInt <= 500){
                        System.out.println("Well Done");
                        stage = 5;
                    }
                    else {
                        throw new Exception("Must Be over 5 and less then 500");
                    }
                }
                
                catch (NumberFormatException nfe){
                    System.err.println("You must use Ints");
                    System.err.println("Exception: " + nfe);
                    System.exit(1);
                }
                catch (Exception e){
                    System.err.println("It must be above 5 and unber 500");
                    System.err.println("Exception: " + e);
                }
            }
        }
        if (stage == 5){
            
            while (stage == 5){
                
                
                try{
                    userEnteredString = JOptionPane.showInputDialog("Enter a negitive integer");
                    
                    userEnteredInt = Integer.parseInt(userEnteredString);
                    
                    if (userEnteredInt < 0){
                        System.out.println("Well Done");
                        stage = 6;
                    }
                    else {
                        throw new Exception("Must Be Negative");
                    }
                }
                
                catch (NumberFormatException nfe){
                    System.err.println("You must use Ints");
                    System.err.println("Exception: " + nfe);
                    System.exit(1);
                }
                catch (Exception e){
                    System.err.println("It must be above 5 and unber 500");
                    System.err.println("Exception: " + e);
                }
            }
        }
        
        if (stage == 6){
            
            while (stage == 6){
                
                
                try{
                    userEnteredString = JOptionPane.showInputDialog("Enter a positive odd int");
                    
                    userEnteredInt = Integer.parseInt(userEnteredString);
                    
                    if (userEnteredInt >= 0 && userEnteredInt%2 == 1){
                        System.out.println("Well Done");
                        stage = 7;
                    }
                    else {
                        throw new Exception("Positive Odd");
                    }
                }
                
                catch (NumberFormatException nfe){
                    System.err.println("You must use Ints");
                    System.err.println("Exception: " + nfe);
                    System.exit(1);
                }
                catch (Exception e){
                    System.err.println("It must be positive int and odd");
                    System.err.println("Exception: " + e);
                }
            }
        }
        
        
    }
    
}

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
        int stage = 1,error = 0;
        
        if (stage == 0){
            System.out.println("You will be prompted each stage to enter different info \n"
                    + "You will then enter the correct info and move on \n"
                    + "Try to get all the questions right on the first try");
            
            stage = 1;
        }
        else if(stage == 1){
            while (stage == 1){
                try{
                    
                    userEnteredString = JOptionPane.showInputDialog("Enter a string");
                    
                    System.out.println(userEnteredString);
                    if(userEnteredString.length() >= 6 ){
                        if (userEnteredString.contains("1")||userEnteredString.contains("2")||userEnteredString.contains("3")||userEnteredString.contains("4")||userEnteredString.contains("5")||userEnteredString.contains("6")||userEnteredString.contains("7")||userEnteredString.contains("8")||userEnteredString.contains("9")||userEnteredString.contains("0")){
                            error = 0;
                            throw new Exception("Not A String");
                        }
                        else{
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
        else if (stage == 2){
            while (stage == 2){
                try{
                    
                }
                catch (Exception e){
                    
                }

            }
        }
    }
    
}

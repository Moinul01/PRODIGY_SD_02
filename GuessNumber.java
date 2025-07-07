/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumber;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class GuessNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);    
        int a = (int)(Math.random()*100);
        int g=0;
       while(g>=0){
           System.out.println("enter number you guessed: ");
           g = input.nextInt();
        if(g==a){
            System.out.println("Correct Guess");
              break;
        }else if(g>a){
            System.out.println("Too High,try again");
        }else {
            System.out.println("Too Low,try again");
        }
        }

    }
    }
    
        
    
    


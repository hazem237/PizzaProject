/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.util.Scanner;
import myException.SoldOut;

public class Start {

    static Scanner input = new Scanner(System.in);
    static int choise;
    private static PizzaLogger l = new PizzaLogger();
    
    public static void clearScreen() {  

   System.out.print("\033[H\033[2J");  

   System.out.flush();  

}

    public static void start_program() throws SoldOut, Exception {
        //this method is to ask the user if he want to interact with the program(consol of user interface)
        System.out.println(Messages.BEGIN);
        l.log(Messages.LOG_START_PROGRAM);

        choise = input.nextInt();

        switch (choise) {
            case 1:
                l.log(Messages.LOG_CHOSE_WAY+": Consol");
                Console.chooseFromStartMenu();
                break;
            case 2:
                l.log(Messages.LOG_CHOSE_WAY+": InterFace");
                PizzaJFrame p = new PizzaJFrame();
                p.setVisible(true);
                System.out.println("The user interface has opened, look at Task Bar");
                break;
            case 3:
                l.log("Program Canceled");
                break;
            default:
                l.log(Messages.LOG_UNVALID_INPUT);
                break;
                
        }

    }

}

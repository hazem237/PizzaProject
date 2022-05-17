package javaproject;

import myException.*;

public class JavaProject {

    public static void main(String[] args) throws SoldOut {
        //There is a text file in the project folder called (Read Me First), please read it

        try {
            Start.start_program();

        } catch (Exception ex) {

            System.out.println(ex.getMessage());

        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import myException.*;
import java.io.*;

/**
 *
 * @author yas se
 */
public class WriteInFile {

    public void PutDataInFile(String type, String size, String deep, double calories) {
        try {

            BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter("C:\\Users\\yas se\\Desktop\\JavaProject\\file_IO_Bounus\\output.txt"));

            bw.write(Messages.FILE_INTO + '\n');
            bw.write(Messages.FILE_TYPE + type + '\n');
            bw.write(Messages.FILE_SIZE + size + '\n');
            bw.write(Messages.FILE_DEEP + deep + '\n');
            bw.write(Messages.FILE_CALORIES + calories + '\n');

            bw.close();

        } catch (Exception ex) {

            System.out.println(ex.getMessage());

        }
    }
}

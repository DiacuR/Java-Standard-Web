/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.curso.java.mockapp;

import ar.com.educacionit.curso.java.interfaces.FileBinary;
import ar.com.educacionit.curso.java.interfaces.FileText;
import ar.com.educacionit.curso.java.interfaces.I_File;
import java.util.Scanner;

/**
 *
 * @author EducaciónIT
 */
public class InterfaceMock {
    public static void main(String[] args) throws Exception{
        I_File file = null;
        
        //file = new FileText();
        //file = new FileBinary();
        
        System.out.println("Ingrese 'FileText' o 'FileBinary': ");
        String in = new Scanner(System.in).next();
        
        //if(in.equalsIgnoreCase("FileText")) file = new FileText();
        //if(in.equalsIgnoreCase("FileBinary")) file = new FileBinary();
        
        in = "ar.com.educacionit.curso.java.interfaces."+in;
        
        file =(I_File) Class.forName(in).newInstance();        //Class Devuelve la clase por nombre en este caso y newInstance devuelve el objeto de la clase.
        
        file.setText("Hola");
        System.out.println(file.getText());
        
        file.info();
    }
}

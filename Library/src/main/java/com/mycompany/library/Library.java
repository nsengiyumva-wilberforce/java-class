/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library;

import static com.mycompany.library.Menu.choice;
import static com.mycompany.library.Menu.menu;


/**
 *
 * @author WILBERFORCE NSENGIYUMVA
 */
public class Library {
    public static void main(String[] args) {
        System.out.println("LIBRARY MANAGEMENT SYSTEM");
        //Use printf function to write formatted code
        System.out.printf("***************************************%n");
        //Use print function
        System.out.print("You are welcome");
        //Println method in use
        System.out.println("-----------------------------------------");
        //Access a static method in the main
        menu();
        //Leave some space using printlin method
        System.out.println("");
        //You can access a static variable anywhere in the program
        while(choice!=6){
            System.out.print("\033[H\033[2J");
            menu();
        }
        System.out.println("You have decided to quit!! I am sad");
    }
}

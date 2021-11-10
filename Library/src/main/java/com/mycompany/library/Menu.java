/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Menu {
    public static int choice;
    public static void menu(){
        System.out.println("MENU");
        
        //Declare a menuItem variable to hold menu item values
        String menuItems = "";
        //list of all menu items        
        menuItems+="1. Add a book%n";
        menuItems+="2. Delete a book%n";
        menuItems+="3. Edit a book%n";
        menuItems+="4. List available books%n";
        menuItems+="5. List books according to categories%n";
        menuItems+="6. Exit%n";        
        System.out.printf(menuItems);
        //Print choice word
        System.out.println("Choice: ");
        //scan for the menu choice
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        
        //create objects for all book actions
        Books actions = new Books();
        
        switch(choice){
            case 1:
                actions.addBook();
                break;
            case 2:
                actions.deleteBook();
                break;
            case 3:
                actions.editBook();
                break;
            case 4:
                actions.listBooks();
                break;
            case 5:
                actions.listAccordingToCategories();
                break;
            case 6:
                System.out.println("You have decided to quit");
                break;                
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//normal line comment 
/* this is 
a multi-line 
comment 
*/
package github_java;
import java.util.*;
//access modifiers - Private, public, protected 
//File is Github_Java therefor class is file (kinda)

public class Github_Java {

   /*
    { this is a block }
    */
    
    //this statement is a method 
    //static is one instance of a method, there is one copy of the method 
    //void - returns nothing 
    public static void main(String[] args) {
        //all code runs in this block 
        //data types
        //variables 
        //[G][u][y]
        char initial = 'G';
        String myName = "Guy Glossoti";
        int myAge = 19;
        double myExactAge = 19.2;
       System.out.print("Bye " + myName + "!");
       System.out.print("\nPlease eneter your favourite activity:");
       //object scanner (user input)
       Scanner scanner = new Scanner(System.in);
       String answer = scanner.nextLine();
       System.out.println(answer);
    }
    
    
    
    
    
    
    /*
    int methodExample(){
        return 1;
    }
    */
}

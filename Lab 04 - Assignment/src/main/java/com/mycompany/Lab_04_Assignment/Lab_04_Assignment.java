/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.Lab_04_Assignment;

/**
 *
 * @author Richard Williams IV
 */
public class Lab_04_Assignment {

   
    public static void printHello(int num){//Prints Hello n times
        if(num>0){
            System.out.println("Hello World");
            printHello(num-1);
        }


    }
    
    public static int sumOfnums(int num1, int num2){//gets two numbers for parameters than iterates the numbers between them to see if they are divisble by 7
        while(num1<=num2){
            if(num1 == 0)
                num1 = num1+1;
           
             if(num1%7 == 0){
                System.out.println(num1);
               return num1 + sumOfnums(num1+1, num2);
            }
            else{
                num1 = num1+1;
            }

        }
        return 0;

    }
    
    public static int binarySearchUsingRecursion(int desirednum, int[] array, int start, int end){// takes an array, the number to be searched for, and the first and last index of the array to recursivley search for the desired number.
        int middle = (start + end)/2;
		
		if(end < start){
			 return -1;
		} 
		
		
		if (desirednum < array[middle]){
			return binarySearchUsingRecursion(desirednum, array, start, middle - 1);
		}
		
		if (desirednum > array[middle]){
			return binarySearchUsingRecursion(desirednum, array, middle + 1, end);
		}
		
		if (desirednum == array[middle]){
			return middle;
		}
		
		return -1;
    
    }
        
        

    public static void main(String[] args) {
        sumOfnums(0,21);
        
      
    }
}
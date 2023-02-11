/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_03_classroom_work_submission;

import java.util.Scanner;

/**
 *
 * @author Richard Williams IV
 */
public class Lab_03_classroom_work_submission {
    
    public static void sortArray(int[] array){ //method to sort array from least to greatest
        for(int i = 0; i < array.length; i++){
            for(int k = i+1; k < array.length; k++){
                if(array[i] > array[k]){
                    int x;
                    x = array[i];
                    array[i] = array[k];
                    array[k] = x;
                
                }
            }
        
        }
    
    }
    
    public static void printArray(int[] array){ // method to print the array
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    
    public static int binarySearch(int[] array, int desiredNum){ //Sorts an array and then conducts the binary search **WILL ONLY WORK ON SORTED ARRAYS**
        sortArray(array);
        int middle = 0;
        int first = 0;
        int last = array.length - 1;
        
        while(last >= first){
            middle = (first + last) / 2;
        
            if(array[middle] < desiredNum){
                first = middle + 1;
            }
            
            else if(array[middle] > desiredNum){
                last = middle;
            }
            
            else{
                break;
            }
            
            
        
        } 
        return middle;
    
    }
    
    public static int linearSearch(int[] array, int desiredNum){ // mehtod to search an array of int for specific number **WORKS FOR BOTH SORTED AND UNSORTED ARRAYS**
        int i = 0;
        
        while(desiredNum != array[i]){
            i++;
            if(i >= array.length){
                System.out.println("number isn't in the array");
                return -1;
            }
        }
        
        return i;
        
        
    
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int desiredNum = scnr.nextInt();
        int[] array = {16,0,9,6};
        
        //0,6,9,16,1600
        
        //System.out.print("Found at index " + binarySearch(array, desiredNum));
        //System.out.print("Found at index " + linearSearch(array, desiredNum));
        
        
        
    }
}

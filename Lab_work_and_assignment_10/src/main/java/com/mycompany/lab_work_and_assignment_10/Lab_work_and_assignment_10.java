/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_work_and_assignment_10;

/**
 *
 * @author Richard Williams IV
 */
public class Lab_work_and_assignment_10 {


    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        Node x = new Node(3);
        Node d = new Node(10);
        Node r = new Node(90);
        Node j = new Node(16);
        
        
        list.append(x);
        list.append(d);
        list.append(r);
        list.append(j);
        
        int[] array = list.ToArray(list);
        
        
        System.out.println(list.sumOfLast(3));
        System.out.println(array[0]);
        System.out.println(list.indexOf(16));
        
        
        
                
        
       
        
     
}
}

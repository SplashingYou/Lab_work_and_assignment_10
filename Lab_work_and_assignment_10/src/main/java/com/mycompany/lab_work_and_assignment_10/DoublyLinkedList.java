
package com.mycompany.lab_work_and_assignment_10;

/**
 *
 * @author MoaathAlrajab
 */
class Node {
   public int data;
   public Node next;
   public Node previous;

   public Node(int initialData) {
      data = initialData;
      next = null;
      previous = null;
   }
}

public class DoublyLinkedList {
   private Node head;
   private Node tail;
   private int size;
    
   public DoublyLinkedList() {
      head = null;
      tail = null;
      size = 0;
      
   }
    
   public void append(Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else {
         tail.next = newNode;
         newNode.previous = tail;
         tail = newNode;
      }
      size++;
      
      
      
   }
   
   public void prepend(Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else {
         newNode.next = head;
         head.previous = newNode;
         head = newNode;
      }
      size++;
   }
   
   public void printList() {
      Node node = head;
      while (node != null) {
         System.out.print(node.data + " ");
         node = node.next;
      }
      System.out.println();
   }
   
    public int sumOfLast(int m) {
      Node node = tail;
      int sum=0;
      while (node != null && m>0) {
         sum+=node.data;m--;
         node = node.previous;
      }
      return sum;
   }
   
   public void insertAfter(Node currentNode, Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else if (currentNode == tail) {
         tail.next = newNode;
         newNode.previous = tail;
         tail = newNode;
      }
      else {
         Node successor = currentNode.next;
         newNode.next = successor;
         newNode.previous = currentNode;
         currentNode.next = newNode;
         successor.previous = newNode;
      }
   }
   
   public void remove(Node currentNode) {
      Node successor = currentNode.next;
      Node predecessor = currentNode.previous;
      
      if (successor != null)
         successor.previous = predecessor;
         
      if (predecessor != null)
         predecessor.next = successor;
         
      if (currentNode == head)
         head = successor;
         
      if (currentNode == tail)
         tail = predecessor;
   }
   
   public int getSize(){
       return size;
   }
   
   public int[] ToArray(DoublyLinkedList c){
       int[] newArray = new int[c.getSize()];
       Node newNode = head;
       
       
       for(int i=0; i<newArray.length; i++){
           if(newNode != null){
               newArray[i] = newNode.data;
               newNode = newNode.next;
           }
       }
       
       
       return newArray;
       
       
   } 
   
   public int indexOf(int x){
       Node newNode = head;
       int index = 0;
            while(newNode.data != x){
            newNode = newNode.next;
            if(newNode == null)
                return -1;
            index++;
       }
       
       return index;
       
       
       
       
       
       
   }
   
   public int sumOfLastnums(){
    return DoublyLinkedList.this.size;
       
   
       
       
   
   }
   
   
   
   
   }


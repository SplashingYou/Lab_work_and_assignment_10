/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.final_project_zoo_program;

/**
 *
 * @author Richard Williams IV
 */
public class Animal implements Animal_Actions {
   private String speciesName;
   private String speciesType;
   private int lifeExpectancy;
   
   public Animal(){
       speciesName = "PLACE HOLDER";
       speciesType = "PLACE HOLDER";
       lifeExpectancy = 0;
   }
   
   public Animal(String n, String t, int le){
       speciesName = n;
       speciesType = t;
       lifeExpectancy = 0;
   }
   
   public String getSpeciesName(){
       return speciesName;
   }
   
   public void setSpeciesName(String name){
       speciesName = name;
   }
   
   public String getSpeciesType(){
       return speciesType;
   }
   
   public void setSpeciesType(String type){
       speciesType = type;
   }
   
   public int getLifeExpectancy(){
       return lifeExpectancy;
   }
   
   public void setLifeExpectancy(int expectancy){
       lifeExpectancy = expectancy;
   }
   
   @Override
   public boolean equals(Object j){
       if (j == this) {
         return true;
      }
      if (!(j instanceof Animal)) {
         return false;
      }
       Animal a = (Animal) j;
       
       return speciesName.equals(a.speciesName) && speciesType.equals(a.speciesType) && lifeExpectancy == a.lifeExpectancy;
       
       
   
   }
   
   @Override
   public void playAnimalSound(){}
   
   @Override
   public void displayAnimalInformation(){}
   
   @Override
   public String toString(){
       return speciesName + speciesType + lifeExpectancy;
   
   }
    
}

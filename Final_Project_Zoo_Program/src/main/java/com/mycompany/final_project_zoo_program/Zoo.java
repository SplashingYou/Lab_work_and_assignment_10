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
public class Zoo {
    private String zooName;
    private Animal[] animals;
    private Animal animal;
    private Bird Macaw = new Bird(112.5, "Red");
    
    
    
    public Zoo(){
     zooName = "";
    }
    
    public Zoo(String name){
        zooName = name;
        animals = new Animal[8];
        Macaw = new Bird(112.5, "Red");
        Macaw.setLifeExpectancy(60);
        Macaw.setSpeciesType("Bird");
        Macaw.setSpeciesName("Macaw");
        animals[0] = Macaw;
        
        
       
        
        
        
    }
    
    public Animal getZooAnimalFromArray(){
        return animals[0];
    }
    
    public void setZooAnimalFromArray(Animal k){
        animal = k;
    }
            
    public Animal[] getZooAnimals(){
        return animals;
    }
    
    public void setZooAnimals(Animal[] l){
         animals = l;
    }
    
    public String getZooName(){
        return zooName;
    }
    
    public void setZooName(String name){
        zooName = name;
    }
    
    @Override
    public String toString(){
        return zooName;
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == this) {
         return true;
      }
      if (!(obj instanceof Zoo)) {
         return false;
      }
      
        Zoo zoo = (Zoo) obj;
        return zooName.equals(zoo.zooName);
        
        
    
    }
    
    public void displayDisclaimer(){
        System.out.print("**Greetings! We would like to inform you that the " + Zoo.this.toString() + " ");
        System.out.println("Application is in its beginning early stages of development "
                                + "and the current verison of the app is a beta with limited features**");
        
    }
   
   
    
}

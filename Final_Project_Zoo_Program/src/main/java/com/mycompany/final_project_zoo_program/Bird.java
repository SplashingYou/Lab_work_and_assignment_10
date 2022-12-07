package com.mycompany.final_project_zoo_program;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Richard Williams IV
 */
public class Bird extends Animal implements Animal_Actions{
    private double wingSpan;
    private String birdColor;
    
    public Bird(){
    wingSpan = 0.0;
    birdColor = " ";
    }
    
    public Bird(double length, String color){
    wingSpan = length;
    birdColor = color;
    
    
    }
    
    public double getWingSpan(){
        return wingSpan;
    }
    
    public void setWingSpan(double lengthNum){
        wingSpan = lengthNum;
    }
    
    
    public String getBirdColor(){
        return birdColor;
    }
    
    public void setBirdColor(String color){
        birdColor = color;
    }
    
    @Override
    public void animalSound() {
    
  }

    
    
    
}

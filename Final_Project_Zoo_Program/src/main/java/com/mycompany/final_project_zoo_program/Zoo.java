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
    
    public Zoo(){
     zooName = "";
    }
    
    public Zoo(String name){
        zooName = name;
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
   
   
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.class16;

/**
 *
 * @author pesparza
 */
public class Car {
    private float accelaration = 9.16f;
    private String carColor;
    private boolean automatic = true;
    
    public void setCarColor(String color){
        if (color.equalsIgnoreCase("YeLlOw")){
          carColor = color;
        }
    }
    
    public boolean getTransmission(){
        return automatic;
    }
    
    public void setAccelaration(float accelaration){
        this.accelaration = accelaration;
    }
    
    public void printCarColor(){
        System.out.println("My Color is: "+this.carColor);
    }
    
    public void printAccelaration(){
        System.out.println("This is the acceleration: "+this.accelaration);
    }
    
}

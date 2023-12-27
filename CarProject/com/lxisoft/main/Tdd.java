package com.lxisoft.main;
import com.lxisoft.files.*;

public class Tdd
{
     public static void main(String args[])
    {   
        Car car = new Car();      

        car.setType("SUV");
        car.setName("RangeRover Sport By LandRover");                
        car.setEngine("2997cc");
        car.setColor("Black");                 
        
        Door doors[] = new Door[4];           //Car doors Settings
   
        car.setDoor(doors);                         
        for(int i = 0;i < 4;i++)
        {         
            doors[i] = new Door();
   
            doors[i].setPosition("Position " + i);
            doors[i].setBrand("Lambo Door " + i);             
            doors[i].setLength("36 inches " + i);                 
            doors[i].setColor("Black " + i);
        }        
            
        Steering steering = new Steering();                                                                                                 
        car.setSteer(steering);                    
        steering.setPosition("Left Front");             
        steering.setSize("14 Inches");   
        steering.setFeature("German Quality Sport");       
        
        Tyre tyres[] = new Tyre[4];          //Car tyres Settings       
          
        car.setTyre(tyres);                                       
        for(int j = 0;j < 4;j++)
        {
            tyres[j] = new Tyre();
        
            tyres[j].setPosition("Position " + j);
            tyres[j].setSpeedRate("H (130 mph) " + j);
            tyres[j].setSize("235/65 R17 " + j);       
        }        
        car.showDetails();                    
    }
}


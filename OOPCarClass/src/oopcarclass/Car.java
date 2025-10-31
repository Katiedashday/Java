/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopcarclass;

/**
 *
 * @author f5064287
 */
public class Car {

    private boolean isStarted = false;
    private int speed = 0;

    public void start() {
        if (!isStarted) {
            isStarted = true;
            System.out.println("Car has been started");
        }
    }

    public void stop() {
        if (isStarted) {
            isStarted = false;
            System.out.println("Car has been stopped");

        } else {
            System.out.println("The car is not moving");

        }

    }
    public void incrementSpeed() {
        if (!isStarted){
            System.out.println("The car hasn't been started yet!");
        }else{
        speed++;
        System.out.println("Car speed is " + speed);
    }
        
            
    }

}

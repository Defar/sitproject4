/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package by.bsuir.command;

/**
 *
 * @author stud224
 */
public class Bike {
    int speed;

    public Bike(){
        speed=0;
    }

    public void Run(){
        speed=10;
        System.out.println("Speed="+speed);
    }

    public void SpeedUp(){
        if(speed<40){
            speed+=5;
            System.out.println("Speed="+speed);
        }
    }

    public void SpeedDown(){
        if(speed>0){
            speed-=5;
            System.out.println("Speed="+speed);
        }
    }

    public void Stop(){
        speed=0;
        System.out.println("Speed="+speed);
    }
}

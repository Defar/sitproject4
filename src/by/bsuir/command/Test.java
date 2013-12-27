/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package by.bsuir.command;

/**
 *
 * @author stud224
 */
public class Test {
    public static void main(String []a){
        Control control=new Control();
        Light light=new Light();
        Bike bike=new Bike();
        CommandLight command1=new CommandLight(light);
        CommandBike command2=new CommandBike(bike);

        control.SetCommand(command1);
        control.PressOn();
        control.PressOff();
        control.SetCommand(command2);
        control.PressOn();
        control.PressOff(); 
    }
}

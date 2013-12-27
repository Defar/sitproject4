/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package by.bsuir.command;

/**
 *
 * @author stud224
 */
public class CommandBike implements Command{
    Bike bike;

    public CommandBike(Bike b){
        bike=b;
    }

    public void execute() {
        bike.Run();
        bike.SpeedUp();
        bike.SpeedUp();
        bike.SpeedDown();
    }

    public void undo() {
        bike.Stop();
    }
}

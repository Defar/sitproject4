/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package by.bsuir.command;

/**
 *
 * @author stud224
 */
public class CommandLight implements Command{
    Light light;

    public CommandLight(Light l){
        light=l;
    }

    public void execute() {
        light.On();
    }

    public void undo() {
        light.Off();
    }
}

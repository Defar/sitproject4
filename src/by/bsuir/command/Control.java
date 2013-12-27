/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package by.bsuir.command;

/**
 *
 * @author stud224
 */
public class Control {
    Command command;

    public void SetCommand(Command com){
        command=com;
    }

    public void PressOn(){
        command.execute();
    }

    public void PressOff(){
        command.undo();
    }
}

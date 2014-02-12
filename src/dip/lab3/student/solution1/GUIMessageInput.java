/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3.student.solution1;
import javax.swing.JOptionPane;
/**
 *
 * @author Celeste
 */
public class GUIMessageInput implements MessageInput {
    
    @Override
    public Message getInputMessage(){
       String jOptMessage = JOptionPane.showInputDialog(null, "Please Enter Your Message:");
        Message inputMess = new Message(jOptMessage);
        return inputMess;
       
    }


  
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3.student.solution1;
import java.util.Scanner;
/**
 *
 * @author Celeste
 */
public class KeyboardMessageInput implements MessageInput{
 
    @Override
    public Message getInputMessage(){
    Scanner keyboard = new Scanner(System.in);
    String newMessage = keyboard.nextLine();
    Message inputMess = new Message(newMessage);
    return inputMess;
    }
}

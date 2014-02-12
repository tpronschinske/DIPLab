/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3.student.solution1;

/**
 *
 * @author Celeste
 */
public class MessageService {
    
    public MessageInput inputMessage;
    public MessageOutput outputMessage;
    
    
    
    public MessageService (MessageInput inputMessage, MessageOutput outputMessage){
        this.inputMessage = inputMessage;
        this.outputMessage = outputMessage;
                
    }
    
    
    public void obtainMessage(){
        outputMessage.retrieveMessage(inputMessage);
    }
    
    
}
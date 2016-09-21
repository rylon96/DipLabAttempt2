//Incorrect Attempt Ignore but rember this is wrong.
package dip.lab3.student.solution1;
public class InputService {
    private MessageInput input;
    
    public InputService (MessageInput input){
        this.input = input;
    }
    
    public String inputLine(){
        return input.inputMessage();
    }
    
    public MessageInput getInputLine(){
        return input;
    }
    
    public void setInputLine(MessageInput input){
        this.input = input;
    }
}

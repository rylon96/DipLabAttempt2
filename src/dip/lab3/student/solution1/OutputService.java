//Incorrect Attempt Ignore but rember this is wrong.
package dip.lab3.student.solution1;
public class OutputService {
    private MessageOutput output;
    
    public OutputService (MessageOutput output){
        this.output = output;
    }
    
    public MessageOutput getOutputLine(){
        return output;
    }
    
    public void setOutputLine (MessageOutput output){
        this.output = output;
    }
    
}

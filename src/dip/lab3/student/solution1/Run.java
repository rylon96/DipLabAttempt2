package dip.lab3.student.solution1;
public class Run {
    public static void main(String[] args) {
        MessageInput in = new KeyboardInput();
        //MessageInput in = new GoodMorningInput();
        MessageOutput out = new ConsoleOutput();
        
        InputOutputMessageService ios = new InputOutputMessageService (in, out);
        ios.inputToOutput();
        
        
        
    }
    
}

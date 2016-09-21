package dip.lab3.student.solution1;
public class ConsoleOutput implements MessageOutput {
    
    @Override
    public void outputMessage(String oLine){
        System.out.println("Text Entered below");
        System.out.println(oLine);
        
    }
}

package dip.lab3.student.solution1;

import javax.swing.JOptionPane;
public class WindowOutput implements MessageOutput{

    @Override
    public void outputMessage(String oLine) {
        JOptionPane.showMessageDialog(null, oLine);
    }
    
}

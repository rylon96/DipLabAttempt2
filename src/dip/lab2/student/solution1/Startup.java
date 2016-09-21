package dip.lab2.student.solution1;

// An useful import if you need it.
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;
public class Startup {
 
    public static void main(String[] args) {
        TipCalculator calc = 
               new FoodServiceTipCalculator(ServiceQuality.GOOD,100);
       TipCalculatorService service = new TipCalculatorService(calc);
       double amt = service.getTip();
        System.out.println("Your Tip is $" + amt);
        
    }

}

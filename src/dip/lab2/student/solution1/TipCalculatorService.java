package dip.lab2.student.solution1;
public class TipCalculatorService {
    private TipCalculator tipCalculator;
    
    public TipCalculatorService (TipCalculator tipCalculator){
        this.tipCalculator = tipCalculator;
    }
    public double getTip(){
        return tipCalculator.getTip();
    }
    public TipCalculator getTipCalculator(){
        return tipCalculator;
    }
    public void setTipCalculator(TipCalculator tipCalculator){
        this.tipCalculator = tipCalculator;
    }
}


package OOPS;
class LoanApp{
    static float rateOfInterest = 9.0f;
        
}
public class StaticVariableApp {
    public static void main(String[] args) {
        System.out.println(LoanApp.rateOfInterest);
        System.out.println(new LoanApp().rateOfInterest);
    }
}

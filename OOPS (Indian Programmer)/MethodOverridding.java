// Method Overriddding
import java.util.*;
class Bank{
    public void RateOfInterest(){
        System.out.println("Generally rate of interest is 4.5%");
    }
}

class SBI extends Bank{
    @Override
    public void RateOfInterest(){
        System.out.println("Rate of interest for SBI is 6.5%");
    }

}

class PNB extends Bank{
    @Override
    public void RateOfInterest(){
        System.out.println("Rate of interest for PNB is 7.5%");
    }
}

public class MethodOverridding {
    public static void main(String[] args) {
        SBI obj1 = new SBI();
        obj1.RateOfInterest();

        PNB obj2 = new PNB();
        obj2.RateOfInterest();

        Bank obj3 = new Bank();
        obj3.RateOfInterest();

    }
}

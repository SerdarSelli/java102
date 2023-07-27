import java.util.Date;
import java.util.GregorianCalendar;

public class ResidencelInsurance extends Insurance {
    public ResidencelInsurance(String name, Date start, Date end) {

        super(3,"Residencel Insurence", new GregorianCalendar(2022, 8, 20).getTime(), new GregorianCalendar(2032, 8, 20).getTime());


    }

    public ResidencelInsurance() {

    }

    public void calculate(String type) {
        if (type.equals("Enterprise")) {
            System.out.println("Total Price: 20000$");
        } else {
            System.out.println("Total Price: 18000$");
        }


    }
}

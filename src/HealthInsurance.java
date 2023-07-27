import java.util.Date;
import java.util.GregorianCalendar;

public class HealthInsurance extends Insurance{
    public HealthInsurance(String name, Date start, Date end) {

        super(2,"Health Insurance",new GregorianCalendar(2022,8,20).getTime(),new GregorianCalendar(2023,8,20).getTime());

    }

    public HealthInsurance() {

    }

    public void calculate(String type) {
        if (type.equals("Enterprise")) {
            System.out.println("Total Price: 3000$");
        } else {
            System.out.println("Total Price: 3500$");
        }
    }
}

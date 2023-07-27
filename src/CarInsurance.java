import java.util.Date;
import java.util.GregorianCalendar;

public class CarInsurance extends Insurance{
    public CarInsurance(String name, Date start, Date end) {
        super(1,"Car Insurance", new GregorianCalendar(2022,8,20).getTime(),new GregorianCalendar(2023,8,20).getTime());

    }

    public CarInsurance() {

    }

    public void calculate(String type) {
        if (type.equals("Enterprise")) {
            System.out.println("Total Price: 1000$");
        } else {
            System.out.println("Total Price: 1100$");
        }
    }
}

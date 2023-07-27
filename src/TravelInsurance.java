import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TravelInsurance extends Insurance{
    public TravelInsurance(String name, Date start, Date end) {

        super(4,"Travel Insurance",new GregorianCalendar(2022,8,20).getTime() ,new GregorianCalendar(2023,8,20).getTime());
    }

    public TravelInsurance() {

    }

    @Override
    public void calculate(String type){
        if(type.equals("Enterprise")){
            System.out.println("Total Price: 2000$");
        }else{
            System.out.println("Total Price: 1500$");
        }

    }
}

import java.util.ArrayList;
import java.util.Date;
import java.util.TreeSet;

public class Enterprise extends Account {


    public Enterprise(String name, String surName, String eMail, String password, String job, int age, Date date, AuthenticationStatus status, User user, ArrayList<Insurance> insurances, TreeSet<Address> compAdress) {
        super(name, surName, eMail, password, job, age, date, status, user, insurances, compAdress);
    }

    @Override
    public int compareTo(Address o) {
        if (o.equals(this.compAdress.comparator())) {
            return 1;
        }
        return -8;

    }
}



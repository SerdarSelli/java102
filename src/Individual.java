import java.util.ArrayList;
import java.util.Date;
import java.util.TreeSet;

public class Individual extends Account{


    public Individual(String name, String surName, String eMail, String password, String job, int age, Date date, AuthenticationStatus status, User user, ArrayList<Insurance> insurances, TreeSet<Address> compAdress) {
        super(name, surName, eMail, password, job, age, date, status, user, insurances, compAdress);
    }

    @Override
    public int compareTo(Address o) {
        return 0;
    }
}

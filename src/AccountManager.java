import java.util.*;

public class AccountManager extends Account {

    private String name;
    private String surName;
    private String eMail;
    private String password;
    private String job;
    private int age;
    private Date date;
    private AuthenticationStatus status;
    User user = new User();

    public AccountManager(String name, String surName, String eMail, String password, String job, int age, Date date, AuthenticationStatus status, User user, ArrayList<Insurance> insurances, TreeSet<Address> compAdress) {
        super(name, surName, eMail, password, job, age, date, status, user, insurances, compAdress);
    }

    public AccountManager() {

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean login(String eMail, String password) {
        if (eMail.equals(user.getEmail()) && password.equals(user.getPassword())) {
            setStatus(AuthenticationStatus.Success);
            setPassword(password);
            setEmail(eMail);
        }else{
            setStatus(AuthenticationStatus.Fail);

        }
        return true;
    }



    @Override
    public int compareTo(Address o) {
        if(o.equals(this.compAdress.comparator())){
            return 1;
        }
        return -8;

    }
}

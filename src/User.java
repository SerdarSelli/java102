import java.util.ArrayList;
import java.util.Date;

public class    User {
    private String name;
    private String surName;
    private String email;
    private String password;
    private String Job;
    private int Age;
    private Date date;
    private int id;
    ArrayList<Address> addressList = new ArrayList<>();

    public User(ArrayList<Address> addressList) {
        this.addressList = addressList;
    }

    public User() {

    }

    public void setAdressList(ArrayList<Address> addressList) {
        this.addressList = addressList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getJob() {
        return Job;
    }

    public int getAge() {
        return Age;
    }

    public Date getDate() {
        return date;
    }



    public ArrayList<Address> getAdressList() {
        return addressList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setJob(String job) {
        Job = job;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public User(String name, String surName, String email, String password,
                String job, int age, Date date, String adress) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.password = password;
        Job = job;
        Age = age;
        this.date = date;




    }
}

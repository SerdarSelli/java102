import java.util.*;
abstract class  Account implements Comparable<Address>{
    private String name;
    private String surName;
    private String email;
    private String password;
    private String job;
    private int age;
    private Date date;
    private AuthenticationStatus status;
    User user;
    ArrayList<Insurance> insurances=new ArrayList<>();
    TreeSet<Address> compAdress;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public Account(){
        setEmail("Patika.dev");
        setPassword("Patika12345");
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    final void showUserInfo(){
        System.out.println("First Name: "+this.getName()+"Last Name: "+this.getSurName()+"Email Address: "+this.getEmail()
                +"Job: "+this.getJob()+"Age: "+this.getAge()+"Last Login: "+this.getDate());
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public enum AuthenticationStatus{
        Success,
        Fail
    }

    public AuthenticationStatus getStatus() {
        return status;
    }

    public void setStatus(AuthenticationStatus status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(ArrayList<Insurance> insurances) {
        this.insurances = insurances;
    }


    public TreeSet<Address> getCompAdress() {
        return compAdress;
    }

    public void setCompAdress(TreeSet<Address> compAdress) {
        this.compAdress = compAdress;
    }

    public Account(String name, String surName, String email, String password, String job, int age, Date date,
                   AuthenticationStatus status, User user, ArrayList<Insurance> insurances, TreeSet<Address> compAdress) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        this.date = date;
        this.status = status;
        this.user = user;
        this.insurances = insurances;
        this.compAdress = compAdress;


    }
}

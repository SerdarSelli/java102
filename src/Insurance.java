import java.util.Date;
import java.util.GregorianCalendar;

abstract class Insurance {

    private String name;
    private Date startDate;
    private Date endDate;
    private int id;
    private String type;

    public Insurance(int id,String name, Date startDate, Date endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Insurance() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Insurance(String travel_insurance, GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar1) {
    }

    public void calculate(String type){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

}

public class BusinessAddress implements Address {
    private String province;
    private String district;
    private String street;
    private int no;

    public BusinessAddress(String province, String district, String street, int no) {
        this.province = province;
        this.district = district;
        this.street = street;
        this.no = no;
    }
    public void showAdressInfo(int id){
        System.out.println("Business Adress:\n+ID: "+id+"\nProvince: "+
                this.province+"\nDistrict: "+this.district+"\nNo: "+this.no);

    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}

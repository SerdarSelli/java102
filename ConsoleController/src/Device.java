public abstract class Device {
    private boolean isOpen;
    private Controller deviceType;

    public void AddController(Controller deviceType){
        this.deviceType=deviceType;
    }

    public void open(){
        if (isOpen){
           // throw new RuntimeException("device is already open");
            try {
                throw new RuntimeException("device is already open");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }else {
        isOpen=true;
        System.out.println("Device is opening");
    }
    }
    public void shutDown(){
        if (!isOpen){
//            throw new RuntimeException("device is already shutdown");
            try {
                throw new RuntimeException("device is already shutdown");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }else {
            isOpen=false;
            System.out.println("device is shutting down");
        }
    }



    public Controller getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Controller deviceType) {
        this.deviceType = deviceType;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
    public void playGame(){
        if (!isOpen()){
           // throw new RuntimeException("device shutdown");
            try {
                throw new RuntimeException("device shutdown, Open device first");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }else {
            System.out.println("game started");
        }
    }


}

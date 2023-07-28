public class Xbox extends Device implements Controller{

    @Override
    public void AddController(Controller deviceType) {
        super.AddController(deviceType);
         if ((getDeviceType() instanceof PlaystationController)){
         //throw new RuntimeException("unidentified controller, please connect xbox controller");
         try {
         throw new RuntimeException("unidentified controller, please connect xbox controller");
         }catch (Exception e){
         System.out.println(e.getMessage());
         }
         } else  {
         System.out.println("device connected succesfully");
         }
    }
}




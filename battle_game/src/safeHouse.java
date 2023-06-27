public class safeHouse extends normalLoc{

    public safeHouse(player player){
        super(player,"safeHouse");
    }

    @Override
    public boolean onLocation(){
        System.out.println("you are in the safeHouse right now!");
        System.out.println("your health is fulled!");
        this.getPlayer().setHealth(getPlayer().getOriginalHealth());
        return true;
    }

    public boolean yazacakmı(){
        System.out.println("yazdı");
        return true;
    }
}

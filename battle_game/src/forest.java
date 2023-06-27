public class forest extends battleLoc{
    public forest(player player){
        super(player,"forest", new vampire(), "firewood",3);
    }
    public boolean awardControl(){
        if (this.getPlayer().getInv().isFirewood()){
            return true;
        }else return false;
    }

}

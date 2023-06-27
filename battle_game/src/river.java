public class river extends battleLoc{
    public river(player player){
        super(player,"river",new bear(),"water",3);
    }
    public boolean awardControl(){
        if (this.getPlayer().getInv().isFirewood()){
            return true;
        }else return false;
    }
}

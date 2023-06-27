public class cave extends battleLoc{
    public cave(player player){
        super(player,"cave",new zombie(),"food",3);
    }
    public boolean awardControl(){
        if (this.getPlayer().getInv().isWater()){
            return true;
        }else return false;
    }
}

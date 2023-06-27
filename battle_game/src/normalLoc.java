public abstract class  normalLoc extends location{

    public normalLoc(player player, String name){
        super(player,name);
    }
    @Override
    public boolean onLocation(){
        return true;
    }
}

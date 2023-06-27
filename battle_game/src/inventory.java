public class inventory {
   private weapon weaponn;
   private armor armorr;
private boolean food;
    private boolean firewood;
    private boolean water;



    public inventory(){
       this.weaponn = new weapon("fist",-1,0,0);
       this.armorr = new armor("piece of shit",-1,0,0);
       this.food=false;
       this.firewood=false;
       this.water=false;

   }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public armor getArmorr(){
     return   this.armorr;
   }

   public void setArmorr(armor armorr){
       this.armorr = armorr;
   }

   public weapon getWeaponn(){
       return this.weaponn;
   }

   public void setWeaponn(weapon weaponn){
       this.weaponn=weaponn;
   }
}

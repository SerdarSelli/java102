import java.util.Random;

public abstract class battleLoc extends location{
    private obstacle obstaclee;
    private String award;
    private int maxObstacle;
    public battleLoc(player player, String name,obstacle obstaclee, String award, int maxObstacle) {
        super(player, name);
        this.obstaclee=obstaclee;
        this.award=award;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {

//if (this.getPlayer().getInv().isFood() && this.getPlayer().getInv().isFirewood() && this.getPlayer().getInv().isWater() ){
//    return false;
//}
        int obsNumber = this.randomObstacle();
        System.out.println("you are here now : " + this.getName());
        System.out.println("Attention! "+obsNumber+ "  " + this.getObstaclee().getName()+" lives here");
        System.out.println("<R>un or <F>ight");
        String selectCase = input.nextLine();
        selectCase = selectCase.toUpperCase();
        if (selectCase.equals("F") && combat(obsNumber) ){

                System.out.println(this.getPlayer().getName() +" you defeated all the enemies! ");
                switch (this.getName()){
                    case "cave":
                        this.getPlayer().getInv().setFood(true);
                        break;
                    case "forest":
                        this.getPlayer().getInv().setFirewood(true);
                        break;
                    case "river":
                        this.getPlayer().getInv().setWater(true);
                        break;
                }
                return true;

        }
        if (this.getPlayer().getHealth()<=0){
            System.out.println("wasted!");
            return false;
        }
        return true;

    }


    public boolean combat(int obsNumber){

        for (int i = 1; i<=obsNumber;i++){
            this.getObstaclee().setHealth(this.getObstaclee().getOrjinalHealth());
            playerStats();
            obsStats(i);
            while (this.getPlayer().getHealth()>0 && this.getObstaclee().getHealth() > 0){

                System.out.println("<H>it or <R>un");
                String hitRunChoice = input.nextLine().toLowerCase();

                if (hitRunChoice.equals("h")){

//kimin ilk vuracağını random olarak belirledik

                    if (randomHit()>=5){


                        if (this.getPlayer().getHealth()>0 ){
                            System.out.println("you hit!");
                            this.getObstaclee().setHealth(this.getObstaclee().getHealth() - this.getPlayer().getTotalDamage());
                            afterHit();
                        }

                        if (this.getObstaclee().getHealth()>0 ){
                            System.out.println(this.getObstaclee().getName()+" hits you");
                            // zırhın bloklama değerinden dolayı eksili sayı gelmemesi için
                            int obstackleDAmage = this.getObstaclee().getDamage() - this.getPlayer().getInv().getArmorr().getReflectValue();

                            if(obstackleDAmage<0){
                                obstackleDAmage = 0 ;
                            }

                            this.getPlayer().setHealth(this.getPlayer().getHealth() - this.getObstaclee().getDamage());
                            afterHit();
                        }


                    }else {


                        if (this.getObstaclee().getHealth()>0 ){
                            System.out.println(this.getObstaclee().getName()+" hits you");
                            // zırhın bloklama değerinden dolayı eksili sayı gelmemesi için
                            int obstackleDAmage = this.getObstaclee().getDamage() - this.getPlayer().getInv().getArmorr().getReflectValue();

                            if(obstackleDAmage<0){
                                obstackleDAmage = 0 ;
                            }

                            this.getPlayer().setHealth(this.getPlayer().getHealth() - this.getObstaclee().getDamage());
                            afterHit();
                        }

                        if (this.getPlayer().getHealth()>0 ){
                            System.out.println("you hit!");
                            this.getObstaclee().setHealth(this.getObstaclee().getHealth() - this.getPlayer().getTotalDamage());
                            afterHit();
                        }

                    }



                }else {
                    return false;
                }
            }

//obstacle öldürüldüğü zaman gelen ödülün inventory e geçmesi burada sağlanıyor

            if (this.getName().equals("mine")){
                //eğer mine bölgesi seçildiyse burası işletilir
                if (this.getObstaclee().getHealth()<this.getPlayer().getHealth()){
                    System.out.println("enemy defeated! ");



                    //burayı değiştirecez
                    if (randomSnakeAward()< 15){
                        //silah kazanacak

                        if (randomSnakeAward()< 20){
                            //tüfek kazanacak
                            weapon selectedWeapon = weapon.getWeaponByID(3);
                            System.out.println("weapon before battle => " + this.getPlayer().getInv().getWeaponn().getName());
                            this.getPlayer().getInv().setWeaponn(selectedWeapon);
                            System.out.println("weapon after battle => " + this.getPlayer().getInv().getWeaponn().getName());
                        } else if (randomSnakeAward()>=20 && randomSnakeAward()< 50) {
                            //kılıç kazanacak
                            weapon selectedWeapon = weapon.getWeaponByID(2);
                            System.out.println("weapon before battle => " + this.getPlayer().getInv().getWeaponn().getName());
                            this.getPlayer().getInv().setWeaponn(selectedWeapon);
                            System.out.println("weapon after battle => " + this.getPlayer().getInv().getWeaponn().getName());

                        }else {
                            //tabanca kazanacak
                            weapon selectedWeapon = weapon.getWeaponByID(1);
                            System.out.println("weapon before battle => " + this.getPlayer().getInv().getWeaponn().getName());
                            this.getPlayer().getInv().setWeaponn(selectedWeapon);
                            System.out.println("weapon after battle => " + this.getPlayer().getInv().getWeaponn().getName());
                        }



                    }else if(randomSnakeAward()>=15 && randomSnakeAward()< 30){
                        //zırh kazanacak
                        if (randomSnakeAward()< 20){
                            //ağır zırh kazanacak
                            armor selectedArmor = armor.getArmorByID(3);
                            System.out.println("your armor before battle => " + this.getPlayer().getInv().getArmorr().getName());
                            this.getPlayer().getInv().setArmorr(selectedArmor);
                            System.out.println("your armor after battle => " + this.getPlayer().getInv().getArmorr().getName());

                        } else if (randomSnakeAward()>=20 && randomSnakeAward()< 50) {
                            //orta zırh kazanacak
                            armor selectedArmor = armor.getArmorByID(2);
                            System.out.println("your armor before battle => " + this.getPlayer().getInv().getArmorr().getName());
                            this.getPlayer().getInv().setArmorr(selectedArmor);
                            System.out.println("your armor after battle => " + this.getPlayer().getInv().getArmorr().getName());

                        }else {
                            //hafif zırh kazanacak
                            armor selectedArmor = armor.getArmorByID(1);
                            System.out.println("your armor before battle => " + this.getPlayer().getInv().getArmorr().getName());
                            this.getPlayer().getInv().setArmorr(selectedArmor);
                            System.out.println("your armor after battle => " + this.getPlayer().getInv().getArmorr().getName());

                        }









                    } else if (randomSnakeAward()>=30 && randomSnakeAward()< 55) {
                        //para kazanacak
                            if (randomSnakeAward()< 20){
                        //10 para kazanacak
                                System.out.println("10 money earned!");
                                this.getPlayer().setMoney(this.getPlayer().getMoney()+10);
                                System.out.println("your money is "+ this.getPlayer().getMoney());

                            } else if (randomSnakeAward()>=20 && randomSnakeAward()< 50) {
                                //5 para kazanacak
                                System.out.println("5 money earned!");
                                this.getPlayer().setMoney(this.getPlayer().getMoney()+5);
                                System.out.println("your money is "+ this.getPlayer().getMoney());

                            }else {
                                System.out.println("1 money earned!");
                                this.getPlayer().setMoney(this.getPlayer().getMoney()+1);
                                System.out.println("your money is "+ this.getPlayer().getMoney());
                                //1para kazanacak
                            }

                    }else {
                        // hiç birşey kazanmayacak %45 ihtimal
                        System.out.println("you win nothing!");
                    }


                    System.out.println(this.getObstaclee().getAward()+" money earned!");
                    this.getPlayer().setMoney(this.getPlayer().getMoney()+this.getObstaclee().getAward());
                    System.out.println("your money is "+ this.getPlayer().getMoney());

                }else {return false;}



            }else{

                //eğer mine dışında bir bölge seçildiyse kod burdan devam eder
                if (this.getObstaclee().getHealth()<this.getPlayer().getHealth()){
                    System.out.println("enemy defeated! ");
                    System.out.println(this.getObstaclee().getAward()+" money earned!");
                    this.getPlayer().setMoney(this.getPlayer().getMoney()+this.getObstaclee().getAward());
                    System.out.println("your money is "+ this.getPlayer().getMoney());
                }else {return false;}
            }


        }
        return true;
    }

    public int randomSnakeAward(){
        Random ab = new Random();
        int abb = ab.nextInt(100);
        return abb;
    }

public void afterHit(){
    System.out.println("health : "+ this.getPlayer().getHealth());
    System.out.println(this.getObstaclee().getName()+" healt: "+this.getObstaclee().getHealth());
}
    public void playerStats(){
        System.out.println("player stats:");
        System.out.println("------------------");
        System.out.println("health: "+this.getPlayer().getHealth());
        System.out.println("armor name: "+ this.getPlayer().getInv().getArmorr().getName());
        System.out.println("block power: "+ this.getPlayer().getInv().getArmorr().getReflectValue());
        System.out.println("damage: "+this.getPlayer().getTotalDamage());
        System.out.println("weapon name: "+ this.getPlayer().getInv().getWeaponn().getName());
        System.out.println("money: "+ this.getPlayer().getMoney());

    }
    public void obsStats(int i){
        System.out.println("-  -  -  -  -  -  -  -  -  -");
        System.out.println( i +". "+this.getObstaclee().getName()+" status and infos");
        System.out.println("-------------------------");
        System.out.println("health "+ this.getObstaclee().getHealth());
        System.out.println("damage "+ this.getObstaclee().getDamage());
        System.out.println("award: "+ this.getObstaclee().getAward());
    }
    public int randomHit(){
        Random hit = new Random();
        return hit.nextInt(10);
    }
    public int randomObstacle(){
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle())+1;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

    public obstacle getObstaclee() {
        return obstaclee;
    }

    public void setObstaclee(obstacle obstaclee) {
        this.obstaclee = obstaclee;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
}

import java.util.Scanner;

public class player {
    private int damage;
    private int health;
    private int originalHealth;
    private    int money;
    private String name;
    private   String charName;
    private inventory inv;
Scanner scan = new Scanner(System.in);

    public player(String name) {
        this.name = name;
        this.inv=new inventory();
    }

    public int getTotalDamage(){
        return damage + this.getInv().getWeaponn().getDamage() ;
    }
    public int getDamage() {
        return damage  ;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setOriginalHealth(int originalHealth){
        this.originalHealth=originalHealth;
    }

    public int getOriginalHealth(){
        return this.originalHealth;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public inventory getInv() {
        return inv;
    }

    public void setInv(inventory inv) {
        this.inv = inv;
    }

    public void selectChar(){
        gameChar[] charList= {new samurai(), new archer(), new knight()};
        System.out.println("=============================================================");
        for (gameChar i :charList
        ) {
            System.out.println("Character name: " + i.getCharacterName()+"\t damage: "+i.getCharDamage()+"\t health: "+i.getCharHealth()+"\t money: "+ i.getCharMoney());
            System.out.println("________________________________________________________________");
        }
        System.out.println("choose character!");
        int characterNumber = scan.nextInt();

        switch (characterNumber){
            case 1:
                initPlayer(new samurai());
                break;
            case 2:
                initPlayer(new archer());
                break;
            case 3:
                initPlayer(new knight());
                break;
        }

      //  System.out.println("character:"+ getCharName()+"\t  damage: "+ getDamage()+"\t  health: "+getHealth()+"\t  money: "+getMoney());

    }
public void printInfo(){
    System.out.println("-------------------------------------------------------------------");
    System.out.println("character:"+ getCharName()
            +"\t weapon = "+this.getInv().getWeaponn().getName()
            + "\t Armor = "+this.getInv().getArmorr().getName()
            + "\t block value = "+ this.getInv().getArmorr().getReflectValue()
            +  "\t  damage: "+ getTotalDamage()
            +"\t  health: "+getHealth()
            +"\t  money: "+getMoney()
            + "\t food: "+this.getInv().isFood()
            + "\t firewood: "+this.getInv().isFirewood()
            + "\t water: "+this.getInv().isWater());
    System.out.println("-------------------------------------------------------------------");
}
    public void initPlayer(gameChar gamecharr){
        this.setDamage(gamecharr.getCharDamage());
        this.setHealth(gamecharr.getCharHealth());
        this.setOriginalHealth(gamecharr.getCharHealth());
        this.setMoney(gamecharr.getCharMoney());
        this.setCharName(gamecharr.getCharacterName());
    }
}

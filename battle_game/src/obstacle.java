public class obstacle {
    private String name;
    private int id;
    private int damage;
    private int health;
    private int award;
    private int orjinalHealth;


    public obstacle(String name, int id, int damage, int health, int award) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.health = health;
        this.award = award;
        this.orjinalHealth=health;
    }
public int getOrjinalHealth(){
        return this.orjinalHealth;
}
public void setOrjinalHealth(int health){
        this.orjinalHealth=health;
}
    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        if (this.health<0){
            return health=0;
        }
        return health;
    }


    public void setHealth(int health) {
        this.health = health;
    }
}

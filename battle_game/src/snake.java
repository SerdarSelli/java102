import java.util.Random;

public class snake extends obstacle{
    public snake() {
        super("snake",4, randomSnakeDamage() ,12,0);
    }
    public static int  randomSnakeDamage(){
        Random damage = new Random();
        return damage.nextInt(3,7);
    }
}

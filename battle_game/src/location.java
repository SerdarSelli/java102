import java.util.Scanner;

public abstract class location {
   private player player;
    private String name;
//bu scanneri tüm alt sınıflarda ayrı ayrı scnner nesnesi oluşturmamak için burada kullandık.
    public static Scanner input = new Scanner(System.in);
    public location(player player, String name) {
        this.player = player;
        this.name = name;
    }


    public player getPlayer(){
        return this.player;
    }

    public void setPlayer(player player){
        this.player=player;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean onLocation();
}

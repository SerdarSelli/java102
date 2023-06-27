import java.util.Scanner;

public class game {

    public void start(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, welcome to the Battle_Game ");
        System.out.print("Please set your nickname  ");
       // String playerName = scan.nextLine();
        player p1 = new player("Abuzittin Hairyleg");
        System.out.println(p1.getName()+" Welcome!");
        System.out.println("CHoose your Character type");
        p1.selectChar();
         location a1 = null;

        while (true){
            if (p1.getInv().isFood() && p1.getInv().isFirewood() && p1.getInv().isWater() ){
                System.out.println("CONGRATULATIONS YOU WIN");
                break;
            }

            p1.printInfo();
            System.out.println("                                                            ");
            System.out.println("#####################    AREAS    #########################");
            System.out.println("choose place to go!");
            System.out.println("press 0 to exit ");
            System.out.println("press 1 for  safe house");
            System.out.println("press 2 for tool store");
            System.out.println("press 3 for going to cave  award = food! ");
            System.out.println("press 4 for going to forest award = firewood ");
            System.out.println("press 5 for going to river award = water");
            System.out.println("press 6 for going to mine award = chance to win money armor weapon or nothing");
            System.out.println("-------------------------------------------------------------");
            int place = scan.nextInt();
            switch (place){
                case 0:
                    a1 = null;
                    break;
                case 1:
                    a1 = new safeHouse(p1);
                    break;
                case 2:
                    a1 = new toolStore(p1);
                    break;
                case 3:
                    if (p1.getInv().isFood()){
                        System.out.println("you cleared cave");
                        continue;
                    }else a1 = new cave(p1);
                    break;
                case 4:
                    if (p1.getInv().isFirewood()){
                        System.out.println("you cleared forest");
                        continue;
                    }else a1 = new forest(p1);
                    break;
                case 5:
                    if (p1.getInv().isWater()){
                        System.out.println("you cleared river");
                        continue;
                    }else a1 = new river(p1);
                    break;
                case 6:
                    a1 = new mine(p1);
                    break;
            }
            if (a1 == null){
                System.out.println("you give up loser!!");
                break;
            }

            if (!a1.onLocation()){
                System.out.println("GAME OVER!");
                break;
            }

        }


    }
}

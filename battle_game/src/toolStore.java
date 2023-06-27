public class toolStore extends normalLoc {

    public toolStore(player player) {
        super(player, "toolStore");
    }

    @Override
    public boolean onLocation() {
        boolean showMenu = true;
       while (showMenu){
           System.out.println("Welcome to the Tool Store!");
           System.out.println("press 1 for weapons--------");
           System.out.println("press 2 for armors --------");
           System.out.println("press 3 for exit------------");
           System.out.print("seçiminiz:  ");

           int pressedNum = location.input.nextInt();

           while (pressedNum < 1 || pressedNum > 3) {
               System.out.println("unvalid input please try again");
               pressedNum = location.input.nextInt();
           }
           switch (pressedNum) {
               case 1:
                   printWeapon();
                   buyWeapon();
                   break;
               case 2:
                   printArmor();
                   buyArmor();
                   break;
               case 3:
                   System.out.println("we are waiting for you soon!");
                   showMenu = false;
                   break;
           }
       }


        return true;
    }


    public void printWeapon() {
        System.out.println("weapons : ");
        //static metod tanımlamanın önemi eğer weapon listini static tanımlamazsak hata alıyoruz!!
        for (weapon i : weapon.weapons()) {
            System.out.println("name: " + i.getName() + "   Id: " + i.getId() + "     damage: " + i.getDamage() + "     price: " + i.getPrice());
        }
        System.out.println("press 0 for exit!");
    }

    public void buyWeapon() {
        System.out.print("choose your weapon by pressing ID no.");
        //weapon id no almak için scanner
        int chosenWeaponIDNo = input.nextInt();
        //girilen input kontrolü yapılıyor
        while (chosenWeaponIDNo < 0 || chosenWeaponIDNo > weapon.weapons().length) {
            System.out.print("enter valid ID No!");
            chosenWeaponIDNo = input.nextInt();
        }



        if (chosenWeaponIDNo != 0 ){
            weapon selectedWeapon = weapon.getWeaponByID(chosenWeaponIDNo);

            if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                System.out.println("you can't afford " + selectedWeapon.getName());
                System.out.println("your money is =" + this.getPlayer().getMoney());
            } else {
                System.out.println("new weapon = " + selectedWeapon.getName());
                int newPlayerMoney = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                this.getPlayer().setMoney(newPlayerMoney);
                System.out.println("your money is =" + this.getPlayer().getMoney());
                System.out.println("weapon before purchase => " + this.getPlayer().getInv().getWeaponn().getName());
                this.getPlayer().getInv().setWeaponn(selectedWeapon);
                System.out.println("weapon after purchase => " + this.getPlayer().getInv().getWeaponn().getName());

            }
        }


    }

    public void printArmor() {
        System.out.println("armors : ");
        //static metod tanımlamanın önemi eğer weapon listini static tanımlamazsak hata alıyoruz!!
        for (armor i : armor.armors()) {
            System.out.println("name: " + i.getName() + "   Id: " + i.getId() + "     block: " + i.getReflectValue() + "     price: " + i.getPrice());
        }
        System.out.println("press 0 for exit!");
    }

    public void buyArmor(){
        System.out.print("press armor id");
        int pressedArmorID = location.input.nextInt();

        while ( pressedArmorID < 0  || pressedArmorID > armor.armors().length){
            System.out.println("enter valid armor ID");
            pressedArmorID = location.input.nextInt();
        }

        if (pressedArmorID != 0){
            armor selectedArmor = armor.getArmorByID(pressedArmorID);

            if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                System.out.println("you can't afford " + selectedArmor.getName());
                System.out.println("your money is =" + this.getPlayer().getMoney());
            } else {
                System.out.println("new armor = " + selectedArmor.getName());
                int newPlayerMoney = this.getPlayer().getMoney() - selectedArmor.getPrice();
                this.getPlayer().setMoney(newPlayerMoney);
                System.out.println("your money is =" + this.getPlayer().getMoney());
                System.out.println("armor before purchase => " + this.getPlayer().getInv().getArmorr().getName());
                this.getPlayer().getInv().setArmorr(selectedArmor);
                System.out.println("armor after purchase => " + this.getPlayer().getInv().getArmorr().getName());

            }
        }





    }


}

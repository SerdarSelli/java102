import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

   Xbox xbox1 = new Xbox();
   xbox1.AddController(new XboxController());


            //ps için kol ekleme ve yanlış kol eklenirse hata mesajı verme
//        Playstation ps = new Playstation();
//        ps.AddController(new XboxController());

        //computer için kol ekleme
//        Computer comp = new Computer();
//        comp.AddController(new XboxController());

        //cihazı üst üste açtığın zaman exception senaryosu
//        xbox1.open();
//        xbox1.open();

        //cihaz kapalıyken exception verme senaryosu
        xbox1.playGame();
        xbox1.open();
        xbox1.playGame();
        







    }
}
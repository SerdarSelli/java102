import java.util.*;

public class input {
    private LinkedHashSet<String> team_list;
    private ArrayList<String> roundList;
    private ArrayList<String> teamListReal;
    public  Scanner scan= new Scanner(System.in);




    public input(){
        team_list = new LinkedHashSet<>();
        roundList = new ArrayList<>();
        teamListReal = new ArrayList<>();

    }
    public ArrayList<String> getTeamListReal() {
        return teamListReal;
    }

    public void setTeamListReal(ArrayList<String> teamListReal) {
        this.teamListReal = teamListReal;
    }

    public LinkedHashSet<String> getTeam_list() {
        return team_list;
    }

    public void setTeam_list(LinkedHashSet<String> team_list) {
        this.team_list = team_list;
    }

    public void addElement(String element){
        team_list.add(element);
    }

    public void addElementRoundList(String elemnt){
        roundList.add(elemnt);
    }

    public ArrayList<String> getRoundList() {
        return roundList;
    }

    public void setRoundList(ArrayList<String> roundList) {
        this.roundList = roundList;
    }

    public void takimEkle(){

            System.out.println("how many teams do you enter?");
            int numberOfTeams = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter "+ numberOfTeams +" team name");

            for (int i = 0; i<numberOfTeams;i++){
              //  System.out.println("Enter team name");
                String addTeam = scan.nextLine().trim();
// aynı isim girmeme kontrolü
                while (team_list.contains(addTeam) || addTeam.isEmpty()){
                    System.out.println("you enter same name again please try new name!"+i+" name left");
                    addTeam = scan.nextLine();
                }
                addElement(addTeam);
            }
    }

    public void generator() {
        int roundNo = 0;// toplam takım sayısı tek veya çift olduğunda bay eklenmesi ve round sayısı belirlenmesi
    if (getTeam_list().size()%2==0){
        roundNo = getTeam_list().size() -1;

    }else {
        roundNo = getTeam_list().size() ;
        addElement("bay");
    }


        for (int i = 0; i< roundNo ; i++ ){// round döngüsü
            System.out.println("########## round " + (i+1));

            List<String> teamss = new ArrayList<>();
            teamss.addAll(getTeam_list());
            getTeamListReal().clear();

            ArrayList<String> home = new ArrayList<>();//evinde maç yapan takım bura birden fazla kez eklenir
            ArrayList<String> away = new ArrayList<>();//deplasmanda maç yapan takım birden fazla buraya eklenir

//round içi takımlar
            for (int j = 0 ; j < getTeam_list().size()  / 2 ;j++){

                String first = teamss.get(randomNumber());//rastgele takım belirleme
                String second = teamss.get(randomNumber());//rastgele takım belirleme

                // bir takımın kendiyle eşleşmemesi, birden fazlakez eşleşmemesi, aynı takımla maç yapmaması
                while(first.equals(second) || matchControl(first,second) || isDuble(first,second) || homeCOntrol(home,first, getTeam_list().size()) || awayControl(away,second, getTeam_list().size())){
                    first = teamss.get(randomNumber());
                    second = teamss.get(randomNumber());
                }

                System.out.println(first+" vs "+ second);
                home.add(first);
                away.add(second);

                addElementRoundList(first+second);
                getTeamListReal().add(first);
                getTeamListReal().add(second);

            }
            getTeamListReal().clear();//takımlar her roundda 1 defa olması için

        }
        System.out.println("sezon sonu");

    }

    public boolean homeCOntrol(ArrayList<String> home, String first,int teamSize){ // takım sayısı / 2 kez evinde maç yapma kontrolü
        int counterFirst=0;

        for (String i:home
             ) {
            if (i.equals(first)){
                counterFirst++;
            }
            if (counterFirst>=teamSize/2){
                return true;
            }
        }
        return false;

    }

    public boolean awayControl (ArrayList<String> away,String second, int teamSize){// takım sayısı / 2 kez deplasmanda maç yapma kontrolü
        int counter=0;
        for (String i :away
             ) {
            if (i.equals(second)){
                counter++;
            }
            if (counter>=teamSize/2){
                return true;
            }
        }
        return false;
    }

    public void restOfRound(){// 2.sezonu hafızadan yazdırmak için metod
        for (int i = 0 ; i<getRoundList().size();i+=3){
            String firstt = getRoundList().get(i);
            String second = getRoundList().get(i+1);
            System.out.println(firstt+" vs "+ second);
        }

    }
public Boolean isDuble(String a,String b){//  a team have to match 1 time for particular week
        if (getTeamListReal().contains(a) || getTeamListReal().contains(b)){
            return true;
        }
        return false;
}
    public boolean matchControl (String a, String b){// takımların birbirleriyle birden fazla kez eşleşmesini engeller

        if (getRoundList().contains(a+b) || getRoundList().contains(b+a)  ){
            return true;
        }
        return false;

    }

    public void printTeams(){
        for (String i: getTeam_list()){
            System.out.println(i);
        }
    }

    public void run(){
        takimEkle();
        //printTeams();
        generator();
    }

    // random sayı üretici
    public int randomNumber(){
        Random rndm = new Random();
        return rndm.nextInt(0, team_list.size()+0);
    }








}

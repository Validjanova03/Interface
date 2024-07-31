public class Footballplayer implements Player {

    public static void countOfRedCard(){
        System.out.println("5 dona qizil karta olgan");
    }

    public static void countOfYellowCard(){
    System.out.println("6 dona sariq karta olgan");
    }

    public static void countOfGoals(){
        System.out.println("25 dona gol urgan");
    }

    public void nameOfPlayer(){
        System.out.println("Anvar Baxodirov");
    }

    public void sportType(){
        System.out.println("Football oyinchisi");
    }

    public void numberPosition(){
        System.out.println("Hujumchi");
    }

    public void GetTeamName(){
        System.out.println("Bunyodkor jamoasi");
    }

    public void GetInfo(){
        System.out.println("Football Player Information: ");
    }
    public static void main(String[] args){
        Footballplayer ft = new Footballplayer();
        ft.GetInfo();
        ft.GetTeamName();
        ft.sportType();
        ft.numberPosition();
        ft.nameOfPlayer();
        ft.countOfRedCard();
        ft.countOfYellowCard();
        ft.countOfGoals();
    }
}

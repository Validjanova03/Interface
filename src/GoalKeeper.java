public class GoalKeeper extends Footballplayer{
    public void GetInfo(){
        System.out.println("Varatar Informatsiyasi: ");
    }

    public static void countOfSaves(){
        System.out.println("15 ta Golni qaytargan");
    }

    public void GetTeamName(){
        System.out.println("Bunyodkor jamoasi");
    }
   public void nameOfPlayer(){
       System.out.println("Rahim Dilshodov");
   }
public static void main(String[] args){
        GoalKeeper gk = new GoalKeeper();
        gk.GetInfo();
        gk.GetTeamName();
        gk.nameOfPlayer();
        gk.countOfSaves();
}

}

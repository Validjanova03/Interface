public  class Volleyballplayer implements Player {


    public void GetInfo() {
        System.out.println("Volleyballchi informatsiyasi: ");
    }

    public void nameOfPlayer() {
        System.out.println("Oleg Hakamov");
    }

    public void sportType() {
        System.out.println("Volleyball ");
    }

    public void numberPosition() {
        System.out.println("02");
    }

    public void GetTeamName() {
        System.out.println("Cokeer jamoasi");
    }
    public void NumberOfPoints() {
        System.out.println("186 ball yeg'gan");
    }
public static void main(String[] args){
        Volleyballplayer v = new Volleyballplayer();
        v.GetInfo();
        v.nameOfPlayer();
        v.sportType();
        v.numberPosition();
        v.NumberOfPoints();
        v.GetTeamName();

}
}

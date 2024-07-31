public class Basketballplayer implements Player {

    @Override
    public void GetInfo() {
        System.out.println("Basketball Information: ");
    }

    @Override
    public void nameOfPlayer() {
        System.out.println("Krill Zaburov");
    }

    @Override
    public void sportType() {
        System.out.println("Basketball ");
    }

    @Override
    public void numberPosition() {
        System.out.println("12 number");
    }

    @Override
    public void GetTeamName() {
        System.out.println("Freefly");
    }
    public void NumberofGoals(){
        System.out.println("23 Goals");
    }
    public static void main(String[] args) {
        Basketballplayer b = new Basketballplayer();
        b.GetInfo();
        b.nameOfPlayer();
        b.sportType();
        b.numberPosition();
        b.GetTeamName();
        b.NumberofGoals();
    }
}

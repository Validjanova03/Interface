public class Pointguard extends Basketballplayer {
    @Override
    public void GetInfo() {
        super.GetInfo();
    }
    public void Pointguard() {
        System.out.println("Halil Ali");
    }

    @Override
    public void GetTeamName() {
        super.GetTeamName();
    }
    public void Pointguard2() {
        System.out.println("Point Guard");
    }
    public static void main(String[] args) {
        Pointguard p = new Pointguard();
        p.GetInfo();
        p.Pointguard();
        p.GetTeamName();
        p.Pointguard2();
    }
}

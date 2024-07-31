public class setter extends Volleyballplayer{
    @Override
    public void GetInfo() {
        System.out.println("Volleyballchi Informatsiyasi:");
    }

    @Override
    public void nameOfPlayer() {
        System.out.println("Ilyos Komilov");
    }

    @Override
    public void numberPosition() {
        System.out.println("5");
    }
public void countSets(){
    System.out.println("52 ");
}
    public static void main(String[] args) {
        setter volleyballplayer = new setter();
        volleyballplayer.GetInfo();
        volleyballplayer.nameOfPlayer();
        volleyballplayer.numberPosition();
        volleyballplayer.countSets();

    }
}

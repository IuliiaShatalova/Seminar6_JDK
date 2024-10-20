public class Main {
    public static void main(String[] args) {
        MontyHall montyHall = new MontyHall();
        montyHall.Play();
        System.out.println("Побед без смены двери : " + montyHall.Print("Победа"));
        System.out.println("Побед со сменой двери : " + montyHall.Print("Победа(смена)"));
        System.out.println("Проигрышей без смены двери : " + montyHall.Print("Проигрыш"));
        System.out.println("Проигрышей со сменой двери : " + montyHall.Print("Проигрыш (смена)"));
    }
}

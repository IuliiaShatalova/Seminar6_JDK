import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MontyHall {
    public static int count = 1000;
    static Random random = new Random();

    private int playersDoor;
    private int carDoor;
    private int hostDoor;

    private Map<Integer, String> result = new HashMap<>();

    public void Play() {
        for (int i = 0; i < count; i++) {
            carDoor = random.nextInt(1,4);
            playersDoor = random.nextInt(1,4);
            hostDoor = pickADoor(carDoor, playersDoor);
            boolean switchDoor = random.nextBoolean();

            if(switchDoor){
                playersDoor = pickADoor(playersDoor, hostDoor);
                if(playersDoor == carDoor){
                    result.put(i, "Победа(смена)");
                }
                else { result.put(i, "Проигрыш (смена)");}
            }
            else {
                if(playersDoor == carDoor){
                    result.put(i, "Победа");
                }
                else { result.put(i, "Проигрыш");}
            }
        }
    }

    private int pickADoor(int door1, int door2){
        int result;
        do {
            result = random.nextInt(1, 4);
        } while (result == door1 || result == door2);
        return result;

    }

    public int Print(String str){
        int res = 0;

        for (int k: result.keySet()){
            if(result.get(k).equals(str)){
                res ++;
            }
        }
        return res;
    }
}

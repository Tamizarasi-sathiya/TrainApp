import java.util.HashMap;
import java.util.Map;

public class TrainManagement {
    public static void main(String[] args) {
        HashMap<String, Integer> bogieMap = new HashMap<>();

        bogieMap.put("Sleeper", 72);
        bogieMap.put("AC Chair", 60);
        bogieMap.put("First Class", 24);

        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
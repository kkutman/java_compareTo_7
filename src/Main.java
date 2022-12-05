import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer>linkedList = new LinkedList<>();
        ArrayList<Integer>arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(random.nextInt(0,2));
            arrayList.add(random.nextInt(0,2));
        }
        Collections.sort(linkedList);
        Collections.sort(arrayList);
        System.out.println(linkedList);
        System.out.println(arrayList);
    }
}
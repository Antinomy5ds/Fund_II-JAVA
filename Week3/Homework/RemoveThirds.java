import java.util.ArrayList;

public class RemoveThirds {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 0;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(3);
        list.add(9);

        while (i < list.size()) {
            if (list.get(i) % 3 == 0) {
                list.remove(i);
            } else {
                i++;
            }
        }
        System.out.println(list);
    }
}

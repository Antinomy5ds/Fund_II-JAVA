import java.util.ArrayList;

public class Lab37ArraysList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Paul");
        arrayList.add("Pete");
        arrayList.add("John");
        arrayList.add("George");
        System.out.println(arrayList);
        String g = arrayList.get(2);
        arrayList.remove(2);
        System.out.println(arrayList);
        arrayList.add(1, "Ringo");
        int i = arrayList.indexOf("Ringo");
        System.out.println("At Index " + i + " : " + arrayList.get(1));
        System.out.println(arrayList);
        arrayList.set(2, "Johny");
        System.out.println("Edit name " + g + " -> " + arrayList.get(2));
        System.out.println("Size of the band: " + arrayList.size());
        for (int j = 0; j < arrayList.size(); j++) {
            System.out.println(arrayList.get(j));
        }

    }
}

public class BinarySearch {
    public static String binarySearch(int[] list, int c) {
        int i = 0, j = list.length - 1; // j ลบ 1 เพราะ array เริ่มจาก 0
        while (i <= j) {
            int mid = (i + j) / 2; // หาค่ามัธยฐาน
            if (c < list[mid]) { // ให้เช็คว่า ค่าที่เช็ค มากกว่าหรือน้อยกว่าตำแหน่งมัธยฐาน
                j = mid - 1; // ถ้าน้อยให้ถอยไปตำแหน่งนึง
            } else if (c > list[mid]) { //
                i = mid + 1; // ถ้ามากกว่าขยับไปอีกตำแหน่ง
            } else {
                return Integer.toString(mid); // ต้องคืนค่าเป็น String
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] number = { 1, 2, 4, 5, 7, 8, 11, 13 };
        int[] check = { 5, 13, 10 };
        for (int k = 0; k < check.length; k++) {
            System.out.printf("%s\n", binarySearch(number, check[k]));
        }
    }
}

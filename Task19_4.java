package task9;

public class Task19_4 {
    public static void main(String[] args) {
        Integer[] list = new Integer[20];
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }
        System.out.println(linearSearch(list, 1));
        System.out.println(linearSearch(list, 10));
        System.out.println(linearSearch(list, 30));

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

    }

    public static <E extends Comparable<E>> int linearSearch(E[] list, E value) {

        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(value) == 0) {
                return i;
            }
        }

        return -1;
    }
}
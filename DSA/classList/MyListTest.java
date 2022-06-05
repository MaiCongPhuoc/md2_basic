package classList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(0);
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        System.out.println(listInteger);
//        System.out.println("element 4: " + listInteger.get(4));
//        System.out.println("element 1: " + listInteger.get(1));
//        System.out.println("element 2: " + listInteger.get(2));

//        listInteger.get(11);
//        System.out.println("element 11: " + listInteger.get(11));

//        listInteger.get(-1);
//        System.out.println("element -1: " + listInteger.get(-1));
    }
}

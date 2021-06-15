public class MyListTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyList<Integer> list = new MyList<>();
        list.add(5);
        list.add(6);
        list.add(68);
        list.add(4);
        list.add(75);
        list.add(12);
        list.add(35);
        list.add(79);
        list.add(100);
        list.add(7459);
        list.add(4, 12);
        System.out.println(list);
        Integer list1 = list.clone();
        System.out.println(list1);
    }

}

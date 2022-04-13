package _10_dsa_list.exercise.implement_arraylist_method_by_library;

public class MyListTest {
    public static void main(String[] args) {
    MyList<Integer> listinteger = new MyList<>();
    listinteger.add(1);
    listinteger.add(2);
    listinteger.add(3);
    listinteger.add(4);

    listinteger.add(1,9);
//    listinteger.remove(1);

        System.out.println(listinteger.get(1));
        System.out.println(listinteger.get(2));
        System.out.println(listinteger.get(3));
        System.out.println(listinteger.toString());
        System.out.println(listinteger.contains(3));

        listinteger.clear();
        System.out.println(listinteger.toString());

    }
}

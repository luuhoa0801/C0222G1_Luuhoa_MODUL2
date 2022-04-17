package _12_java_collection_framework.exercise.using_arraylist_liskedlist_javacollection.using_linkedlist;



import java.util.*;

public class ProductManager {
    static Scanner scanner = new Scanner(System.in);
    static List<Product> arrayList = new LinkedList<>();

    static {
        arrayList.add(new Product(1, "coca", 3000));
        arrayList.add(new Product(2, "pepsi", 2000));
        arrayList.add(new Product(3, "7up", 8000));
        arrayList.add(new Product(4, "string", 4000));
    }


    public void displayList(){
//        for (int i = 0; i <arrayList.size() ; i++) {
//            if (arrayList.get(i) != null){
//                System.out.println();
//            }
//        }
        for (Product product: arrayList) {
            System.out.println(product);
        }
    }
    public void fixList(){
        System.out.println("Input id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Input name: ");
        String name = scanner.nextLine();
        System.out.print("Input price: ");
        int price = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == id) {
                arrayList.remove(i);
                arrayList.add(new Product(id, name, price));
                break;
            }
        }
        Collections.sort(arrayList);
        displayList();
    }
    public void add(){
        System.out.println("Input id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Input name");
        String name = scanner.nextLine();
        System.out.println("Input price");
        int price = Integer.parseInt(scanner.nextLine());
        arrayList.add(new Product(id,name,price));
        Collections.sort(arrayList);
        displayList();
    }
    public  void remove(){
        System.out.println("Input id remove: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <arrayList.size() ; i++) {
            if (arrayList.get(i).getId() == id){
                arrayList.remove(i);
                break;
            }
        }
        Collections.sort(arrayList);
        displayList();
    }
    public void search(){
        System.out.print("Input name search: ");
        String search = scanner.nextLine();
        for (int i = 0; i <arrayList.size() ; i++) {
//            if (arrayList.get(i).getName().equals(search)){
//                System.out.println(arrayList.get(i));
//            }
            if (arrayList.get(i).getName().contains(search)){
                System.out.println(arrayList.get(i));
            }
        }
        Collections.sort(arrayList);
    }
    public void sortPrice(){
        ProductPriceUp productPriceUp = new ProductPriceUp();
        Collections.sort(arrayList,productPriceUp);
        displayList();
    }

}

package _05_accessmodifier_staticmethod_staticproperty.exerise.build_write_only_classes_in_Java;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
       student.setName("Hoa");
       student.setClasses("C0222G1");
        System.out.println(student.getName());
        System.out.println(student.getClasses());

    }
}

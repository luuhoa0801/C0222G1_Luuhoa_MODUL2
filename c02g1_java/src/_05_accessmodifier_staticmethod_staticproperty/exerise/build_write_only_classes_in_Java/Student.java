package _05_accessmodifier_staticmethod_staticproperty.exerise.build_write_only_classes_in_Java;

public class Student {
    private String name  ;
    private String classes ;
    Student(){
        this.name = "John" ;
        this.classes = "C02" ;
    }
    Student(String name, String classes){
        this.name = name ;
        this.classes = classes ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

}

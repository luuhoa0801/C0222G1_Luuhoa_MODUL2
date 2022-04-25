package _19_string_and_regex.exercise.validate_the_name_of_the_class;

public class ClassNameExampleTest {
    private static ClassNameExample classNameExample;
    private static final String validClass = new String("C0318G");
    private static final String[] invalidClass= new String[]{"M0318G","P0323A"};

    public static void main(String[] args) {
        classNameExample = new ClassNameExample();
        boolean isvalidClass = classNameExample.validate(validClass);
        System.out.println("ClassNameExample "+ validClass +" isvalid: "+ isvalidClass);

        for (String name: invalidClass){
            boolean isvalid = classNameExample.validate(name);
            System.out.println("ClassNameExample "+name + " isvalid: " + isvalid);
        }
    }
}

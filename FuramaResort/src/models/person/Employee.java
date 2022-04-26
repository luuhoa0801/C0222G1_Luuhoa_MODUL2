package models.person;

public class Employee extends Person {
    private String idEmployee;
    private String level;
    private String position;
    private int salary;
    public Employee() {
    }
    public Employee(String idEmployee ,String level, String position, int salary) {
        this.idEmployee = idEmployee;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name,
                    String dateOfBirth, String gender, int idCard,
                    int phoneNumber, String email,String idEmployee,
                    String level, String position, int salary)
    {
        super(name, dateOfBirth, gender, idCard, phoneNumber, email);
        this.idEmployee = idEmployee;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }



    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() + '\''+
                ", idEmployee=" + idEmployee +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}

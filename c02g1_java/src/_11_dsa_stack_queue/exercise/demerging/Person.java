package _11_dsa_stack_queue.exercise.demerging;

public abstract class Person implements Comparable<Person>{
    private String name;
    private int dateOfBirth;
    private boolean gender;

    public Person(String name, int dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                '}';
    }
    public int compareTo(Person o){
        if (dateOfBirth > o.dateOfBirth){
            return -1;
        }else if (dateOfBirth < o.dateOfBirth){
            return 1;
        }
        return 0;
    }
}

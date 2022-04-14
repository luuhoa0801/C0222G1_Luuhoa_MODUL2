package _11_dsa_stack_queue.exercise.demerging;

public class Nam extends Person {
    public final boolean gender=true;
    public Nam(String name, int dateOfBirth) {
        super(name, dateOfBirth);
    }

    @Override
    public boolean isGender() {
        return this.gender;
    }

    @Override
    public void setGender(boolean gender) {
        super.setGender(gender);
    }

    @Override
    public String toString() {
        return super.toString() + ", gender= "+ gender;
    }

    @Override
    public int compareTo(Person o) {
        return super.compareTo(o);
    }
}

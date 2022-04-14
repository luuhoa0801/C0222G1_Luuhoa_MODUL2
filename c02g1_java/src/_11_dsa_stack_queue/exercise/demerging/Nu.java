package _11_dsa_stack_queue.exercise.demerging;

public class Nu extends Person {
    public final boolean gender = false;
    public Nu(String name, int dateOfBirth) {
        super(name, dateOfBirth);
    }

    @Override
    public boolean isGender() {
        return super.isGender();
    }

    @Override
    public void setGender(boolean gender) {
        super.setGender(gender);
    }

    @Override
    public String toString() {
        return super.toString() + ",gender= "+gender;
    }

    @Override
    public int compareTo(Person o) {
        return super.compareTo(o);
    }
}

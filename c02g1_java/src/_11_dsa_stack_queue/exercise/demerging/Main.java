package _11_dsa_stack_queue.exercise.demerging;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> arraylistPerson = new ArrayList<>();
        arraylistPerson.add(new Nam("Hòa",1995));
        arraylistPerson.add(new Nu("ly",1994) );
        arraylistPerson.add(new Nu("Nhung",1997));
        arraylistPerson.add(new Nam("Long",1998));
        arraylistPerson.add(new Nu("Thuy",2000));

        Collections.sort(arraylistPerson);
        Queue<Person> nam = new LinkedList<>();
        Queue<Person> nu = new LinkedList<>();
        for (int i = 0; i <arraylistPerson.size() ; i++) {
            if (arraylistPerson.get(i).isGender()){
                nam.add(arraylistPerson.get(i));
            }else {
                nu.add(arraylistPerson.get(i));
            }
        }
        for (int i = 0; i <arraylistPerson.size() ; i++) {
            if (!nu.isEmpty()){
                arraylistPerson.set(i,nu.poll());
            }else {
                arraylistPerson.set(i,nam.poll());
            }
        }
        for (int i = 0; i <arraylistPerson.size() ; i++) {
            System.out.println(arraylistPerson.get(i).toString());
        }

    }
}

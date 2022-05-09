package utils;

import models.SubjectDemo;

import java.util.Comparator;

public class ComparatorTime implements Comparator<SubjectDemo> {
    @Override
    public int compare(SubjectDemo o1, SubjectDemo o2) {
        if (o1.getTime() > o2.getTime()){
            return -1;
        }else if (o1.getTime() < o2.getTime()){
            return 1;
        }else{
            return 0;
        }
    }

}

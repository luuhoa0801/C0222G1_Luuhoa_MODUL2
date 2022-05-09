package utils;

import models.Work;

import java.util.Comparator;

public class CompareByOrder implements Comparator<Work> {

    @Override
    public int compare(Work o1, Work o2) {
        int e1 = byOrder(o1.getByPriority());
        int e2 = byOrder(o2.getByPriority());
        if (e1 > e2 ){
            return 1;
        }else if (e1 < e2){
            return -1;
        }else
            return 0;
    }

    public int byOrder(String input){
        switch (input){
            case "High":
                return 1;
            case "Normal":
                return 2;
            case "Low":
                return 3;
            default:
                return 0;
        }
    }

}

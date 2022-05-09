package utils;

import models.Work;

import java.util.Comparator;

public class CompareByPriority implements Comparator<Work> {

    @Override
    public int compare(Work o1, Work o2) {
        int e1 = byWrite(o1.getDay());
        int e2 = byWrite(o2.getDay());
        if (e1 > e2 ){
            return 1;
        }else if (e1 < e2){
            return -1;
        }else
            return 0;
    }

    public int byWrite(String input){
        switch (input){
            case "Thứ 2":
                return 1;
            case "Thứ 3":
                return 2;
            case "Thứ 4":
                return 3;
            case "Thứ 5":
                return 4;
            case "Thứ 6":
                return 5;
            case "Thứ 7":
                return 6;
            case "CN":
                return 7;
            default:
                return 0;
        }
    }
}

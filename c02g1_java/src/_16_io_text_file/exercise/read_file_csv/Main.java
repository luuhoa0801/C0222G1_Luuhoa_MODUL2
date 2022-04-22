package _16_io_text_file.exercise.read_file_csv;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Nation> arrayList = new ArrayList<>();
        List<String[]> stringsList =  ReadAndWrite.readFile("src\\_16_io_text_file\\exercise\\read_file_csv\\test.csv");
        Nation nation;
        for (String[] item: stringsList) {
             nation = new Nation(Integer.parseInt(item[0]),item[1],item[2]);
            arrayList.add(nation);
        }
        for (Nation item: arrayList) {
            System.out.println(item.toString());
        }
    }
}

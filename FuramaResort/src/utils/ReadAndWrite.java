package utils;

import models.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String[]> readFile(String path){
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String[]> strList = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line =bufferedReader.readLine()) != null && !line.equals("")){
                String[] arrayList =line.split(",");
                strList.add(arrayList);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void writeFile(String filePath,String line){
        File file = new File(filePath);
        try (FileWriter fileWriter = new FileWriter(file,false);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);)
        { bufferedWriter.write(line);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeFile(String filePath, List<Employee> listLine){
        String line = "";
//        String line = name +","+ dateOfBirth +","+ gender +","+ idCard +","+ phoneNumber +","+ email +
//                ","+ idEmployee +","+ level +","+ position +","+ salary;
        for ( Employee item: listLine){
            line += item.getName() +","+ item.getDateOfBirth() +","+item.getGender() +","+item.getIdCard()
                    +","+ item.getPhoneNumber() +","+ item.getEmail()+
                ","+ item.getIdEmployee() +","+ item.getLevel() +","+ item.getPosition() +","+ item.getSalary() + "\n";

        }
        writeFile(filePath,line);
    }
}

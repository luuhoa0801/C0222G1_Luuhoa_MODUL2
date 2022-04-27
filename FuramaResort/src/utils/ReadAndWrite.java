package utils;

import models.person.Customer;
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
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line =bufferedReader.readLine()) != null && !line.equals("")){
                String[] arrayList =line.split(",");
                strList.add(arrayList);
            }
            return strList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bufferedReader != null)
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
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
    public static Object readFileFacility(String path){
        File file = new File(path);
        FileInputStream is = null;
        ObjectInputStream ois = null;
        Object obj = null;
        try{
            is = new FileInputStream(file);
            ois = new ObjectInputStream(is);
            obj = ois.readObject();
            return obj;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    public static void writeFileFacility(String path, Object obj){
        File file = new File(path);
        FileOutputStream os = null;
        ObjectOutputStream oos = null;
        try {
            os = new FileOutputStream(file);
            oos = new ObjectOutputStream(os);
            oos.writeObject(obj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



//    public static void writeFile(String filePath, List<Employee> listLine){
//        String line = "";
////        String line = name +","+ dateOfBirth +","+ gender +","+ idCard +","+ phoneNumber +","+ email +
////                ","+ idEmployee +","+ level +","+ position +","+ salary;
//        for ( Employee item: listLine){
//            line += item.getName() +","+ item.getDateOfBirth() +","+item.getGender() +","+item.getIdCard()
//                    +","+ item.getPhoneNumber() +","+ item.getEmail()+
//                ","+ item.getIdEmployee() +","+ item.getLevel() +","+ item.getPosition() +","+ item.getSalary() + "\n";
//        }
//        writeFile(filePath,line);
//    }


}

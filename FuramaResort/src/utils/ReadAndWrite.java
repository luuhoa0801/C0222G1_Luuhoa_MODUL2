package utils;

import models.facility.Booking;
import models.person.Customer;
import models.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ReadAndWrite {

    public static List<String[]> readFile(String path){
        File file = new File(path);
        if (file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {

            }
        }
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String[]> strList = new ArrayList<>();
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] arrayList = line.split(",");
                strList.add(arrayList);
            }
            return strList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null)
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return null;
    }
//    public static List<Employee> readFile(String path) {
//        File file = new File(path);
//        FileReader fileReader = null;
//        BufferedReader bufferedReader = null;
//        List<Employee> strList = new ArrayList<>();
//        try {
//            if (!file.exists()) {
//                throw new FileNotFoundException();
//            }
//            fileReader = new FileReader(file);
//            bufferedReader = new BufferedReader(fileReader);
//            String line = "";
//            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
//                String[] arrayList = line.split(",");
//                strList.add(new Employee());
//            }
//            return strList;
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (bufferedReader != null)
//                try {
//                    bufferedReader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//        }
//        return null;
//    }

    public static void writeFile(String filePath, String line){

        File file = new File(filePath);
        if (file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
            }
        }
        try (FileWriter fileWriter = new FileWriter(file,true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static List<String> readFileCsv(String filePath) {
//        List<String> listLine = new ArrayList<>();
//        FileReader fileReader = null;
//        try {
//            fileReader = new FileReader(filePath);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//            String line = null;
//            while ((line = bufferedReader.readLine()) != null) {
//                listLine.add(line);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (fileReader != null) {
//                    fileReader.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        return listLine;
//    }
//
//    public static void writFile(Object object, String path) {
//        File file = new File(path);
//        FileWriter outputfile = null;
//        BufferedWriter bufferedWriter = null;
//        try {
//            outputfile = new FileWriter(file, true);
//            bufferedWriter = new BufferedWriter(outputfile);
//            bufferedWriter.write(object.toString());
//            bufferedWriter.newLine();
//            bufferedWriter.flush();
//            outputfile.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (bufferedWriter != null) {
//                    bufferedWriter.close();
//                }
//                if (outputfile != null) {
//                    outputfile.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

//    public static Set<Booking> readDataBooking () {
//        Set<Booking> tempData = new TreeSet<>(new BookingComparator());
//        try {
//            File file = new File(FILE_BOOKING);
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String str = "";
//            String[] obj;
//            Booking booking;
//            while ((str = bufferedReader.readLine()) != null && ! str.equals("")) {
//                obj = str.split(",");
//
//
//
//            }
////            System.out.println("Success read booking");
//            bufferedReader.close();
//            fileReader.close();
//            return tempData;
//        } catch (FileNotFoundException e) {
//            System.err.println("FileNotFoundException booking.csv");
//        } catch (IOException e) {
//            System.err.println("IOException booking.csv");
//        }
//        return null;
//    }
}


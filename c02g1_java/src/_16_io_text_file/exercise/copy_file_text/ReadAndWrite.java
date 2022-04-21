package _16_io_text_file.exercise.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String> readFile(String filePath)  {
        List<String> stringList = new ArrayList<>();
        FileReader fileReader = null;
        File file = new File(filePath);
        BufferedReader bufferedReader = null;

        try {
           fileReader = new FileReader(file);
           bufferedReader = new BufferedReader(fileReader);
           String line;
           while ((line= bufferedReader.readLine())!= null && !line.equals("")){
//               String[] arrStr = line.split("");
               stringList.add(line);
           }
           return stringList;

        } catch (IOException e){
            e.printStackTrace();
        } finally {
            // buffereReader = null -> NullPointerException nên phải xét !=null mới .close
            if (bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
    public static void writeFile(String filePath,String line)  {
        File file = new File(filePath);
        try(
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);){
            bufferedWriter.write(line);
            bufferedWriter.newLine();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

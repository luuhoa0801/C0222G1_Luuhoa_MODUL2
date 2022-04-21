package _16_io_text_file.exercise.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String[]> readFile(String filePath)  {
        File file = new File(filePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String[]> strList = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
           while (( line = bufferedReader.readLine()) != null && !line.equals("")){
                String[] arrayList = line.split(",");
                strList.add(arrayList);
           }
            return strList;
        }catch (IOException e){
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
        try (FileWriter fileWriter = new FileWriter(file,true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);)
        { bufferedWriter.write(line);
        bufferedWriter.newLine();
    } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

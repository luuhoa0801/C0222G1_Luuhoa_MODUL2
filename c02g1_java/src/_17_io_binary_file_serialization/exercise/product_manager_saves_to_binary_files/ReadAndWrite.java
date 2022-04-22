package _17_io_binary_file_serialization.exercise.product_manager_saves_to_binary_files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public  Object readFile( String path) throws IOException {
            File file = new File(path);
            FileInputStream is = null;
            ObjectInputStream ois = null;
            Object obj = null;
            try{
                is = new FileInputStream(file);
                ois = new ObjectInputStream(is);
                obj =ois.readObject();
                return obj;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }finally {
                is.close();
            }
        return null;
    }
    public  void writeFile(String path, Object obj){
        File file = new File(path);
        FileOutputStream os = null;
        ObjectOutputStream oos = null;
        try{
        os = new FileOutputStream(file);
        oos = new ObjectOutputStream(os);
        oos.writeObject(obj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

package _16_io_text_file.exercise.copy_file_text;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//       ReadAndWrite.readFile("src\\_16_io_text_file\\exercise\\copy_file_text\\sourcefile.txt");
       List<String> stringList = ReadAndWrite.readFile("src\\_16_io_text_file\\exercise\\copy_file_text\\sourcefile.txt");
        for (String item: stringList) {
            ReadAndWrite.writeFile("src\\_16_io_text_file\\exercise\\copy_file_text\\targetfile.txt", item);
        }

    }
}

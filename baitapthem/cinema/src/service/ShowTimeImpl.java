package service;

import models.showtime.Cinema;
import models.showtime.Movie;
import models.showtime.ShowTime;
import utils.ReadAndWrite;
import utils.Regex;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowTimeImpl implements Services {
    static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_ID = "^CI-[0-9]{4}$";
//    public static final String REGEX_INT = "^[1-9]|([1-9][0-9])$";
    public static final String FILE_MOVIE ="src\\data\\movie.csv";
    static List<ShowTime> showTimes = getShowList();

    public static List<ShowTime> getShowList(){
    List<ShowTime> showTimes = new ArrayList<>();
    List<String[]> strList = ReadAndWrite.read(FILE_MOVIE);
        for (String[] item: strList) {
           if (item.length == 3){
                showTimes.add( new Cinema(Integer.parseInt(item[0]),item[1],Integer.parseInt(item[2])));
           } else {
                showTimes.add(new Movie(Integer.parseInt(item[0]),item[1],item[2],Integer.parseInt(item[3])));
           }
        }
        return showTimes;
    }

    @Override
    public void displayShowtime() {

        showTimes = getShowList();
        for ( ShowTime item: showTimes) {
            System.out.println(item);
        }
    }
    public void updateFile(){
        List<String> stringList1 = new ArrayList<>();
        for ( ShowTime item : showTimes) {
            stringList1.add(item.getLine());
        }
        File file = new File(FILE_MOVIE);
        file.delete();
        ReadAndWrite.write(FILE_MOVIE,stringList1);
    }

    @Override
    public void addNewShowTime() {
        showTimes = getShowList();
        int choice = 0;
        while (true){
            System.out.println("----Add new menu----");
            System.out.println("1. Cinema");
            System.out.println("2. Movie");
            System.out.println("3. exit menu ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
            }
            switch (choice) {
                case 1:
                    Cinema cinema = addNewCinema();
                    showTimes.add(cinema);
                    updateFile();
                    break;
                case 2:
                    Movie movie = addNewMovie();
                    showTimes.add(movie);
                    updateFile();
                    break;
                case 3:
                    return;
            }
    }


    }
    public Cinema addNewCinema(){
        showTimes = getShowList();
        // int idMovie, String nameMovie, int number
        System.out.println("Nhập mã");
        int idCinema = 0;
        boolean check = true;
        while (check){
            try {
                idCinema = Integer.parseInt(scanner.nextLine());
                if (idCinema > 0){
                    check = false;
                }else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("idCinema luôn dương");
            }

            for (ShowTime item : showTimes) {
                    if (idCinema == item.getIdMovie() ) {
                        check = true;
                        System.err.println("id đã bị trùng!!");
                        break;
                    }
            }
//            if (check) {
//                break;
//            }else {
//                System.out.println("Đã có công việc này với ID vừa nhập");
//            }
        }
        System.out.println("Nhập tên phim: ");
        String name = scanner.nextLine();
        System.out.println("Nhập số người ");
        int number;
        while (true){
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number > 0){
                    break;
                }else {
                    System.out.println("idCinema luôn dương");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return new Cinema(idCinema,name,number);
    }
    public Movie addNewMovie(){
        System.out.println("Nhập mã suất chiếu: ");
//        boolean check = true;
//        int id = showTimes.size()+1;
        int id = 0;
        while (true){
            try {
                id = Integer.parseInt(scanner.nextLine());
                if (id > 0){
                    break;
                }else {
                    System.out.println("id luôn dương");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

            boolean check = true;
            for (ShowTime item : showTimes) {
                if (id == item.getIdMovie() ) {
                    check = false;
                    break;
                }
            }
            if (!check) {
                System.out.println("Đã có công việc này với ID vừa nhập");
            }else {
                break;
            }
        }

        System.out.println("Nhập tên phim: ");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày chiếu: ");
        String date ;
        while (true){
            date = scanner.nextLine();
            try {
                Regex.dateTimeCheck(date);
                break;
            } catch (Exception e) {
                System.out.println("Bạn đã nhập sái định dạng, ngày nhập vào phải lớn hơn ngày hôm nay");
            }
        }

        int numberOfTickets;
        while (true) {
            try {
                System.out.println("Nhập số lương vé: ");
                numberOfTickets = Integer.parseInt(scanner.nextLine());
                if (numberOfTickets > 0) {
                    break;
                } else {
                    System.out.println("số lượng vé là số nguyên dương");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
//        String movie = id +","+ name+","+date+","+numberOfTickets;
//        List<String> listString = new ArrayList<>();
//        listString.add(movie);
//        ReadAndWrite.write(FILE_MOVIE,listString);

        return new Movie(id,name,date,numberOfTickets);
    }


    @Override
    public void removeShowtime() {
        showTimes = getShowList();
        displayShowtime();

        System.out.println("Nhập mã suất chiếu: ");
        int id ;
        while (true) {
            try {
                id = Integer.parseInt(scanner.nextLine());
                if (id > 0) {
                    break;
                } else {
                    System.out.println("mã là số nguyên dương");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

//        while (true){
//            id = scanner.nextLine();
//            if (id.matches(REGEX_ID)){
//                break;
//            }else {
//                System.out.println("Bạn đã nhập sai định dạng");
//            }
//        }

        boolean check = false;

        ShowTime show = null;
        for (ShowTime item: showTimes) {
//            if (item.getIdMovie().equals(id)){
//                movie = item;
//                check = true;
//                break;
//            }
            if (id == item.getIdMovie()){
                show = item;
                check = true;
                break;
            }
        }
        if (check){
            System.out.println("Bạn có chắc chắn xóa suất chiếu này ko");
            System.out.println("1: Yes");
            System.out.println("2: No");
            boolean flag = true;
            while (flag){
                switch (scanner.nextLine()){
                    case "1":
                        flag = false;
                        break;
                    case "2":
                        return;
                }
            }

            showTimes.remove(show);
            updateFile();


//            File file = new File(FILE_MOVIE);
//            file.delete();
//
//            List<String> stringList = new ArrayList<>();
//
//            for (ShowTime item: showTimes) {
//                stringList.add(item.getLine());
//            }
//            ReadAndWrite.write(FILE_MOVIE,stringList);


            System.out.println("Đã xóa thành công suất chiếu");
        } else {
            System.out.println("Không có suất chiếu với id này");
        }

    }

    @Override
    public void editShowtime() {
        showTimes = getShowList();
        System.out.println("Nhập id bạn muốn tìm");
    }


}

package models.showtime;

import java.time.LocalDate;

public class Movie extends ShowTime {

    private String startDay;
    private int numberOfTickets;

    public Movie() {
    }

    public Movie(String startDay, int numberOfTickets) {
        this.startDay = startDay;
        this.numberOfTickets = numberOfTickets;
    }

    public Movie(int idMovie, String nameMovie, String startDay, int numberOfTickets) {
        super(idMovie, nameMovie);
        this.startDay = startDay;
        this.numberOfTickets = numberOfTickets;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public Movie(int idMovie, String nameMovie) {
        super(idMovie, nameMovie);
    }

    @Override
    public int getIdMovie() {
        return super.getIdMovie();
    }

    @Override
    public void setIdMovie(int idMovie) {
        super.setIdMovie(idMovie);
    }

    @Override
    public String getNameMovie() {
        return super.getNameMovie();
    }

    @Override
    public void setNameMovie(String nameMovie) {
        super.setNameMovie(nameMovie);
    }

    @Override
    public String toString() {
        return "Movie{" + super.toString()+
                "startDay='" + startDay + '\'' +
                ", numberOfTickets=" + numberOfTickets +
                '}';
    }

    public String getLine(){
        return  super.getLine() + "," +
                 startDay + "," +
                 numberOfTickets;
    }
}

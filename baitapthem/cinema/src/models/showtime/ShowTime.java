package models.showtime;

public class ShowTime {
    private int idMovie;
    private String nameMovie;

    public ShowTime() {
    }

    public ShowTime(int idMovie, String nameMovie) {
        this.idMovie = idMovie;
        this.nameMovie = nameMovie;
    }

    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    @Override
    public String toString() {
        return "ShowTime{" +
                "idMovie=" + idMovie +
                ", nameMovie='" + nameMovie + '\'' +
                '}';
    }

    public String getLine(){
        return idMovie + "," + nameMovie;
    }
}

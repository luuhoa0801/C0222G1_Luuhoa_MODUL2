package models.showtime;

public class Cinema  extends ShowTime{
    private int number;

    public Cinema() {
    }

    public Cinema(int number) {
        this.number = number;
    }

    public Cinema(int idMovie, String nameMovie, int number) {
        super(idMovie, nameMovie);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Cinema(int idMovie, String nameMovie) {
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
        return "Cinema{" + super.toString() +
                "number=" + number +
                '}';
    }
    public String getLine(){
        return  super.getLine() + "," + number;
    }
}

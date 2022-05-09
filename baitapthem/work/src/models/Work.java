package models;

public class Work {
    private String idWork;
    private String name;
    private String day;
    private String byPriority;
    private String status;

    public Work() {
    }

    public Work(String idWork, String name, String day, String byPriority, String status) {
        this.idWork = idWork;
        this.name = name;
        this.day = day;
        this.byPriority = byPriority;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIdWork() {
        return idWork;
    }

    public void setIdWork(String idWork) {
        this.idWork = idWork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getByPriority() {
        return byPriority;
    }

    public void setByPriority(String byPriority) {
        this.byPriority = byPriority;
    }

    @Override
    public String toString() {
        return "["+day+"]"+
                "["+idWork+"]"+
                "["+name+"]"+
                "["+byPriority+"]"+
                "["+status+"]";
    }

    public String getLine(){
        return idWork +","+ name +","+ day +","+ byPriority +","+ status;
    }

}

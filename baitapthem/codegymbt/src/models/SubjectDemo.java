package models;

import java.util.Comparator;

public class SubjectDemo  {
    private String idSubject;
    private String nameSubject;
    private String version;
    private String level;
    private int time;

    public SubjectDemo() {
    }

    public SubjectDemo(String idSubject, String nameSubject, String version, String level, int time) {
        this.idSubject = idSubject;
        this.nameSubject = nameSubject;
        this.version = version;
        this.level = level;
        this.time = time;
    }

    public String getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(String idSubject) {
        this.idSubject = idSubject;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "SubjectDemo{" +
                "idSubject='" + idSubject + '\'' +
                ", nameSubject='" + nameSubject + '\'' +
                ", version='" + version + '\'' +
                ", level='" + level + '\'' +
                ", time=" + time +
                '}';
    }

    public String getLine(){
        return idSubject + ","+ nameSubject + ","+ version + ","+ level + ","+ time;
    }

}

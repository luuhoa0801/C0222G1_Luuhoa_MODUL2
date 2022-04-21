package _16_io_text_file.exercise.read_file_csv;

public class Nation {
    private int id;
    private String nameNation;
    private String name;

    public Nation(int id, String nameNation, String name) {
        this.id = id;
        this.nameNation = nameNation;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameNation() {
        return nameNation;
    }

    public void setNameNation(String nameNation) {
        this.nameNation = nameNation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Nation{" +
                "id=" + id +
                ", nameNation='" + nameNation + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

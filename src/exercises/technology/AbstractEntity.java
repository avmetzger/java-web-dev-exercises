package exercises.technology;

public class AbstractEntity {
    private static int nextId;
    private int id;

    public AbstractEntity() {
        ++nextId;
        this.id = nextId;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id=" + id + ", ";
    }
}

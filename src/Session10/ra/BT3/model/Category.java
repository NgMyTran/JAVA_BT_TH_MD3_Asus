package Session10.ra.BT3.model;

public class Category {
    private static int nextID = 1;
    private int id;
    private String name;
    private boolean status;

    public Category() {
        this.id = nextID++;
    }

    public Category(String name, boolean status) {
        this.id = nextID++;
        this.name = name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}

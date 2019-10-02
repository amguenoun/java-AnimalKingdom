package animalkingdom;

public abstract class Animal {
    private static int maxId = 0;
    private int id;
    private String name;
    private int year;

    public Animal(String name, int year) {
        maxId++;
        id = maxId;
        this.name = name;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String eat() {
        return name + " eats.";
    }

    public abstract String move();

    public abstract String breathe();

    public abstract String reproduce();

}
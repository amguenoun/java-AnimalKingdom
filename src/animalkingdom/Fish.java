package animalkingdom;

public class Fish extends Animal {

    public Fish(String name, int year) {
        super(name, year);
    }

    @Override
    public String move() {
        return name + " moves by swimming";
    }

    @Override
    public String breathe() {
        return name + " breathes through gills";
    }

    @Override
    public String reproduce() {
        return name + " reproduces through eggs";
    }
}
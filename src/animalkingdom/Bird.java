package animalkingdom;

public class Bird extends Animal {

    public Bird(String name, int year) {
        super(name, year);
    }

    @Override
    public String move() {
        return "flys";
    }

    @Override
    public String breathe() {
        return name + " breathes through lungs";
    }

    @Override
    public String reproduce() {
        return name + " reproduces through eggs";
    }
}
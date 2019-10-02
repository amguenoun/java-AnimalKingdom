package animalkingdom;

public class Mammal extends Animal {

    public Mammal(String name, int year) {
        super(name, year);
    }

    @Override
    public String move() {
        return name + " moves by walking";
    }

    @Override
    public String breathe() {
        return name + " breathes through lungs";
    }

    @Override
    public String reproduce() {
        return name + " reproduces through live births";
    }
}
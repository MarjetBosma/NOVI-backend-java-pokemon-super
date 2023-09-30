public class WaterPokemon extends Pokemon {

    private String secondType; // sommige Pokemon hebben een tweede type

    // constructor
    public WaterPokemon(String name, int level, String sound) {
        super(name, level, sound);
    }

    public WaterPokemon(String name, int level, String sound, String secondType) { // Deze gebruiken als er een second type is.
        super(name, level, sound);
        this.secondType = secondType;
    }

    // vullen abstract methode uit super class
    @Override
    public void eats() {
        System.out.println(getName() + " eats water-berry");
    }

    public void weakness() {
        System.out.println(getName() + " has a weakness to Grass-type");
    }

    public void strongAgainst() {
        System.out.println(getName() + " is strong against Fire-type");
    }

    public String getSecondType() {
        return secondType;
    }

    public void setSecondType(String secondType) {
        this.secondType = secondType;
    }
}

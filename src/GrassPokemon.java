public class GrassPokemon extends Pokemon {

    // constructor
    public GrassPokemon(String name, int level, String sound) {
        super(name, level, sound);
    }

    // vullen abstract methode uit super class
    @Override
    public void eats() {
        System.out.println(getName() + " eats grass-berry");
    }

    public void weakness() {
        System.out.println(getName() + " has a weakness to Fire-type");
    }

    public void strongAgainst() {
        System.out.println(getName() + " is strong against Water-type");
    }
}

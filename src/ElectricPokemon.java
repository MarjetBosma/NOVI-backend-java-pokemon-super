public class ElectricPokemon extends Pokemon {

    // constructor
    public ElectricPokemon(String name, int level, String sound) {
        super(name, level, sound);
    }

    // vullen abstract methode uit super class
    @Override
    public void eats() {
        System.out.println(getName() + " eats electric-berry");
    }

    public void weakness() {
        System.out.println(getName() + " has a weakness to Ground-type");
    }

    public void strongAgainst() {
        System.out.println(getName() + " is strong against Water-type");
    }

    public void sleep() {
        System.out.println(getName() + " sleeps 2 hrs a day");
    }

}



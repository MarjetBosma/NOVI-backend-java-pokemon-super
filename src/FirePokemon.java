public class FirePokemon extends Pokemon {

    // variabelen
    private boolean hasExternalFlame;

    private boolean hasTrainer;

    // constructor
    public FirePokemon(String name, int level, String sound, boolean hasExternalFlame, boolean hasTrainer) {
        super(name, level, sound); // variabelen uit super class
        this.hasExternalFlame = hasExternalFlame;
        this.hasTrainer = hasTrainer;
    }

    // vullen abstract methode uit super class
    @Override
    public void eats() {
        System.out.println(getName() + " eats fireberry");
    }

    // methoden
    public void weakness() {
        System.out.println(getName() + " has a weakness to Water-type");
    }

    public void strongAgainst() {
        System.out.println(getName() + " is strong against Grass-type");
    }

    public String isHasExternalFlame() { // Dit begrijp ik niet, ik roep de methode aan in main
        if (hasExternalFlame) { // als hasExternalFlame true is
            return " has an external flame"; // returnt deze string
        } else {
            return " has no external flame";
        }
    }

    public void setHasExternalFlame(boolean hasExternalFlame) {
        this.hasExternalFlame = hasExternalFlame;
    }

    public String isHasTrainer() {
        if (hasTrainer) { // als hasTrainer true is
            return " has a trainer"; // returnt deze string
        } else {
            return " is a wild Pokemon";
        }
    }

    public void setHasTrainer(boolean hasTrainer) {
        this.hasTrainer = hasTrainer;
    }
}

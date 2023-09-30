public abstract class Pokemon { // super class

    // variabelen
    private String name;
    private int level;
    private String sound;

    // constructor
    public Pokemon(String name, int level, String sound) {
        this.name = name;
        this.level = level;
        this.sound = sound;
    }

    // methoden
    public abstract void eats(); // abstract method wordt later gevuld

    public void speak() {
        System.out.println(name +  " says " + sound);
    }

    public String getName() {
        return name;
    }

    // getters en setters
    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}

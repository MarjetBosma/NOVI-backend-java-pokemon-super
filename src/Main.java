import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {
        // FirePokemon aanspreken, nieuwe instantie aanmaken
        FirePokemon Charmander = new FirePokemon("Charmander", 11, "char-char", true, true);
        // Charmander aanspreken, methode eats uit FirePokemon toepassen
        Charmander.eats(); // returnt void, print in de methode al de line
        Charmander.speak();

        // toegang tot methode speak via getter
        System.out.println(Charmander.getSound());
//        Charmander.setSound("pika pika"); // nieywe sound toewijzen
//        System.out.println(Charmander.getSound()); // eerdere waarde is overschreven, print pika-pika

        System.out.println(Charmander.getName() + " " + Charmander.isHasTrainer() + " " + Charmander.isHasExternalFlame());

        // Nieuwe ElectricPokemon
        ElectricPokemon Pikachu = new ElectricPokemon("Pikachu",16, "pika-pika");
        Pikachu.sleep();

        // Nieuwe ElectricPokemon
        ElectricPokemon Pichu = new ElectricPokemon("Pichu", 7, "chu-chu");
        Pichu.strongAgainst();

        // Nieuwe WaterPokemon met second type Electric
//        WaterPokemon = new WaterPokemon("Chinchou", 22, "chin-chin", "Electric");
//        System.out.println(Chinchou.getName() + " " + Chinchou.getSecondType());

        WaterPokemon Chinchou = new WaterPokemon("Chinchou", 22, "chin-chin", "Electric");
        System.out.println(Chinchou.getName() + "'s second type is " + Chinchou.getSecondType());
    }




}

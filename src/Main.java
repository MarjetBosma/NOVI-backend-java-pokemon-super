// Bij deze mijn uitwerking. Het is niet mijn meest robuuste en samenhangende project, want ik heb de ballen verstand van Pokemon, en het leek ome ook niet bedoelimng om daar een hele studie van te maken. Een groot deel van de ideeën qua klassen, Pokemons en de bijbehorende acties cq. methoden komen uit de huiswerkklas, maar ik heb ook zelf nog een en ander togevoegd en verfijnd. Ik heb voldaan aan de randvoorwaarden zoals beschreven in de opdracht, en ik heb op deze manier goed geoefend met relaties. overerving en abstracte klassen.

public class Main {
    public static void main(String[] args) {
        // FirePokemon aanspreken, nieuwe instantie aanmaken
        FirePokemon Charmander = new FirePokemon("Charmander", 11, "char-char", true, true);

        // Charmander aanspreken, methode eats uit FirePokemon toepassen
        Charmander.eats(); // deze methode returnt void, er staat wel een print statement in de methode

        // toegang tot methode speak via getter
        System.out.println(Charmander.getSound()); // returnt sound
        Charmander.speak();// returnt void, maar met print statement

        System.out.println(Charmander.getName() + "" + Charmander.isHasTrainer() + " and" + Charmander.isHasExternalFlame());

        // Nieuwe ElectricPokemon
        ElectricPokemon Pikachu = new ElectricPokemon("Pikachu",16, "pika-pika");
        Pikachu.sleep();
        Pikachu.weakness();

        // Nieuwe ElectricPokemon
        ElectricPokemon Pichu = new ElectricPokemon("Pichu", 7, "chu-chu");
        Pichu.strongAgainst();
        Pichu.setLevel(14); // Level aangepast t.o.v. eerdere declaratie , print statement hieronder
        System.out.println("Pichu is now a level " + Pichu.getLevel() + " Pokemon");

        // Nieuwe WaterPokemon met second type Electric

        WaterPokemon Chinchou = new WaterPokemon("Chinchou", 22, "chin-chin", "Electric");
        System.out.println(Chinchou.getName() + "'s second type is " + Chinchou.getSecondType());
        Chinchou.rainDance();
    }




}

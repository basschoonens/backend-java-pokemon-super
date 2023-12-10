public class Main {
    public static void main(String[] args) {

        PokemonSuper pokemon = new PokemonSuper("Bowser", 1,1000,500);
        pokemon.attack();
        pokemon.eating();

        ElectricPokemon pokemon2 = new ElectricPokemon("Pikachu",1,2000,200,500,200);
        pokemon2.electricShock();
        pokemon2.electroBall();
        pokemon2.eating();
        pokemon2.attack();

        FirePokemon pokemon3 = new FirePokemon("Charmander",3, 1500,20,100,200);
        pokemon3.attack();
        pokemon3.inferno();
        pokemon3.solarBeam();

        GrassPokemon pokemon4 = new GrassPokemon("Bayleaf",5,5000,300,50,1500);
        System.out.println("Your does the following actions");
        pokemon4.eating();
        pokemon4.leafStorm();
        pokemon4.attack();
        pokemon4.rainDance();


    }
}

public class Main {
    public static void main(String[] args) {

        ElectricPokemon pokemon2 = new ElectricPokemon("Pikachu",1,2000,200,500,200);
        pokemon2.electricShock();
        pokemon2.electroBall();
        pokemon2.eating();
        pokemon2.attack();
        System.out.println("My name is: " + pokemon2.getName());
        System.out.println(" ");

        FirePokemon pokemon3 = new FirePokemon("Charmander",3, 1500,20,100,200);
        pokemon3.attack();
        pokemon3.inferno();
        pokemon3.solarBeam();
        pokemon3.eating();
        System.out.println(" ");

        GrassPokemon pokemon4 = new GrassPokemon("Bayleaf",5,5000,300,50,1500);
        System.out.println("Your pokemon does the following actions");
        pokemon4.eating();
        pokemon4.leafStorm();
        pokemon4.attack();
        pokemon4.rainDance();
        System.out.println(" ");

        WaterPokemon pokemon5 = new WaterPokemon("Poliwag",8,2500,500,100,250);
        pokemon5.hydroCanon();
        pokemon5.eating();
        pokemon5.hydroPump();
        pokemon5.setName("Zombie-Poliwag");
        System.out.println(pokemon5.getName());
        System.out.println("Oh no, you turn in to a zombie.");
        System.out.println(" ");

    }
}

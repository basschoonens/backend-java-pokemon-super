public class GrassPokemon extends PokemonSuper {

    private int grassPower;
    private int grassSuperPower;

    public GrassPokemon(String name, int level, int hp, int xp, int grassPower, int grassSuperPower) {
        super(name, level, hp, xp);
        this.grassPower = grassPower;
        this.grassSuperPower = grassSuperPower;
    }

    public void leafStorm(){
        System.out.println("Your Storm Leaf attack did 100 damage");
    }

    public void rainDance(){
        System.out.println("You do a rain dance, gaining 50 xp");
    }

    public int getGrassPower() {
        return grassPower;
    }

    public void setGrassPower(int grassPower) {
        this.grassPower = grassPower;
    }

    public int getGrassSuperPower() {
        return grassSuperPower;
    }

    public void setGrassSuperPower(int grassSuperPower) {
        this.grassSuperPower = grassSuperPower;
    }
}

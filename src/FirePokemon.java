public class FirePokemon extends PokemonSuper {

    private int fireStrength;

    private int fireSpecial;

    public FirePokemon(String name, int level, int hp, int xp, int fireStrength,int fireSpecial) {
        super(name, level, hp, xp);
        this.fireStrength = fireStrength;
        this.fireSpecial = fireSpecial;
    }

    public void inferno(){
        System.out.println("You are set on fire in a blazing Inferno");
    }

    public void solarBeam(){
        System.out.println("You were hit with a Solar Beam");
    }

    @Override
    public void eating() {
        super.eating();
        System.out.println("You gain 1 level experience from this food.");
    }

    public int getFireStrength() {
        return fireStrength;
    }

    public void setFireStrength(int fireStrength) {
        this.fireStrength = fireStrength;
    }

    public int getFireSpecial() {
        return fireSpecial;
    }

    public void setFireSpecial(int fireSpecial) {
        this.fireSpecial = fireSpecial;
    }
}

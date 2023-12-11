public class WaterPokemon extends PokemonSuper {

    private int water;
    private int superWater;

    public WaterPokemon(String name, int level, int hp, int xp, int water, int superWater) {
        super(name, level, hp, xp);
        this.water = water;
        this.superWater = superWater;
    }

    public void hydroCanon(){
        System.out.println("You wer shot with a Hydro Cannon, lose 100 health");
    }

    public void hydroPump(){
        System.out.println("Hydropump knocks you out");
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getSuperWater() {
        return superWater;
    }

    public void setSuperWater(int superWater) {
        this.superWater = superWater;
    }
}

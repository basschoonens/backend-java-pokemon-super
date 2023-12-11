abstract public class PokemonSuper {

    private String name;
    private int level;
    private int hp;
    private int xp;
    private String attack;


    public PokemonSuper(String name,int level, int hp, int xp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.xp = xp;;
    }

    public void attack(){
        System.out.println("Pokemon is attacking, but you missed");
    }

    public void eating(){
        System.out.println("Pokemon is eating, you gain health");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

}

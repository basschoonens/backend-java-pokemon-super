import javax.xml.namespace.QName;

public class ElectricPokemon extends PokemonSuper {

    private int electricity;
    private int specialElectricity;


    public ElectricPokemon(String name,int level, int hp, int xp, int electricity,int specialElectricity) {
        super(name, level, hp, xp);
        this.electricity = electricity;
        this.specialElectricity = specialElectricity;
    }

    public void electricShock(){
        System.out.println("You are attacked with an Electric Shock");
    }

    public void electroBall(){
        System.out.println("You've been hit with an Electro Ball!");
    }

    @Override
    public void attack() {
        System.out.println("Attack is canceled.");
    }

    public int getElectricity() {
        return electricity;
    }

    public void setElectricity(int electricity) {
        this.electricity = electricity;
    }

    public int getSpecialElectricity() {
        return specialElectricity;
    }

    public void setSpecialElectricity(int specialElectricity) {
        this.specialElectricity = specialElectricity;
    }

}

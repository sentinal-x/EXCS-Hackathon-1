public class Brokemon
{
    private Types type;
    private String name;
    private Move moves[];
    private int health;
    private int speed;
    private int attack;
    private int defence;

    /**
     * Constructor for objects of class Brokemon
     */
    public Brokemon(Types type, String name, int health, int speed, int attack, int defence)
    {
        this.type = type;
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.attack = attack;
        this.defence = defence;
    }

}

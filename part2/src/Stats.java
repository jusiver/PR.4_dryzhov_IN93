public class Stats {
    int strength;
    int dexterity;
    int construction;
    int intelligence;
    int wisdom;
    int charisma;

    public Stats generate() {
        Stats s = new Stats();
        Dice d = new Dice();

        s.strength = d.roll_dice();
        s.dexterity = d.roll_dice();
        s.construction = d.roll_dice();
        s.intelligence = d.roll_dice();
        s.wisdom = d.roll_dice();
        s.charisma = d.roll_dice();

        return s;
    }

}

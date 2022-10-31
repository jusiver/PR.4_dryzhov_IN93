import java.util.Optional;

public class MementoPatternDemo {
    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        Stats s = new Stats();
        Dice d = new Dice();
        Character c = new Character();

        c.attributes = s.generate();
        c.name = "Alexus";
        c.dnd_class = "debian";
        originator.setState(c);
        careTaker.add(originator.saveStateToMemento());

        originator.getStateFromMemento(careTaker.get(0));
        Character res = originator.getState();
        res.print_sheet();

//        ------------------

        c.attributes = s.generate();
        c.name = "Rostix";
        c.dnd_class = "NotDebian";
        originator.setState(c);
        careTaker.add(originator.saveStateToMemento());

        originator.getStateFromMemento(careTaker.get(1));
        Character res1 = originator.getState();
        res1.print_sheet();



    }
}
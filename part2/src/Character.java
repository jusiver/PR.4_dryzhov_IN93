public class Character {
    String name;
    String dnd_class;
    Stats attributes;

    void print_sheet() {
        System.out.println(name);
        System.out.println(dnd_class);
        System.out.println(attributes.charisma);
    }
}

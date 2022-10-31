public class Memento {
    private Character state;

    public Memento(Character state){
        this.state = state;
    }

    public Character getState(){
        return state;
    }
}
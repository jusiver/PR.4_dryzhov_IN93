public class Originator {
    private Character state;

    public void setState(Character state){
        this.state = state;
    }

    public Character getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
public class Lifes {
    private int lifes;

    public Lifes(int lifes) {
        this.lifes = lifes;
    }

    public void addLifes(int lives) {
        this.lifes += lives;
    }

    public int getLifes(){
        return lifes;
    }

    public void loseLife() {
        lifes--;
    }
}

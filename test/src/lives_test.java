public class lives_test {

    private int lives = 3;

    public void loseLife() {

        lives--;

        if(lives <= 0) {
            gameover();
        }

    }

    private void gameover() {

        System.out.print("No lives left :(");

    }

}

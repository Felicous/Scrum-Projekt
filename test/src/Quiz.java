import java.util.Random;

public class Quiz {

    private int removeNo;
    private Random r = new Random();
    private String aufgabeMitLücke;

    public String getAufgabe(int difficulty) {// difficulty not yet implemented

        Term Aufgabe = new Term(difficulty);

        removeNo = r.nextInt(3) +1;

        switch (removeNo){

            case 1: aufgabeMitLücke += "_ " + Aufgabe.get_op() + Integer.toString(Aufgabe.get_number_2()) + Integer.toString(Aufgabe.get_result());
                break;
            case 2: aufgabeMitLücke += Integer.toString(Aufgabe.get_number_1()) + " _ " + Integer.toString(Aufgabe.get_number_2()) + Integer.toString(Aufgabe.get_result());
                break;
            case 3: aufgabeMitLücke += Integer.toString(Aufgabe.get_number_1()) + Aufgabe.get_op() + " _ " + Integer.toString(Aufgabe.get_result());
                break;
            case 4: aufgabeMitLücke += Integer.toString(Aufgabe.get_number_1()) + Aufgabe.get_op() + Integer.toString(Aufgabe.get_number_2()) + " _";
                break;


        }



        return aufgabeMitLücke;

    }
}

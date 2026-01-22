import java.util.Random;


public class Term {
    Random r= new Random();
    private int number_1;
    private int number_2;
    private int number_3;
    private char op;
    private int result;


    public Term(int difficulty){
        number_1 = r.nextInt(79) + 10;    // 10 - 89
        number_2 = r.nextInt(89 - number_1) + 10;    // 10 - 89

        result = number_1 + number_2;

        // int operator = r.nextInt(3)    // operator will be implemented in later sprint

    }
    public int get_result(){
        return result;
    }
    public int get_number_1(){
        return number_1;
    }
    public int get_number_2(){
        return number_2;
    }
    public char get_op(){
        return op;
    }
}

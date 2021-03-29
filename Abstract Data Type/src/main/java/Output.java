package main.java;

public class Output {

    protected void print(AlphabeticShift alpha) {
        for (int i = 0; i < alpha.getSize(); i++) {
            System.out.println(alpha.i_th(i));
        }
    }

}

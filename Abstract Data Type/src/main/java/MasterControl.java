package main.java;

import java.util.ArrayList;

public class MasterControl {


    private Characters characters;


    public MasterControl(String filePath){
        Input input = new Input(filePath);
        try {
            characters = input.load();
        } catch (Exception error) {
            error.printStackTrace();
        }

    }

    public void run() {
        CircularShift shift = new CircularShift();
        shift.setup(characters);
        AlphabeticShift alpha = new AlphabeticShift();
        alpha.alph(shift);
        Output output = new Output();
        output.print(alpha);
    }

    public static void main(String[] args) {


        new MasterControl(args[0]).run();




    }



}

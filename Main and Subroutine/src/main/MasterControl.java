package main;

import java.util.*;

public class MasterControl {
    public static void main(String[] args) {
        List<String> characters = new ArrayList<>();
        List<Integer> index = new ArrayList<>();
        List<Integer> alphabetized_index = new ArrayList<>();

        try {
            // read input
            Input input = new Input();
            if (input.read(args[0], characters)) {
                CircularShift circular_shift = new CircularShift();
                if (circular_shift.shift(characters, index)) {
                    Alphabetizer alphabetizer = new Alphabetizer();
                    if (alphabetizer.sort(characters, index, alphabetized_index)) {
                        Output output = new Output();
                        output.print(characters, alphabetized_index);
                    }
                }
            }
            System.out.println("Successfully Completed");
        } catch (Exception error) {
            // throw error
            System.out.println("Unsuccessful");
            error.printStackTrace();
        }
        // run();
    }
}

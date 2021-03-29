package main;

import java.util.List;

public class Output {
    protected void print(List<String> characters, List<Integer> alphabetized_index) {
        for (int i = 0; i < alphabetized_index.size(); i++) {
            System.out.println(characters.get(alphabetized_index.get(i)));
        }
//        for (String c: characters) {
//            System.out.println(c);
//        }
//        for (int i: alphabetized_index) {
//            System.out.println(characters.get(alphabetized_index.get(i)));
//        }
    }
}

package main;

import java.util.*;

public class Alphabetizer {
    protected boolean sort(List<String> characters, List<Integer> index, List<Integer> alphabetized_index) {
        String temp;
        for (int j = 0; j < index.size(); j++) {
            alphabetized_index.add(j);
        }
        for (int i = 0; i < characters.size(); i++) {
            for (int j = i+1; j < characters.size(); j++) {
                if (characters.get(i).toLowerCase().compareTo(characters.get(j).toLowerCase()) > 0) {
//                    System.out.println(characters.get(j).toLowerCase());
                    temp = characters.get(i);
                    characters.set(i, characters.get(j));
                    characters.set(j, temp);
//                    System.out.println(characters.get(0).toLowerCase().compareTo(characters.get(1).toLowerCase()));
//                    temp = alphabetized_index.get(i);
//                    alphabetized_index.set(i, alphabetized_index.get(j));
//                    alphabetized_index.set(j, temp);
//                    alphabetized_index[i] = j;
//                    alphabetized_index[j] = i;
                }
            }
        }
        return true;
    }
}

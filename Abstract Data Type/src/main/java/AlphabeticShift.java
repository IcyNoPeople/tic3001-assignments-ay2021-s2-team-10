package main.java;

import java.util.ArrayList;

public class AlphabeticShift {

    private static ArrayList<String> line = new ArrayList<>();

    public void alph(CircularShift circularShift){

        for (int i = 0; i < circularShift.getSize(); i++) {
            String temp = circularShift.getWord(i);
            line.add(temp);
            for (int j = line.size() - 2; j >= 0; j--) {
                int k = 0;
                int smallSize = minSize(temp.length(), line.get(j).length()) - 1;
                while(k < smallSize && temp.toLowerCase().charAt(k) == line.get(j).toLowerCase().charAt(k)) {
                    k++;
                }
                if(temp.toLowerCase().charAt(k) <= line.get(j).toLowerCase().charAt(k)){
                    if(k == line.get(j).length()-1 && temp.toLowerCase().charAt(k) == line.get(j).toLowerCase().charAt(k)){
                        break;
                    }
                    line.set(j+1, line.get(j));
                    line.set(j, temp);
                }
                else{
                    break;
                }
            }
        }


    }

    public String i_th(int i){
        return line.get(i);
    }

    public int getSize(){
        return line.size();
    }

    private int minSize(int sizeA, int sizeB){
        if(sizeA > sizeB){
            return sizeB;
        }
        else{
            return sizeA;
        }
    }

}

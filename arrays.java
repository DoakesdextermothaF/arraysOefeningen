package arrays;

import java.util.ArrayList;

public class arrays {

    public static void main(String[] args) {

    	//opdracht 1
        ArrayList<Integer> evenGetallen = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                evenGetallen.add(i);
                
                
            }
        }

        
        //opdracht 2
        ArrayList<Long> evenGetallenreeks = new ArrayList<Long>();
        evenGetallenreeks.add(0L);
        evenGetallenreeks.add(1L);
        
       for (int i = 2; i < 50; i++) 
       {
    	   
    	   long lastValue = evenGetallenreeks.get(evenGetallenreeks.size() -1);
    	   long secondeToLastValue = evenGetallenreeks.get(evenGetallenreeks.size() -2);
    	   long som = lastValue + secondeToLastValue;
    	   evenGetallenreeks.add(som);
    	   }
       
       }
        
    }
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
       
       //opdracht 3
       //Schrijf een programma die test of de eerste en de laatste waarde in een array hetzelfde zijn.
       //Experimenteer met arrays van verschillende lengte en inhoud.
       //Denk na over hoe je dit zou moeten testen en maak een testset om de juistheid van je code aan te tonen.
       
       Array<Long> verschillen= new Array<Long>();
       
       for (int i = 2; i < 50; i++) {
    	
    	   verschillen.add(1);
    	   verschillen.add(2);
    	   
    	   
    	   
       }
       
       //opdracht 4
       
       
       }
        
    }
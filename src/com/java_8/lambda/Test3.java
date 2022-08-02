package com.java_8.lambda;
import java.util.ArrayList;
import java.util.List;
//this is from javatpoint
public class Test3 {
	public static void main(String[] args) {  
        List<String> gamesList = new ArrayList<String>();  
        gamesList.add("Football");  
        gamesList.add("Cricket");  
        gamesList.add("Chess");  
        gamesList.add("Hocky");  
        System.out.println("------------Iterating by passing method reference---------------");  
        gamesList.forEach(System.out::println);
        //above and below line is same
        gamesList.forEach(games-> System.out.println(games));
    }
}
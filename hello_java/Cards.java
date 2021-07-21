import java.lang.reflect.Array;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

import sun.tools.serialver.resources.serialver;

public class Cards {
    List<String> keepList_deck = new ArrayList<String>();
    private  String [] rank = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    private  String [] suit = {"S","H","D","C"};
    /**
     * @return the rank
     */
    public String[] getRank() {
        return rank;
    }
    /**
     * @return the suit
     */
    public String[] getSuit() {
        return suit;
    }
    public void deck() {
         String [] keep_deck = new String[52];
        int i =0;
        for( String s:suit){
            for( String r:rank){
               //System.out.print(s+r + "," );
               keep_deck[i] = s+r;
               i++;
            }
        }
    }
    public static String[] keep_deck() {
         String [] rank = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
         String [] suit = {"S","H","D","C"};
         String [] deck = new String[52];
        int i =0;
        for( String s:suit){
            for( String r:rank){
               //System.out.print(s+r + "," );
               deck[i] = s+r;
               i++;
            }
        }
        return deck;
    }
    public static String [] shuffle() {
         Random aRandom = new Random();
         String [] deck = keep_deck();
       for (int i = 0; i < deck.length; i++) {
         int indexrandom = aRandom.nextInt(deck.length);
         String temp = deck[indexrandom];
        deck[i] = temp;
       }
    //    for(String s:deck){
    //        System.out.print(s+",");
    //}
    return deck;
    }
    public int meanCards(String s) {
        int a;
            switch (s) {
                case "A": a = 1;
                    break;
                case "J": a = 10;
                    break;
                case "Q": a = 10;
                    break;
                case "K": a = 10;
                    break;
                default: a = Integer.parseInt(s);
                    break;
            }
            return a;
        
}
public int suit_number(String s) {
    int a;
        switch (s) {
            case "S": a = 10;
                break;
            case "H": a = 20;
                break;
            case "D": a = 30;
                break;
            case "C": a = 40;
                break;
            default: a = 0;
                break;
        }
        return a;
    
}
public int convertCardstoScore(String s){
    int cardsInt,suitInt;
    String keepS,keepSuit;
    keepS = s.substring(1);
    keepSuit = s.substring(0,1);
    try {
        cardsInt = Integer.parseInt(keepS);
   } catch (java.lang.NumberFormatException e) {
        cardsInt = meanCards(keepS);
       //TODO: handle exception
   }
   suitInt = suit_number(keepSuit);
   return cardsInt;
   }
public int convertCardstoScoreList(List sList){
    int [] keepInt = new int[sList.size()];
    String [] keepList = new String[sList.size()];
    int temp = 0;
    for (int i = 0; i < keepList.length; i++) {
        keepList[i] = sList.get(i).toString();    
    }
    for (int i = 0; i < keepList.length; i++) {
        try{
            keepInt[i] = Integer.parseInt(keepList[i].substring(1));
        } catch (java.lang.NumberFormatException e){
            keepInt[i] = meanCards(keepList[i].substring(1));
        }
    }
    for (int j = 0; j < keepInt.length ; j++) {
        temp = keepInt[j] + temp; 
    }
    return temp;
}
public String draw(){
    String s;
    s = keepList_deck.get(0); 
    keepList_deck.remove(0);
    return s;
}
public void getcards(){
    for(int i=0; i<deck.length; i++){
        keepList_deck.add(shuffle()[i]);
   
 }
}
}

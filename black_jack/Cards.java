import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Cards
 */
public class Cards {
    List<String> keepList_deck = new ArrayList<String>();
    public static String[] keep_deck() {
        String [] rank = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String [] suit = {"S","H","D","C"};
        String [] deck = new String[52];
       int i =0;
       for( String s:suit){
           for( String r:rank){
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
       return deck;
   }
   public void getcards(){
    for(int i=0; i<shuffle().length; i++){
        keepList_deck.add(shuffle()[i]);
    }
   }
   public String draw(){
       String s;
       s = keepList_deck.get(0);
       keepList_deck.remove(0);
       return s;
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
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * GameCards
 */
public class GameCards {
    Cards aCards = new Cards();
    Scanner sc = new Scanner(System.in);
    public void getcards(){
        for(int i=0; i<deck.length; i++){
            keepList_deck.add(deck[i]);
        }
        // System.out.println(keepList_deck);
        
    }
    public void cardsCom() {
        List<String> keepCom_cards = new ArrayList<String>();
        keepCom_cards.add(draw());
        keepCom_cards.add(draw());
       
    }
    public void cardsUser() {
        List<String> keepUser_cards = new ArrayList<String>();
        keepUser_cards.add(draw());
        keepUser_cards.add(draw());
        
    }
    public void WhoIsWin(List comList,List userList) {
        int i = aCards.convertCardstoScoreList(comList);
        int j = aCards.convertCardstoScoreList(userList);
        
    }
    public String draw(){
        String s;
        s = keepList_deck.get(0); 
        keepList_deck.remove(0);
        return s;
    }
     
}
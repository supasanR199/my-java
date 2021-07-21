import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Main
 */
public class mainClass {

    public static void main(String[] args) {
        boolean check = true;
        boolean check1 = true;
        do {
             Cards aCards = new Cards();
        Scanner sc = new Scanner(System.in);
        List<String> keepUser_cards = new ArrayList<String>();
        List<String> keepCom_cards = new ArrayList<String>();
        aCards.getcards();
        System.out.println("------------------------------------------------------------");
        System.out.println("Wellcom to black-jack");
        keepCom_cards.add(aCards.draw());
        keepCom_cards.add(aCards.draw());
        System.out.println("Com cardds is " + "[" + keepCom_cards.get(0) + "," + "**" + "]");
        keepUser_cards.add(aCards.draw());
        keepUser_cards.add(aCards.draw());
        System.out.println("Your cards is =" + keepUser_cards);
        do {
            System.out.println("---------------------------Com turn-------------------------");
            if (aCards.convertCardstoScoreList(keepCom_cards) > 21) {
                System.out.println("I'm losserT T");
                check = false;
            }
            else if (aCards.convertCardstoScoreList(keepCom_cards) == 20){
                System.out.println("Com cardds is " + "[" + keepCom_cards.get(0) + "," + "**" + "]");
            }
            else if (aCards.convertCardstoScoreList(keepCom_cards) > 17 && aCards.convertCardstoScoreList(keepCom_cards) < 21 ){
                System.out.println("Com cardds is " + "[" + keepCom_cards.get(0) + "," + "**" + "]");
            }
            else if (aCards.convertCardstoScoreList(keepCom_cards) < 17  ){
                System.out.println("Com cardds is " + "[" + keepCom_cards.get(0) + "," + "**" + "]");
                System.out.println("Com have some cards");
                keepCom_cards.add(aCards.draw());
                System.out.println("Com cardds is " + "[" + keepCom_cards.get(0) + ","  +keepCom_cards.get(1) + "," + "**" + "]");
            }
            else if (aCards.convertCardstoScoreList(keepCom_cards) == 21){
                System.out.println("Com cardds is " + keepCom_cards);
                System.out.println("Your are losser ");
            }
            
        System.out.println("--------------------------Your turn-------------------------");
        System.out.println("Your cards is " + keepUser_cards);
        System.out.println("1.Hit   2.Stand   3.Exit");
        int input = sc.nextInt();
        System.out.println("------------------------------------------------------------");
        switch (input) {
            case 1:
                keepUser_cards.add(aCards.draw());
                System.out.println("Your cards is " + keepUser_cards);
                if (aCards.convertCardstoScoreList(keepUser_cards)>21){
                    System.out.println("Your are losser!!! ");
                    System.out.println("Your point is " + aCards.convertCardstoScoreList(keepUser_cards));
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Com cards is " + keepCom_cards);
                    System.out.println("Com point is " + aCards.convertCardstoScoreList(keepCom_cards));
                    check = false;
                }
                else if(aCards.convertCardstoScoreList(keepUser_cards)<21){
                    check = true;
                }        
                break;
            case 2:
                System.out.println("Your cards is " + keepUser_cards);
                System.out.println("Your point is " + aCards.convertCardstoScoreList(keepUser_cards));
                System.out.println("------------------------------------------------------------");
                System.out.println("Com cards is " + keepCom_cards);
                System.out.println("Com point is " + aCards.convertCardstoScoreList(keepCom_cards));
                if (aCards.convertCardstoScoreList(keepUser_cards)>21){
                    System.out.println("Your are losser!!! ");
                    check = false;
                }
                else if(aCards.convertCardstoScoreList(keepCom_cards)>21){
                    System.out.println("I'm losserT T");
                    check = false;
                }
                else if(aCards.convertCardstoScoreList(keepUser_cards)>21){
                    System.out.println("Your are losser!!! ");
                    check = false;
                }
                else if(aCards.convertCardstoScoreList(keepCom_cards)-21 < aCards.convertCardstoScoreList(keepUser_cards) - 21){
                    System.out.println("I'm losserT T");
                    check = false;
                }
                else if(aCards.convertCardstoScoreList(keepCom_cards)-21 > aCards.convertCardstoScoreList(keepUser_cards) - 21){
                    System.out.println("Your are losser!!! ");
                    check = false;
                }
                else if(aCards.convertCardstoScoreList(keepCom_cards) == aCards.convertCardstoScoreList(keepUser_cards)){
                    System.out.println("Equivalent");
                    check = false;
                }
                else{
                    check = true;
                }             
                break;
            case 3:
                check = false;
                check1 = false;
                break;
        }
        } while (check);
            
        } while (check1);
    }
}
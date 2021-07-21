/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cherse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cpe
 */
public class Bord {
    private String[] colum = {"A","B","C","D","E","F","G","H"};
    private String[] row = {"1","2","3","4","5","6","7","8"};
    ArrayList<String> succeedBord = new ArrayList<String>();
    ArrayList<Integer> vectorList = new ArrayList<>();
    public void gennarate(){
        for(String r:row){
            for(String c:colum){
                succeedBord.add(c+r);
            }
        }
    }
    public void displayBord(){
        //System.out.println(succeedBord);
        //gennarate();
        for(int i = 0;i < succeedBord.size(); i++){
            if(i%8 == 0){
                System.out.println();
            }
            System.out.printf("%s   ",succeedBord.get(i));
        }
        System.out.println();
        }
    public void freeMove(String figures,String position){
        succeedBord.set(succeedBord.indexOf(position),figures);
    }
    public void bordTovector() {
        for (int i = 0; i < 64; i++) {
            vectorList.add(i);
        }
    }
    public void displayVectorBord() {
        for(int i = 0;i < vectorList.size(); i++){
            if(i%8 == 0){
                System.out.println();
            }
            System.out.print(vectorList.get(i)+"   ");
        }
        System.out.println();
        
    }
}

   

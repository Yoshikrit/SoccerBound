/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerbound;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class SoccerBound {

    /**
     * @param args the command line arguments
     */
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        LiveScoreBean sco = new LiveScoreBean();//source
        Subscriber sub = new Subscriber();//observer
        SoccerBound s = new SoccerBound();//class obj for this class method
        System.out.print("Enter Your Subscribers : ");
        int n = s.countSubscriber();
        for (int i = 0 ; i < n ; i++){ 
            sco.addPropertyChangeListener(sub);
        }
        while(true){
            System.out.print("Enter Score : ");
            String r = s.changeResult();
            if(!r.equals("")){
                sco.setScoreLine(r);
            }
            else{
                System.out.println("End");
                break;
            }
        }
    }
    public int countSubscriber(){ 
        //Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        return count;
    }
    public String changeResult(){ 
        //Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        return result;
    }
    
}

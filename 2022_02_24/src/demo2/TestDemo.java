package demo2;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-02-24
 * Time: 15:52
 */

class Card {
    private int rank;
    private String suit;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit='" + suit + '\'' +
                '}';
    }
}

class PlayCard {
    public static String[] suits = {"♥","♠","♦","♣"};
    //一副牌
    List<Card> list = new LinkedList<>();
    public List<Card> buyCard() {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <=13 ; j++) {
                Card card = new Card(j,suits[i]);
                list.add(card);
            }
        }
        return list;
    }
    public void swap(List<Card> list,int x,int y) {
        Card cardHelp = list.get(x);
        list.set(x,list.get(y));
        list.set(y,cardHelp);
    }
    //打乱牌
    public void func(List<Card> list) {

        Random random = new Random();
        for(int i = list.size()-1; i > 0; i--) {

            int ret = random.nextInt(i);
            //交换
            swap(list,i,ret);

        }
    }

}

public class TestDemo {
    public static void main(String[] args) {
        //System.out.println("买牌");
        PlayCard playCard = new PlayCard();
        List<Card> list = playCard.buyCard();
        //System.out.println(list);
        System.out.println("===============");
       // System.out.println("乱排");
        playCard.func(list);
        System.out.println("===============");

        //System.out.println(list);
        //发牌
        List<Card> hand1 = new LinkedList<>();
        List<Card> hand2 = new LinkedList<>();
        List<Card> hand3 = new LinkedList<>();
        List< List<Card> > hands = new LinkedList<>();
        hands.add(hand1);
        hands.add(hand2);
        hands.add(hand3);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                Card card = list.remove(0);
                hands.get(j).add(card);
            }
        }

        System.out.println(hand1);
        System.out.println("===============");
        System.out.println(hand2);
        System.out.println("===============");
        System.out.println(hand3);
        System.out.println("===============");

    }
}

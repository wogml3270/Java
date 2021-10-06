package blackjack;

import java.util.*;

public class Gamer {
    // 배열 X 카드가 몇장 들어오는지는 모름

    public List<Card> myCards = new LinkedList();

    public Gamer(){
        init();
    }
    private void init(){
        myCards = new LinkedList();
    }
    public void receiveCard(Card c){ // 카드 받기
        myCards.add(c);
    }
    public List<Card> openCards(){ // 카드 오픈
        return myCards;
    }
    public void showAllMyCards(){
        for(Card c : myCards){
            System.out.println(c);
        }
    }
}

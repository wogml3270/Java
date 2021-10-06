package blackjack;

public class CardTest3 {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();

        Card c1 = new Card("test", "A");
        Card c2 = new Card("test", "10");

        dealer.receiveCard(c1);
        dealer.receiveCard(c2);

        dealer.moreCard(cd); // 16점 이하면 카드 1장 더 받기
        dealer.showAllMyCards();
    }
}

package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    Deck(){
        for(Suit suit : Suit.values()){
            for(Rank rank : Rank.values()){
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle(){
        //TODO implement
        Collections.shuffle(cards);
    }

    public Card dealCards(){
        return cards.removeFirst();
    }

    public void reset(){
        cards.clear();
        for(Suit suit : Suit.values()){
            for(Rank rank : Rank.values()){
                cards.add(new Card(suit, rank));
            }
        }
    }
}

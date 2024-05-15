package org.example;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> cardList;

    Player(String name){
        this.name = name;
        cardList = new ArrayList<>();
    }

    public void addCardToHand(Card card){
        cardList.add(card);
    }

    public List<Card> getCardFromHand(){
        return cardList;
    }
}

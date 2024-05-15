package org.example;

import java.util.ArrayList;
import java.util.List;

public class TwentyNine {
    Deck deck;
    List<Player> playerList;
    int currentPlayerIndex;

    TwentyNine(){
        deck = new Deck();
        playerList = new ArrayList<>();
        currentPlayerIndex = 0;
    }

    public void addPlayer(Player player){
        playerList.add(player);
    }

    public void startGame(){
        deck.shuffle();
        for(int i=0;i<4;i++){
            for(Player player : playerList){
                player.addCardToHand(deck.dealCards());
            }
        }
    }
}

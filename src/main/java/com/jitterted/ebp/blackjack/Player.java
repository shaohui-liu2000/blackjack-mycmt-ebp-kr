package com.jitterted.ebp.blackjack;

public class Player {
    private int playerBalance = 0;
    private int playerBet = 0;
    private int cumulativeBets = 0;


    public Player(){
    }

    public Player(int balance){
        this.playerBalance = balance;
    }

    public void playerDeposits(int amount) {
        playerBalance += amount;
    }

    public void playerBets(int betAmount) {
        playerBet = betAmount;
        cumulativeBets += betAmount;
        playerBalance -= betAmount;
        if(betAmount >=100)
            playerBalance += 10;
    }

    public int playerBalance() {
        return playerBalance;
    }

    public int playerBetAmount(){
        return playerBet;
    }

    public void playerWins() {
        playerBalance += playerBet * 2;
    }

    public void playerLoses() {
        playerBalance += playerBet * 0;
    }

    public void playerTies() {
        playerBalance += playerBet * 1;
    }

    public int totalAmountBet() {
        return cumulativeBets;
    }
}

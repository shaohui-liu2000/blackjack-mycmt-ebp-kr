package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class PlayerTest {

    @Test
    void playerDepositsWithZeroBalance() {
        Player player = new Player(0);
        player.playerDeposits(10);
        assertThat(player.playerBalance()).isEqualTo(10);
    }

    @Test
    void playerDepositsWithNonZeroBalance() {
        Player player = new Player(5);
        player.playerDeposits(10);
        assertThat(player.playerBalance()).isEqualTo(15);
    }

    @Test
    void playerBetsWithAmount() {
        Player player = new Player(100);
        player.playerBets(100);

        assertThat(player.playerBalance()).isEqualTo(0);
        assertThat(player.playerBetAmount()).isEqualTo(100);
    }


    @Test
    void playerBalance() {
        Player player = new Player();
        assertThat(player.playerBalance()).isEqualTo(0);
        player = new Player(100);
        assertThat(player.playerBalance()).isEqualTo(100);
    }

    @Test
    void playerWins() {
        Player player = new Player(10);
        player.playerBets(5);
        player.playerWins();
        assertThat(player.playerBalance()).isEqualTo(15);
    }


    @Test
    void playerLoses() {
        Player player = new Player(10);
        player.playerBets(5);
        player.playerLoses();
        assertThat(player.playerBalance()).isEqualTo(5);
    }

    @Test
    void playerTies() {
        Player player = new Player(10);
        player.playerBets(5);
        player.playerTies();
        assertThat(player.playerBalance()).isEqualTo(10);
    }
}
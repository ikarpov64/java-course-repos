package com.volgir.homework.module1.third.ex4;

public class LotteryTicket {

    private static int ticketCount = 0;
    private static int winningAmount = 0;

    public LotteryTicket() {
        ticketCount++;
    }

    public void checkLuck() {
        if (ticketCount % 100 == 0) {
            winningAmount += 5_000;
        } else if (ticketCount % 10 == 0) {
            winningAmount += 100;
        }
    }

    public static int getWinningAmount() {
        return winningAmount;
    }
}

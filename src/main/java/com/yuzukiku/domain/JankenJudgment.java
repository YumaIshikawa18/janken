package com.yuzukiku.domain;

public class JankenJudgment {
    public JankenGame play(Hand userHand, Hand cpuHand) {
        if (userHand == cpuHand) {
            return new JankenGame(userHand, cpuHand, JankenResult.DRAW);
        }

        if (userHand.beats(cpuHand)) {
            return new JankenGame(userHand, cpuHand, JankenResult.WIN);
        } else {
            return new JankenGame(userHand, cpuHand, JankenResult.LOSE);
        }
    }
}

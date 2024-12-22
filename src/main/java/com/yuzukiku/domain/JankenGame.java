package com.yuzukiku.domain;

public class JankenGame {
    private final Hand userHand;
    private final Hand cpuHand;
    private final JankenResult result;

    public JankenGame(Hand userHand, Hand cpuHand, JankenResult result) {
        this.userHand = userHand;
        this.cpuHand = cpuHand;
        this.result = result;
    }

    public Hand getUserHand() {
        return userHand;
    }

    public Hand getCpuHand() {
        return cpuHand;
    }

    public JankenResult getResult() {
        return result;
    }

}

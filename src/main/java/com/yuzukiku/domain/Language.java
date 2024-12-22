package com.yuzukiku.domain;

public enum Language {
    JAPANESE,
    ENGLISH;

    public static Language fromChoice(String choice) {
        return switch (choice) {
            case "1" -> JAPANESE;
            case "2" -> ENGLISH;
            default -> null;
        };
    }

    public String getStartMessage() {
        return switch (this) {
            case JAPANESE -> "じゃんけんを始めます。";
            case ENGLISH -> "Starting Rock-Paper-Scissors.";
        };
    }

    public String getSelectHandMessage() {
        return switch (this) {
            case JAPANESE -> "手を選択してください (0: グー, 1: チョキ, 2: パー):";
            case ENGLISH -> "Please choose your hand (0: Rock, 1: Scissors, 2: Paper):";
        };
    }

    public String getInvalidInputMessage() {
        return switch (this) {
            case JAPANESE -> "不正な入力です。終了します。";
            case ENGLISH -> "Invalid input. Terminating.";
        };
    }

    public String getYourHandMessage() {
        return switch (this) {
            case JAPANESE -> "あなたの手: ";
            case ENGLISH -> "Your hand: ";
        };
    }

    public String getCpuHandMessage() {
        return switch (this) {
            case JAPANESE -> "コンピュータの手: ";
            case ENGLISH -> "CPU hand: ";
        };
    }

    public String getResultMessage(JankenResult result, Language lang) {
        return switch (result) {
            case WIN -> lang == JAPANESE ? "あなたの勝ち" : "You Win";
            case LOSE -> lang == JAPANESE ? "あなたの負け" : "You Lose";
            case DRAW -> lang == JAPANESE ? "あいこ" : "Draw";
        };
    }
}

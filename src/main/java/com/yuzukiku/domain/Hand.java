package com.yuzukiku.domain;

import java.security.SecureRandom;

public enum Hand {
    ROCK {
        @Override
        public boolean beats(Hand otherHand) {
            return otherHand == SCISSORS;
        }

        @Override
        public String getHandName(Language language) {
            return language == Language.JAPANESE ? "グー" : "Rock";
        }
    },
    SCISSORS {
        @Override
        public boolean beats(Hand other) {
            return other == PAPER;
        }

        @Override
        public String getHandName(Language language) {
            return language == Language.JAPANESE ? "チョキ" : "Scissors";
        }
    },
    PAPER {
        @Override
        public boolean beats(Hand other) {
            return other == ROCK;
        }

        @Override
        public String getHandName(Language language) {
            return language == Language.JAPANESE ? "パー" : "Paper";
        }
    };

    public abstract boolean beats(Hand otherHand);

    public abstract String getHandName(Language language);

    public static Hand fromChoice(String choice) {
        try {
            int value = Integer.parseInt(choice);
            return switch (value) {
                case 0 -> ROCK;
                case 1 -> SCISSORS;
                case 2 -> PAPER;
                default -> null;
            };
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static Hand randomHand() {
        return values()[new SecureRandom().nextInt(values().length)];
    }
}

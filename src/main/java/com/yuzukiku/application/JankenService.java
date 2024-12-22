package com.yuzukiku.application;

import com.yuzukiku.domain.Hand;
import com.yuzukiku.domain.JankenGame;
import com.yuzukiku.domain.JankenJudgment;
import com.yuzukiku.domain.Language;

import java.util.Scanner;

public class JankenService {

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("言語を選択してください (1: 日本語, 2: English): ");
        String languageChoice = scanner.nextLine();
        Language language = Language.fromChoice(languageChoice);

        if (language == null) {
            System.out.println("不正な入力です。終了します。");
            scanner.close();
            return;
        }

        System.out.println(language.getStartMessage());

        System.out.println(language.getSelectHandMessage());
        String userInput = scanner.nextLine();
        Hand userHand = Hand.fromChoice(userInput);

        if (userHand == null) {
            System.out.println(language.getInvalidInputMessage());
            scanner.close();
            return;
        }

        Hand cpuHand = Hand.randomHand();

        JankenJudgment judgement = new JankenJudgment();
        JankenGame game = judgement.play(userHand, cpuHand);

        System.out.println(language.getYourHandMessage() + userHand.getHandName(language));
        System.out.println(language.getCpuHandMessage() + cpuHand.getHandName(language));
        System.out.println(language.getResultMessage(game.getResult(), language));

        scanner.close();
    }
}

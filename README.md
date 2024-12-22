# Janken App

## Overview

Janken App is a simple command-line application for playing Rock-Paper-Scissors (called *Janken* in Japanese) against a computer. The game supports both Japanese and English languages. The computer's hand is randomly selected, and the results are displayed along with the hands chosen by the player and the computer.

---

## How to Build and Run

### **1. Build with Maven**

Use Maven Wrapper to build the project:

```bash
./mvnw clean package
```

This generates the executable JAR file in the `target` directory.

### **2. Run the application**

Run the JAR file with the following command:

```bash
java -jar target/JankenApp-1.0-SNAPSHOT.jar
```

---

## Example Output

### English Mode

```plaintext
Select language (1: 日本語, 2: English):
2
Starting Rock-Paper-Scissors.
Please choose your hand (0: Rock, 1: Scissors, 2: Paper):
0
Your hand: Rock
CPU hand: Paper
You Lose
```

### Japanese Mode

```plaintext
言語を選択してください (1: 日本語, 2: English):
1
じゃんけんを始めます。
手を選択してください (0: グー, 1: チョキ, 2: パー):
2
あなたの手: パー
コンピュータの手: チョキ
あなたの負け
```

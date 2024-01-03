/*
    Signal Report
    A radio station's RS signal report is usually comprised of two or three components:
    - R (Readability): This refers to the signal's recognizability or clarity.
    - S (Strength): This indicates the signal's magnitude or strength.

    The report places 'R' (Readability) first, categorising it into five levels, denoted by numbers 1-5:
    1. Unreadable
    2. Barely readable, with occasional words distinguishable
    3. Readable with considerable difficulty
    4. Readable with practically no difficulty
    5. Perfectly readable

    Following 'R' in the report is 'S' (Strength), which is categorised into nine levels, represented by numbers 1-9:
    1. Faint signals, barely perceptible
    2. Very weak signals
    3. Weak signals
    4. Fair signals
    5. Fairly good signals
    6. Good signals
    7. Moderately strong signals
    8. Strong signals
    9. Extremely strong signals

    Your program will interpret a numerical signal report and output its corresponding meaning.
    For instance, if the report is '59', the output will be: "Extremely strong signals, perfectly readable."

    For example:
    Input: 33 (RS)
    Output: Weak signal, readable with considerable difficulty (SR)
*/

import java.util.Scanner;

public class QuizSignal {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // This line creates a new 'Scanner object' named 'in' that reads from the console.
        
        int signal = in.nextInt(); 
        // Reads the user input
        // This line waits for the user to input a line of integer and then reads it into the int 'signal'.

        // Extracting the ones and tens digits

        in.close();
        int S = signal % 10;
        int R = (signal / 10) % 10;

        String readability;
        String strength;
        
        switch (R) {
            case 1: 
                readability="unreadable";
                break;
            case 2: 
                readability="barely readable, with occasional words distinguishable";
                break;
            case 3: 
                readability="readable with considerable difficulty";
                break;
            case 4: 
                readability="readable with practically no difficulty";
                break;
            case 5: 
                readability="perfectly readable";
                break;
            default: 
                readability="invalid readability";
                break;
        };

        switch (S) {
            case 1: 
                strength="Faint signals, barely perceptible";
                break;
            case 2: 
                strength="Very weak signals";
                break;
            case 3: 
                strength="Weak signals";
                break;
            case 4: 
                strength="Fair signals";
                break;
            case 5: 
                strength="Fairly good signals";
                break;
            case 6: 
                strength="Good signals";
                break;
            case 7: 
                strength="Moderately strong signals";
                break;
            case 8: 
                strength="Strong signals";
                break;
            case 9: 
                strength="Extremely strong signals";
                break;
            default: 
                strength="Invalid strength";
                break;
        };
        System.out.println(strength+", "+readability);
    }
}

// With break: Exits the switch block after executing the matched case.
// Without break: Causes "fall-through", where subsequent case statements are executed until a break is encountered or the switch block ends.
package ru.job4j.condition;

public class AlertDivZero {
    public static void possibleDiv(int number) {
        boolean result = number == 0;
        if (result) {
            System.out.println("Could not div by 0.");
        }
    }

    public static void main(String[] args) {
        AlertDivZero.possibleDiv(4);
        AlertDivZero.possibleDiv(0);
    }
}

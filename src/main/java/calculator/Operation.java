package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operation {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public int inputNum(){
        String input = "";
        int result = 0;
        try {
            input = reader.readLine();
            result = Integer.parseInt(input);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("Wrong data!");
        }
        return result;
    }
    public String operation(){
        String operation = null;
        try {
            operation = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return operation;
    }

    public int plus (int a, int b){
        return a + b;
    }
    public int minus(int a, int b){
        return a - b;
    }
    public int times (int a, int b){
        return a * b;
    }
    public double divide(int a, int b){
        if(b == 0)
            System.err.println("Division by zero!");
        return a * 1.0 / b;
    }
    public int pow (int a, int b){
        return (int) Math.pow(a, b);
    }

    public void doOperation(){
        System.out.println("Enter first number: ");
        int a = inputNum();
        System.out.println("Enter the operation type: ");
        System.out.println("To sum - enter '+'\nTo subtract - enter '-'\nTo multiply - enter '*'" +
                "\nTo divide - enter '/'\nTo power - enter '&'");
        String input = operation();
        System.out.println("Enter second number: ");
        int b = inputNum();

        switch (input) {
            case "+" -> System.out.println("The result is " + (long)plus(a, b));
            case "-" -> System.out.println("The result is " + minus(a, b));
            case "*" -> System.out.println("The result is " + (long)times(a, b));
            case "/" -> System.out.println("The result is " + divide(a, b));
            case "&" -> System.out.println("The result is " + pow(a, b));
            default -> throw new IllegalArgumentException("Wrong operation!");
        }
    }
}


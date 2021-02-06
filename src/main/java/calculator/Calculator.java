package calculator;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Super-Duper Calculator of the 21st century!\nLet's begin!");
        Calculator calculator = new Calculator();
        calculator.doCalc();

    }

    private void doCalc(){
        Operation operation = new Operation();
        while (true){
            operation.doOperation();
            System.out.println("Let's try again!");
        }
    }
}

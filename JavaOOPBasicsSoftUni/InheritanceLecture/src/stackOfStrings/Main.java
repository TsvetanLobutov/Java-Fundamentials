package stackOfStrings;

public class Main {
    public static void main(String[] args) {

        StackOfStrings stack = new StackOfStrings();

        stack.push("Stamat");
        stack.push("Ivan");
        stack.push("Prsho");
        stack.push("Gosho");

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }



    }
}

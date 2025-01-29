public class Main {
    public static void main(String[] args) {

        printMessage("hello world", "pas bien");
    }
    // refacto hello in function
    public static void printMessage(String message, String pasMessage){
        System.out.println(message + " " + pasMessage);
    }
}
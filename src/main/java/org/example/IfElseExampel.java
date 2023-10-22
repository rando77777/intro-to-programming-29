public class IfElseExample {

    public static void main(String[] args) {
        System.out.println("Let's make decision. Are You adult or kid?");

        // if I'm adult print "I'm adult"
        // otherwise print "Just a kid"
        int age = 15;
        if (age >= 18) {
            System.out.println("I'm adult");
        }

        if (age < 18) {
            System.out.println("Just a kid");
        }

        // code block marked with pair of curly braces is like one instruction
        if (age >= 18) {
            System.out.println("If is true");
            System.out.println("Adult");
        } else {
            System.out.println("Else, if was false");
            System.out.println("Kid");
        }
    }
}





















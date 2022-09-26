public class Main {
    public static void main(String[] args) {
        Griffin test = new Griffin();

        test.setPassword(test.generatePassword(13));
        test.debug();
    }
}
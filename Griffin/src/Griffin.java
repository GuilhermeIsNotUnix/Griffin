import java.util.Random;

public class Griffin {
    private String password;

    public Griffin() {
        this.password = "";
    }

    //Generates a random lowercase letter
    public char randomLowercaseLetter() {
        String lowercaseAlphabet = "abcdefghijklmnopqrstuvwxyz";
        Random randomAlpha = new Random();
        char lowercaseLetter;

        lowercaseLetter = lowercaseAlphabet.charAt(randomAlpha.nextInt(0, lowercaseAlphabet.length()));

        return lowercaseLetter;
    }

    //Generates a random uppercase letter
    public char randomUppercaseLetter() {
        char uppercaseLetter;

        uppercaseLetter = Character.toUpperCase(randomLowercaseLetter());

        return uppercaseLetter;
    }

    //Generates a random number
    public int randomNumber() {
        Random randomNumeric = new Random();
        int randomNumber;

        randomNumber = randomNumeric.nextInt(0, 9);

        return randomNumber;
    }

    //Generates a random symbol
    public char randomSymbol() {
        String symbolAlphabet = "'!@#$%&*()_-+={}[]~^`´<>,.:;?/";
        Random randomSymbol = new Random();
        char symbol;

        symbol = symbolAlphabet.charAt(randomSymbol.nextInt(0, symbolAlphabet.length()));

        return symbol;
    }

    public String generatePassword(int passwordLenght) {
        StringBuilder newPassword = new StringBuilder();
        int i = 0;

        if(passwordLenght < 4) {
            return "ERROR: Insecure password, less than 4 characters...";
        } else {
            try {
                while(i <= passwordLenght || passwordLenght > 0) {
                //for(int i = 0; i < passwordLenght; i++) {
                    if(passwordLenght > 0) {
                        newPassword.append(randomUppercaseLetter());
                        passwordLenght--;
                    }

                    if(passwordLenght > 0) {
                        newPassword.append(randomLowercaseLetter());
                        passwordLenght--;
                    }

                    if(passwordLenght > 0) {
                        newPassword.append(randomNumber());
                        passwordLenght--;
                    }

                    if(passwordLenght > 0) {
                        newPassword.append(randomSymbol());
                        passwordLenght--;
                    }

                    i++;
                }
            } catch(Exception e) {
                return "ERROR 666: Something went wrong.";
            }
        }

        return newPassword.toString();
    }

    //Use generatePassword() as argument to set it as the password
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void debug() {
        System.out.println();
        System.out.println(this.password);
        System.out.println("Size = " + this.password.length() + " characters");
    }
}

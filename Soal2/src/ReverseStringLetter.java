public class ReverseStringLetter {

    private String inputString;

    public ReverseStringLetter(String inputString) {
        this.inputString = inputString;
    }

    public String reverseString() {
        String outputString = "";

        for(int i = inputString.length() - 1; i >= 0; i--) {
            outputString += inputString.charAt(i);
        }

        return  outputString;
    }
}

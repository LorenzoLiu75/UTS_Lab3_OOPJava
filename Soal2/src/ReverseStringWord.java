public class ReverseStringWord {

    private String inputString;

    public ReverseStringWord(String inputStringWord) {
        this.inputString = inputStringWord;
    }

    public String reverseString() {
        String[] words = inputString.split(" ");
        String[] reversedWords = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            reversedWords[i] = words[words.length - i - 1];
        }

        return String.join(" ", reversedWords);
    }
}

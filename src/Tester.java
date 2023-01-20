/**
 * This class is used to test the word games class
 * @author Alessandro Calabrese
 */
public class Tester {
    public static void main(String[] args) {
        WordGames wordGames = new WordGames();
        System.out.println(wordGames.addHelloWord("Word"));
        System.out.println(wordGames.getFullName("Alessandro", "Calabrese"));
    }
}

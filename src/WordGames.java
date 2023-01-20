/**
 * This class represents on Word Games
 * @author Alessandro Calabrese
 */
public class WordGames {
    /**
     * addHelloWord method adds the word "Hello" to the beginning of the input word
     * @param word the input word
     * @return String Hello word
     */
    public String addHelloWord(String word){
        return "Hello " + word;
    }

    /**
     * getFullName method concatenates the name and surname
     * @param name the first input
     * @param surname the last input
     * @return
     */
    public String getFullName(String name, String surname){
        return name + "" + surname;
    }
}

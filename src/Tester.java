/**
 * Questa è la classe con il metodo main per utilizzare e provare i metodi della classe WorldGames
 *
 */
public class Tester {
    public static void main(String[] args) {

        WordGames test = new WordGames();

        System.out.println(test.addHelloWord("world"));

        System.out.println(test.getFullName("Marco", "Rossi"));
    }
}

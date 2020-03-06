/**
 * @author alex.collins
 */
public class App {

    public static void main(String[] args) throws Exception {

        GameFactory gf = new GameFactory();
        gf.computeLang(App.class.getResourceAsStream("/example.field"));

    }

}

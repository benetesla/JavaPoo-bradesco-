
import br.com.meuprojeto.Cachorro;
public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro("Totó", "Vira-lata", 5);
        cachorro.latir();
        cachorro.correr();
    }
}

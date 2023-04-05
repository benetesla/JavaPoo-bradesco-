
import br.com.meuprojeto.Cachorro;
public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Totó");
        cachorro.setRaca("Pitbull");
        cachorro.setIdade(2);
        cachorro.setQuantidadeDePatas(4);
        
        cachorro.latir();
        cachorro.correr();
        System.out.println(cachorro.getNome());
        System.out.println(cachorro.getRaca());
        System.out.println(cachorro.getIdade());
        System.out.println(cachorro.getQuantidadeDePatas());
    }
}

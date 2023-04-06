import br.com.meuprojeto.Funcionario;
import br.com.meuprojeto.Cachorro;
import br.com.meuprojeto.Gato;
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

        //segundo cachorro
        Cachorro cachorro2 = new Cachorro();
        cachorro2.setNome("Apolo");
        cachorro2.setRaca("Pitbull");
        cachorro2.setIdade(2);
        cachorro2.setQuantidadeDePatas(4);

        cachorro2.latir();
        cachorro2.correr();
        System.out.println(cachorro2.getNome() + " " + cachorro2.getRaca() + " " + cachorro2.getIdade() + " " + cachorro2.getQuantidadeDePatas());

        //gato

        Gato gato = new Gato();
        gato.setNome("Salem");
        gato.setRaca("Persa");
        gato.setIdade(2);
        gato.setHabilidadeDePular(2);
        gato.setHabitos(2);

        gato.miar();
        gato.correr();
        System.out.println(gato.getNome() + " " + gato.getRaca() + " " + gato.getIdade() + " " + gato.getHabilidadeDePular() + " " + gato.getHabitos());
    
        //funcionario
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setAtivo(true);

        System.out.println(funcionario.getNome() + " " + funcionario.isAtivo());
    }
}

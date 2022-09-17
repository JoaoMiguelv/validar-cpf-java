import entidades.Cliente;
import entidades.Endereco;
import entidades.Contato;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente obj1 = new Cliente("111.444.777-35"); // criando quando cadastra o cliente e não se pode alterar
        obj1.getDocumento().setCnh("123456789");
        obj1.getDocumento().setRg("10.258.452-9");
        System.out.println(obj1);
        obj1.toString();
        // DEFINIR OS VALORES CORRESPONDENTES AO ENDEREÇO, CONTATO E NOME DE UM CLIENTE
        obj1.setEndereco(new Endereco("14403-645"));
        obj1.setContato(new Contato("11 99999-9999"));
        obj1.setNome("João da Silva");
        System.out.println(obj1);

        System.out.println("FIM");
    }
}

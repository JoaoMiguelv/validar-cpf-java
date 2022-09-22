import java.time.LocalDate;

import entidades.Cliente;
import entidades.Endereco;
import entidades.Contato;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente obj1 = new Cliente("111.444.777-35"); // criando quando cadastra o cliente e não se pode alterar
        obj1.getDocumento().setCnh("123456789");
        obj1.getDocumento().setRg("10.258.452-9");

        // DEFINIR OS VALORES CORRESPONDENTES AO ENDEREÇO, CONTATO E NOME DE UM CLIENTE
        obj1.setEndereco(new Endereco("14403-645"));
        obj1.getEndereco().setBairro("Pinheiros");
        obj1.getEndereco().setCidade("Franca");
        obj1.getEndereco().setLogradouro("Rua 1");
        obj1.getEndereco().setNome("Casa");
        obj1.getEndereco().setNumero("123");
        obj1.getEndereco().setUf("SP");

        obj1.setContato(new Contato("11 99999-9999"));
        obj1.getContato().setEmail("joaomiguelmv_04@hotmail.com");
        obj1.getContato().setFixo("11 3722-4596");

        obj1.setNome("João Miguel");
        obj1.setDataNascimento(LocalDate.of(2001, 02, 04));

        System.out.println(obj1.toString());

        System.out.println("FIM");
    }
}

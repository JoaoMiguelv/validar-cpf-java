package entidades;

public class Documento {
    private String rg;
    private String cpf;
    private String cnh;

    public Documento(String cpf) {
        validaCPF(cpf);
        // this.setCpf(cpf); // atributo obrigatório

    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    private boolean calculaCpf(String cpf, int posicao) {
        int digVerificador = Character.getNumericValue(cpf.charAt(posicao)); // converte o caractere para inteiro

        int soma = 0;
        for (int i = 0; i < cpf.length() - (11 - posicao); i++) {
            int digito = Character.getNumericValue(cpf.charAt(i));
            soma = soma + digito * ((posicao + 1) - i);
        }

        int resto = soma % 11;
        if ((resto < 2) && (digVerificador != 0)) {
            System.out.println("CPF INVÁLIDO");
            return false;

        } else if ((resto >= 2) && (digVerificador != (11 - resto))) {
            System.out.println("CPF INVÁLIDO");
            return false;
        }
        System.out.println("CPF VÁLIDO");
        return true;
    }

    private boolean validaCPF(String cpf) {
        cpf = cpf.replace(".", ""); // substitui os pontos por vazio
        cpf = cpf.replace("-", ""); // substitui os traços por vazio

        return (calculaCpf(cpf, 9) && calculaCpf(cpf, 10));
    }

    public static void main(String[] args) {
        Documento doc = new Documento("503.784.278-93");
    }

}
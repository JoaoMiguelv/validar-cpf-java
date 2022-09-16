package entidades;

public class Documento {
    private String rg;
    private String cpf;
    private String cnh;

    public Documento(String cpf) {
        validaCpf(cpf);
        if (validaCpf(cpf)) {
            System.out.println("CPF VÁLIDO");
            setCpf(cpf);
        } else {
            System.out.println("CPF INVÁLIDO");
            System.exit(-1);
        }

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
            return false;

        } else if ((resto >= 2) && (digVerificador != (11 - resto))) {
            return false;
        }
        return true;
    }

    private boolean validaCpf(String cpf) {
        cpf = cpf.replace(".", "").replace("-", ""); // substitui os pontos por vazio

        return (calculaCpf(cpf, 9) && calculaCpf(cpf, 10));
    }

    public static void main(String[] args) {
        Documento doc = new Documento("111.444.777-93");
    }

}
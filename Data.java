package validadoretapa;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Construtor que valida a data informada
    public Data(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida. Atribuindo data padrão: 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    // Get e Set
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método que verifica se o ano é bissexto
    public boolean verificaAnoBissexto() {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Método auxiliar para validar a data informada
    private boolean validarData(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 1) {
            return false;
        }

        if (mes == 2) {
            if (verificaAnoBissexto()) {
                return dia <= 29;
            } else {
                return dia <= 28;
            }
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return dia <= 30;
        }

        return true;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
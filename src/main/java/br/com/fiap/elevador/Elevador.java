package br.com.fiap.elevador;

public class Elevador {

    private int id;
    private double cargaMaxima;
    private double cargaAtual;
    private boolean sinalAlerta;

    Calculadora calc = new Calculadora();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public double getCargaAtual() {
        return cargaAtual;
    }

    public void setCargaAtual(double cargaAtual) {
        this.cargaAtual = cargaAtual;
    }

    public boolean isSinalAlerta() {
        return sinalAlerta;
    }

    public void setSinalAlerta(boolean sinalAlerta) {
        this.sinalAlerta = sinalAlerta;
    }

    public double entrarNoElevador(double peso) {
        setCargaAtual(calc.somar(cargaAtual, peso));
        return cargaAtual;
    }

    public double sairDoElevador(double peso) {
        setCargaAtual(calc.subtrair(cargaAtual, peso));
        return cargaAtual;
    }

    public boolean avaliarPeso(double peso) {
        if (peso > this.cargaMaxima) {
            setSinalAlerta(true);
            return true;
        } else {
            setSinalAlerta(false);
            return false;
        }
    }
}

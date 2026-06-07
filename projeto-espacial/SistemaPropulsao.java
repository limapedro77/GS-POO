package GS1

// Estrutura comum para qualquer sistema de propulsão
public abstract class SistemaPropulsao {

    protected boolean ligado;
    protected double potencia;

    public SistemaPropulsao() {
        ligado = false;
        potencia = 0;
    }

    public void ligarMotor() {
        ligado = true;
    }

    public void desligarMotor() {
        ligado = false;
        potencia = 0;
    }

    public abstract void acelerar(double potencia);
    // Cada tecnologia de propulsão calcula o empuxo de forma diferente
    public abstract double calcularEmpuxo();
}
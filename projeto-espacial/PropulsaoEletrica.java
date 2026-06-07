package GS1

public class PropulsaoEletrica extends SistemaPropulsao {
    private double eficiencia;

    public PropulsaoEletrica(double eficiencia) {

        super();
        this.eficiencia = eficiencia;
    }

    @Override
    public void acelerar(double potencia) {

        if (potencia >= 0 && potencia <= 100) {
            this.potencia = potencia;
        }
    }

    @Override
    public double calcularEmpuxo() {
        return potencia * eficiencia;
    }
}
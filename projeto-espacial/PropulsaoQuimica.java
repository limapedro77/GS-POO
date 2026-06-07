
public class PropulsaoQuimica extends SistemaPropulsao {
    private String tipoCombustivel;

    public PropulsaoQuimica(String tipoCombustivel) {

        super();
        this.tipoCombustivel = tipoCombustivel;
    }
    @Override
    public void acelerar(double potencia) {

        if (potencia >= 0 && potencia <= 100) {
            this.potencia = potencia;
        }
    }
    @Override
    public double calcularEmpuxo() {
        return potencia * 150;
    }
}
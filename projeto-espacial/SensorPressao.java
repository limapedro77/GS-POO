
public class SensorPressao implements Sensor {

    @Override
    public double lerValor() {
        return Math.random() * 500;
    }
    @Override
    public boolean verificarFuncionamento() {
        return true;
    }
    @Override
    public String retornarTipo() {
        return "Pressão";
    }
}
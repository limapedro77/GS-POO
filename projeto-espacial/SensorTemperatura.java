
public class SensorTemperatura implements Sensor {
    @Override
    public double lerValor() {
        return Math.random() * 150;
    }
    @Override
    public boolean verificarFuncionamento() {
        return true;
    }
    @Override
    public String retornarTipo() {
        return "Temperatura";
    }
}
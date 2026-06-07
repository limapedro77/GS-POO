
public class SensorRadiacao implements Sensor {
    @Override
    public double lerValor() {
        return Math.random() * 1000;
    }
    @Override
    public boolean verificarFuncionamento() {
        return true;
    }
    @Override
    public String retornarTipo() {
        return "Radiação";
    }
}
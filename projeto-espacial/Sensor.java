package GS1

// Contrato comum para todos os sensores do sistema
public interface Sensor {
    double lerValor();
    boolean verificarFuncionamento();
    String retornarTipo();
}
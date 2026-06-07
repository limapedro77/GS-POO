
import java.util.Scanner;

public class SistemaMonitoramento {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Instâncias principais do sistema
        SensorTemperatura temp = new SensorTemperatura();
        SensorPressao pressao = new SensorPressao();
        SensorRadiacao radiacao = new SensorRadiacao();

        PropulsaoQuimica motor = new PropulsaoQuimica("Hidrogênio");

        
        DadosMissao missao = new DadosMissao(
                "10°N 20°W",
                75,
                "Órbita Terrestre",
                5,
                "1234"
        );

        int opcao;

        do {

            // Menu principal de interação com o operador
            System.out.println("\n---- MENU ----");
            System.out.println("1 - Verificar sensores");
            System.out.println("2 - Controlar propulsão");
            System.out.println("3 - Verificar combustível");
            System.out.println("4 - Exibir coordenadas");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println(
                            "Temperatura: " + temp.lerValor());

                    System.out.println(
                            "Pressão: " + pressao.lerValor());

                    System.out.println(
                            "Radiação: " + radiacao.lerValor());

                    break;

                case 2:

                    System.out.print("Potência (0-100): ");
                    double potencia = scanner.nextDouble();

                    motor.acelerar(potencia);

                    System.out.println(
                            "Empuxo: " +
                                    motor.calcularEmpuxo());

                    break;

                case 3:

                    missao.verificarCombustivel();

                    System.out.println(
                            "Combustível: " +
                                    missao.getCombustivel() + "%");

                    break;

                case 4:

                    scanner.nextLine();

                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();

                    System.out.println(
                            missao.getCoordenadas(senha));

                    break;

                case 0:

                    System.out.println("Sistema encerrado.");
                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
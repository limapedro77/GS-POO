package GS1

public class ModuloControle extends ComponenteEspacial {

    public ModuloControle(int id, String nome) {
        super(id, nome);
    }

    @Override
    public void exibirStatus() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Status: " + (status ? "Ligado" : "Desligado"));
        System.out.println("Temperatura: " + temperatura + "°C");
    }
}
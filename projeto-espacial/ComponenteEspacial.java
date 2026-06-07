package GS1

// Classe base para qualquer componente monitorado da estação
public abstract class ComponenteEspacial {
    protected int id;
    protected String nome;
    protected boolean status;
    protected double temperatura;

    public ComponenteEspacial(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.status = false;
        this.temperatura = 25;
    }
    // Ativa o componente
    public void ligar() {
        status = true;
        System.out.println(nome + " ligado.");
    }

    // Desativa o componente
    public void desligar() {
        status = false;
        System.out.println(nome + " desligado.");
    }

    // Cada componente exibe seu status de forma específica
    public abstract void exibirStatus();
}
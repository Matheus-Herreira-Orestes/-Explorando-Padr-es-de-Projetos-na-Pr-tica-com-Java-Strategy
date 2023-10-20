package dio.projetos.Padrao.de.projeto.Robo;

public class Robo {

    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover();
    }

    public void falar(){
        comportamento.falar();
    }

    public void action(){
        comportamento.action();
    }
}

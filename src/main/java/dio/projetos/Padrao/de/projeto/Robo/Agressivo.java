package dio.projetos.Padrao.de.projeto.Robo;

public class Agressivo implements Comportamento {
    @Override
    public void mover(){
        System.out.println("O robo anda de um lado para o outro da sala de forma impaciente.");
    }

    @Override
    public void falar(){
        System.out.println("Você tenta falar com o robo, mas ele te ofende.");
    }

    @Override
    public void action(){
        System.out.println("O robo está procurando uma faca na cozinha, melhor tomar cuidado.");
    }

}

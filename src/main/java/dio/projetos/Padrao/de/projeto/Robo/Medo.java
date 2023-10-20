package dio.projetos.Padrao.de.projeto.Robo;

public class Medo implements Comportamento{
    @Override
    public void mover(){
        System.out.println("O robo esta andando encolhido, como se estivesse com medo de algo.");
    }

    @Override
    public void falar(){
        System.out.println("Você tenta se comunicar com o robo, ele te responde com a voz trêmula e se encolhe.");
    }

    @Override
    public void action(){
        System.out.println("Você se aproxima do robo, ele começa a chorar e sai correndo, você se sente culpado.");
    }
}

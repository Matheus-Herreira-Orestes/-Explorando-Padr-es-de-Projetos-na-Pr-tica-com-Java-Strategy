package dio.projetos.Padrao.de.projeto.Robo;

public class Calmo implements Comportamento{

    @Override
    public void mover(){
        System.out.println("O robo anda bem devagar, como se não tivesse nenhum problema na vida.");
    }

    @Override
    public void falar(){
        System.out.println("O robo fala com você de maneira lenta e sem preocupações.");
    }

    @Override
    public void action(){
        System.out.println("O robo te chama para tomar um chá.");
    }
}

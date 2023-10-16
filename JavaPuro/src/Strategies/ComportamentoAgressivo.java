package Strategies;

public class ComportamentoAgressivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("======");
        System.out.println("Movendo-se Agressivamente!!!");
        System.out.println("======");
    }
    
}

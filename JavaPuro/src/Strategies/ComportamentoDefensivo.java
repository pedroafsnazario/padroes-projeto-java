package Strategies;

public class ComportamentoDefensivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("======");
        System.out.println("Movendo-se Defensivamente!!!");
        System.out.println("======");
    }
    
}

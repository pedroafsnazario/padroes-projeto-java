import Singletons.SingletonEager;
import Singletons.SingletonLazy;
import Singletons.SingletonLazyHolder;
import Strategies.Comportamento;
import Strategies.ComportamentoAgressivo;
import Strategies.ComportamentoDefensivo;
import Strategies.ComportamentoNormal;
import Strategies.Robo;

public class Test {
    public static void main(String[] args) {

    //teste dos Singleton -- >

    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);

    SingletonEager eager = SingletonEager.getInstancia();
    System.out.println(eager);
    eager = SingletonEager.getInstancia();
    System.out.println(eager);

    SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
    System.out.println(holder);
    holder = SingletonLazyHolder.getInstancia();
    System.out.println(holder);


    //teste de Strategy -- >
    Comportamento normal = new ComportamentoNormal();
    Comportamento agressivo = new ComportamentoAgressivo();
    Comportamento defensivo = new ComportamentoDefensivo();

    Robo robo = new Robo();
    robo.setStrategy(normal);
    
    robo.mover();
    robo.mover();

    robo.setStrategy(defensivo);

    robo.mover();
    robo.mover();

    robo.setStrategy(agressivo);

    robo.mover();
    robo.mover();

    }

}

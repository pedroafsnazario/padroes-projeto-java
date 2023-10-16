import Singletons.SingletonEager;
import Singletons.SingletonLazy;
import Singletons.SingletonLazyHolder;

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

    }

}

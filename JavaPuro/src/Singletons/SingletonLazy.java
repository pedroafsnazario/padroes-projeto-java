package Singletons;
public class SingletonLazy {
    //Lazy Singleton.
    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}

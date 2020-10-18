package creational.singleton;

/*
 * Created by : vedikagupta
 * Date : 18/10/20
 */
public class SingletonObject {
    private static SingletonObject instance;

    private SingletonObject() {
    }

    public static SingletonObject getInstance() {
        if (instance == null)
            instance = new SingletonObject();
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton Design Pattern");
    }
}

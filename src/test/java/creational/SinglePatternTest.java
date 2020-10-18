package creational;

import creational.singleton.SingletonObject;

/*
 * Created by : vedikagupta
 * Date : 18/10/20
 */
public class SinglePatternTest {
    public static void main(String[] args) {
        //SingletonObject object = new SingletonObject();

        SingletonObject.getInstance().showMessage();
    }
}

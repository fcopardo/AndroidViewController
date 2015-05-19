package org.grizzly.androidviewcontroller;

/**
 * Created by FcoPardo on 5/19/15.
 */
public interface ObservableForm {

    void addFormObserver(FormObserver f);
    void removeFormObserver(FormObserver f);
    void notifyObserver();
    void notifyObserver(String s);
    <T> void notifyDataChanges(Class<T> dataClass, T data);
    <T> void notifyFormChanges(Class<T> dataClass, T data);
}

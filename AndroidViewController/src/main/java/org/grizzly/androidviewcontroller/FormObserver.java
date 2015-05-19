package org.grizzly.androidviewcontroller;

/**
 * Created by FcoPardo on 5/19/15.
 */
public interface FormObserver {

    <T> void onFormUpdate(T formData, Class<T> formDataClass);
    <X> void onDataupdate(X data, Class<X> dataClass);
    void onUpdate();
    String getMyTag();

}

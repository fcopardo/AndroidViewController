package org.grizzly.androidviewcontroller;


/**
 * Created by FcoPardo on 5/1/15.
 */
public interface AndroidModelInterface<T extends bundleModel> {

    public AndroidDataModel<T> getModel();

    void setModel(T model);

}


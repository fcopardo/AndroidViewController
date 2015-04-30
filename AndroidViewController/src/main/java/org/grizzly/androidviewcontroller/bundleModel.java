package org.grizzly.androidviewcontroller;

import android.os.Bundle;

/**
 * Created by fpardo on 4/30/15.
 */
public abstract class bundleModel {

    public bundleModel(Bundle bundle){
        setFromBundle(bundle);
    }

    public abstract void setFromBundle(Bundle bundle);
    public abstract Bundle getABundle();

}

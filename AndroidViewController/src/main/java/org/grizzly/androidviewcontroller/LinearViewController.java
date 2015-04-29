package org.grizzly.androidviewcontroller;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by FcoPardo on 4/28/15.
 */
public abstract class LinearViewController<T> extends LinearLayout {

    private AndroidDataController<T> dataContentController;

    public LinearViewController(Context context, Class<T> dataContentClass) {
        super(context);
        dataContentController = new AndroidDataController<>(dataContentClass);
    }

    public LinearViewController(Context context, AttributeSet attrs, Class<T> dataContentClass) {
        super(context, attrs);
        dataContentController = new AndroidDataController<>(dataContentClass);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public LinearViewController(Context context, AttributeSet attrs, int defStyleAttr, Class<T> dataContentClass) {
        super(context, attrs, defStyleAttr);
        dataContentController = new AndroidDataController<>(dataContentClass);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public LinearViewController(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes, Class<T> dataContentClass) {
        super(context, attrs, defStyleAttr, defStyleRes);
        dataContentController = new AndroidDataController<>(dataContentClass);
    }

    public AndroidDataController<T> getDataContentController(){
        return dataContentController;
    }

    public abstract void initializeComponents();


}

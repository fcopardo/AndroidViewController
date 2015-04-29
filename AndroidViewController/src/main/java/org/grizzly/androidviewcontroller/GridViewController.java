package org.grizzly.androidviewcontroller;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.GridLayout;

/**
 * Created by FcoPardo on 4/28/15.
 */
@TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
public abstract class GridViewController<T> extends GridLayout {

    private AndroidDataController<T> dataContentController;

    public GridViewController(Context context, Class<T> dataContentClass) {
        super(context);
        dataContentController = new AndroidDataController<>(dataContentClass);
    }

    public GridViewController(Context context, AttributeSet attrs, Class<T> dataContentClass) {
        super(context, attrs);
        dataContentController = new AndroidDataController<>(dataContentClass);
    }

    public GridViewController(Context context, AttributeSet attrs, int defStyleAttr, Class<T> dataContentClass) {
        super(context, attrs, defStyleAttr);
        dataContentController = new AndroidDataController<>(dataContentClass);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public GridViewController(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes, Class<T> dataContentClass) {
        super(context, attrs, defStyleAttr, defStyleRes);
        dataContentController = new AndroidDataController<>(dataContentClass);
    }

    public AndroidDataController<T> getDataContentController(){
        return dataContentController;
    }

    public abstract void initializeComponents();

}

package org.grizzly.androidviewcontroller;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TableLayout;

/**
 * Created by FcoPardo on 4/28/15.
 */
public abstract class TableViewController<T> extends TableLayout {

    private AndroidDataController<T> dataContentController;

    public TableViewController(Context context, Class<T> dataContentClass) {
        super(context);
        dataContentController = new AndroidDataController<>(dataContentClass);
    }

    public TableViewController(Context context, AttributeSet attrs, Class<T> dataContentClass) {
        super(context, attrs);
        dataContentController = new AndroidDataController<>(dataContentClass);
    }

    public AndroidDataController<T> getDataContentController(){
        return dataContentController;
    }

    public abstract void initializeComponents();

}

package org.grizzly.androidviewcontroller;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TableLayout;
import android.widget.TableRow;

/**
 * Created by FcoPardo on 4/28/15.
 */
public abstract class RowViewController<T> extends TableRow {

    private AndroidDataController<T> dataContentController;

    public RowViewController(Context context, Class<T> dataContentClass) {
        super(context);
        dataContentController = new AndroidDataController<>(dataContentClass);
    }

    public RowViewController(Context context, AttributeSet attrs, Class<T> dataContentClass) {
        super(context, attrs);
        dataContentController = new AndroidDataController<>(dataContentClass);
    }

    public AndroidDataController<T> getDataContentController(){
        return dataContentController;
    }

    public abstract void initializeComponents();

}

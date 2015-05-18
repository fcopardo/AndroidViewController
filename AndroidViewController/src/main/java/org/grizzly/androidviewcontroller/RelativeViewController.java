package org.grizzly.androidviewcontroller;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * Created by FcoPardo on 4/28/15.
 */
public abstract class RelativeViewController<T extends bundleModel> extends RelativeLayout
        implements AndroidModelInterface<T> {

    private AndroidDataModel<T> dataContentController;

    public RelativeViewController(Context context, Class<T> dataContentClass) {
        super(context);
        dataContentController = new AndroidDataModel<>(dataContentClass);
    }

    public RelativeViewController(Context context, AttributeSet attrs, Class<T> dataContentClass) {
        super(context, attrs);
        dataContentController = new AndroidDataModel<>(dataContentClass);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public RelativeViewController(Context context, AttributeSet attrs, int defStyleAttr, Class<T> dataContentClass) {
        super(context, attrs, defStyleAttr);
        dataContentController = new AndroidDataModel<>(dataContentClass);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public RelativeViewController(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes, Class<T> dataContentClass) {
        super(context, attrs, defStyleAttr, defStyleRes);
        dataContentController = new AndroidDataModel<>(dataContentClass);
    }

    @Override
    public AndroidDataModel<T> getModel() {
        return dataContentController;
    }

    @Override
    public void setModel(T model) {
        dataContentController.setDataContent(model);
    }
}

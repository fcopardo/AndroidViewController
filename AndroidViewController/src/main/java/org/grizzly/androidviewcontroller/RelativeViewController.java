package org.grizzly.androidviewcontroller;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

/**
 * Created by FcoPardo on 4/28/15.
 */
public abstract class RelativeViewController<T extends bundleModel> extends RelativeLayout
        implements AndroidModelInterface<T> {

    private AndroidDataModel<T> dataContentController;
    protected int layout = 0;

    public RelativeViewController(Context context, Class<T> dataContentClass) {
        super(context);
        dataContentController = new AndroidDataModel<>(dataContentClass);
        initMain();
    }

    public RelativeViewController(Context context, AttributeSet attrs, Class<T> dataContentClass) {
        super(context, attrs);
        dataContentController = new AndroidDataModel<>(dataContentClass);
        initMain();
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public RelativeViewController(Context context, AttributeSet attrs, int defStyleAttr, Class<T> dataContentClass) {
        super(context, attrs, defStyleAttr);
        dataContentController = new AndroidDataModel<>(dataContentClass);
        initMain();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public RelativeViewController(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes, Class<T> dataContentClass) {
        super(context, attrs, defStyleAttr, defStyleRes);
        dataContentController = new AndroidDataModel<>(dataContentClass);
        initMain();
    }

    protected void initMain(){
        ((LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(layout, this, true);
    }

    @Override
    public AndroidDataModel<T> getModel() {
        getFromComponents();
        return dataContentController;
    }

    @Override
    public void setModel(T model) {
        dataContentController.setDataContent(model);
        setComponents();
    }

    protected Activity getActivity() {
        return (Activity)getContext();
    }

    @Override
    protected void onFinishInflate(){
        super.onFinishInflate();
        initComponents();
    }

    protected abstract void initComponents();

    protected abstract void setComponents();
    protected abstract void getFromComponents();
}

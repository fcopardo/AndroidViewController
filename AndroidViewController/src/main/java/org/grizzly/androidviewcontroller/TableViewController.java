package org.grizzly.androidviewcontroller;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TableLayout;

/**
 * Created by FcoPardo on 4/28/15.
 */
public abstract class TableViewController<T extends bundleModel> extends TableLayout implements AndroidModelInterface<T>{

    private AndroidDataModel<T> dataContentController;
    protected int layout = 0;

    public TableViewController(Context context, Class<T> dataContentClass) {
        super(context);
        dataContentController = new AndroidDataModel<>(dataContentClass);
        initMain();
    }

    public TableViewController(Context context, AttributeSet attrs, Class<T> dataContentClass) {
        super(context, attrs);
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

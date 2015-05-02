package org.grizzly.androidviewcontroller;

/**
 * Created by FcoPardo on 4/28/15.
 */
public class AndroidDataModel<T extends bundleModel>{
    private Class<T> dataContentClass;
    private T dataContent;

    public AndroidDataModel(Class<T> myContentClass){
        dataContentClass = myContentClass;
    }

    public void setDataContent(T content){
        dataContent = content;
    }

    public T getDataContent(){
        if(dataContent == null){
            try {
                dataContent = dataContentClass.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return dataContent;
    }

}
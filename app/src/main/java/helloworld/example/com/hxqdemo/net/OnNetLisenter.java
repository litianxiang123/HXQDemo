package helloworld.example.com.hxqdemo.net;

/**
 * Created by 李天祥 on 2018/3/13.
 */

public interface OnNetLisenter<T> {
    public void onSuccess(T t);

    public void onFailure(Exception e);

}

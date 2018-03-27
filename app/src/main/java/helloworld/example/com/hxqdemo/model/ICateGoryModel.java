package helloworld.example.com.hxqdemo.model;

import helloworld.example.com.hxqdemo.bean.CateGoryBean;
import helloworld.example.com.hxqdemo.bean.CateGroySubBean;
import helloworld.example.com.hxqdemo.net.OnNetLisenter;

/**
 * Created by 李天祥 on 2018/3/21.
 */

public interface ICateGoryModel {

    public void getCateGory(OnNetLisenter<CateGoryBean> onNetLisenter);

    public void getCateGroySub(String c,OnNetLisenter<CateGroySubBean> onNetLisenter);

}

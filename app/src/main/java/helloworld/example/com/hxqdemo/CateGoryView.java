package helloworld.example.com.hxqdemo;

import helloworld.example.com.hxqdemo.bean.CateGoryBean;
import helloworld.example.com.hxqdemo.bean.CateGroySubBean;

/**
 * Created by 李天祥 on 2018/3/21.
 */

public interface CateGoryView {

    public void getCateGory(CateGoryBean cateGoryBean);

    public void getCateGorySub(CateGroySubBean cateGroySubBean);
}

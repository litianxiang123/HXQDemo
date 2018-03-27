package helloworld.example.com.hxqdemo.model;

import helloworld.example.com.hxqdemo.bean.CateGoryBean;
import helloworld.example.com.hxqdemo.bean.CateGroySubBean;
import helloworld.example.com.hxqdemo.net.Api;
import helloworld.example.com.hxqdemo.net.OnNetLisenter;
import helloworld.example.com.hxqdemo.net.RetrofitHelper;
import helloworld.example.com.hxqdemo.net.ServiceApi;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by 李天祥 on 2018/3/21.
 */

public class CateGoryModel implements ICateGoryModel{

    @Override
    public void getCateGory(final OnNetLisenter<CateGoryBean> onNetLisenter) {

        ServiceApi serviceApi = RetrofitHelper.getServiceApi(Api.BASE_URL);
        Flowable<CateGoryBean> cateGoryBeanFlowable = serviceApi.categoryBean();
        cateGoryBeanFlowable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<CateGoryBean>() {
                    @Override
                    public void accept(CateGoryBean cateGoryBean) throws Exception {
                        onNetLisenter.onSuccess(cateGoryBean);
                    }
                });
    }

    @Override
    public void getCateGroySub(String c,final OnNetLisenter<CateGroySubBean> onNetLisenter) {
        ServiceApi serviceApi = RetrofitHelper.getServiceApi(Api.BASE_URL);
        Flowable<CateGroySubBean> cateGoryProduct = serviceApi.getCateGoryProduct(2+"");
        cateGoryProduct.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<CateGroySubBean>() {
                    @Override
                    public void accept(CateGroySubBean cateGroySubBean) throws Exception {
                        onNetLisenter.onSuccess(cateGroySubBean);
                    }
                });
    }
}

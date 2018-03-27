package helloworld.example.com.hxqdemo.net;

import helloworld.example.com.hxqdemo.bean.CateGoryBean;
import helloworld.example.com.hxqdemo.bean.CateGroySubBean;
import io.reactivex.Flowable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by 李天祥 on 2018/3/13.
 */

public interface ServiceApi {

    @GET(Api.GET_CATEGORY)
    Flowable<CateGoryBean> categoryBean();

    @POST(Api.GET_SUB_CATEGORY)
    @FormUrlEncoded
    Flowable<CateGroySubBean> getCateGoryProduct(@Field("categoryId") String c);


}

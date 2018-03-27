package helloworld.example.com.hxqdemo.presenter;

import helloworld.example.com.hxqdemo.CateGoryView;
import helloworld.example.com.hxqdemo.bean.CateGoryBean;
import helloworld.example.com.hxqdemo.bean.CateGroySubBean;
import helloworld.example.com.hxqdemo.model.CateGoryModel;
import helloworld.example.com.hxqdemo.model.ICateGoryModel;
import helloworld.example.com.hxqdemo.net.OnNetLisenter;

/**
 * Created by 李天祥 on 2018/3/21.
 */

public class CateGoryPresenter {

    private CateGoryView cateGoryView;
    private ICateGoryModel iCateGoryModel;

    public CateGoryPresenter(CateGoryView cateGoryView) {
        this.cateGoryView = cateGoryView;
        iCateGoryModel = new CateGoryModel();
    }

    public void getCateGory(){
        iCateGoryModel.getCateGory(new OnNetLisenter<CateGoryBean>() {
            @Override
            public void onSuccess(CateGoryBean cateGoryBean) {
                cateGoryView.getCateGory(cateGoryBean);
//                List<CateGoryBean.ResultBean> result = cateGoryBean.getResult();
//                int categoryId = result.get(0).getCategoryId();
//                getCateGroySub(categoryId+"");
            }

            @Override
            public void onFailure(Exception e) {

            }
        });
    }

    public void getCateGroySub(String c){
        iCateGoryModel.getCateGroySub(c + "", new OnNetLisenter<CateGroySubBean>() {
            @Override
            public void onSuccess(CateGroySubBean cateGroySubBean) {
                cateGoryView.getCateGorySub(cateGroySubBean);
            }

            @Override
            public void onFailure(Exception e) {

            }
        });
    }


}

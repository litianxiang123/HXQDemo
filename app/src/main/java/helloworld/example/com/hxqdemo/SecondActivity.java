package helloworld.example.com.hxqdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import helloworld.example.com.hxqdemo.bean.CateGoryBean;
import helloworld.example.com.hxqdemo.bean.CateGroySubBean;
import helloworld.example.com.hxqdemo.presenter.CateGoryPresenter;

public class SecondActivity extends AppCompatActivity implements CateGoryView{


    @BindView(R.id.lv)
    ListView mLv;
    @BindView(R.id.mlv)
    ListView  getmLv;
    @BindView(R.id.et_phone)
    EditText et_phone;
    @BindView(R.id.traceroute_rootview)
    LinearLayout mTracerouteRootview;
    @BindView(R.id.verify)
    TextView mVerify;
    @BindView(R.id.et_verify)
    EditText mEtVerify;
    @BindView(R.id.et_chioce)
    TextView mEtChioce;
    @BindView(R.id.close)
    ImageView mClose;
    @BindView(R.id.btn_login)
    Button mBtnLogin;

    private Context activity;


    private View formerView=null;

    private  Adapter adapter;

    private CateGoryPresenter cateGoryPresenter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);
        cateGoryPresenter = new CateGoryPresenter(this);
        cateGoryPresenter.getCateGory();
        cateGoryPresenter.getCateGroySub(2+"");
        initView();
    }

    public void initView() {

        showSoftInput(this, et_phone);
    }

    /***
     *
     * 显示输入软件盘，焦点在传进去的view上
     * @param context
     * @param view
     */

    public static void showSoftInput(Context context, View view) {
        if (view == null) {
            return;
        }
        view.requestFocus();
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm != null) {
            imm.showSoftInput(view, 0);
        }
    }


    /**
     * 隐藏输入软键盘
     *
     * @param view
     */
    public static void hideSoftInput(Context context, View view) {
        if (view == null) {
            return;
        }
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm != null) {
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    //隐藏输入软键盘
    @OnClick({R.id.traceroute_rootview, R.id.verify, R.id.close, R.id.btn_login})
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.traceroute_rootview:
                InputMethodManager imm = (InputMethodManager)
                        getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                break;
            case R.id.verify:
                Toast.makeText(this, "验证", Toast.LENGTH_SHORT).show();
                break;
            case R.id.close:
                finish();
                break;
            case R.id.btn_login:
                Intent intent = new Intent(SecondActivity.this,ThridActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void getCateGory(CateGoryBean cateGoryBean) {

//       adapter = new Adapter(SecondActivity.this,cateGoryBean.getResult());
//        mLv.setAdapter(adapter);
//
//        mLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                // TODO Auto-generated method stub
//                //这句是通知adapter改变选中的position
//                adapter.clearSelection(position);
//                //关键是这一句，激情了，它可以让listview改动过的数据重新加载一遍，以达到你想要的效果
//                adapter.notifyDataSetChanged();
//
////                CateGoryBean.ResultBean resultBean = (CateGoryBean.ResultBean) parent.getItemAtPosition(position);
////                int categoryId = resultBean.getCategoryId();
////                cateGoryPresenter.getCateGroySub(categoryId+"");
//            }
//        });

    }

    @Override
    public void getCateGorySub(CateGroySubBean cateGroySubBean) {

        CateAdapter adapter = new CateAdapter(this,cateGroySubBean.getResult());
        getmLv.setAdapter(adapter);
    }
}

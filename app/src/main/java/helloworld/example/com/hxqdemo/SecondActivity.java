package helloworld.example.com.hxqdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SecondActivity extends AppCompatActivity {


    @BindView(R.id.lv)
    ListView mLv;
    @BindView(R.id.et_phone)
    EditText et_phone;
    @BindView(R.id.traceroute_rootview)
    LinearLayout mTracerouteRootview;

    private List<String> list;
    private Context activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);
        initView();
    }

    public void initView() {

        list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add("Item:" + i);
        }

        Adapter adapter = new Adapter(this, list);
        mLv.setAdapter(adapter);

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
    @OnClick(R.id.traceroute_rootview)
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.traceroute_rootview:
                InputMethodManager imm = (InputMethodManager)
                        getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(v.getWindowToken(), 0);

                break;
        }
    }
}

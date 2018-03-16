package helloworld.example.com.hxqdemo;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.util.ArraySet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.zhy.view.flowlayout.FlowLayout;
import com.zhy.view.flowlayout.TagAdapter;
import com.zhy.view.flowlayout.TagFlowLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ThridActivity extends AppCompatActivity {


    private EditText et_search;
    private TextView tv_tip;
    private ImageView tv_clear;
    private TextView sousuo;

    private TagFlowLayout mFlowLayout;
    private List<String> strings;
    //布局管理器
    private LayoutInflater mInflater;
    //流式布局的子布局
    private TextView textview;

    String history = "";
    int a = 0;

    List<String> historylist = new ArrayList<>();

    public Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    mFlowLayout.setAdapter(new TagAdapter<String>(strings) {
                        @Override
                        public View getView(FlowLayout parent, int position, String s) {
                            textview = (TextView) mInflater.inflate(R.layout.textview,
                                    mFlowLayout, false);
                            textview.setText(s);
                            return textview;
                        }
                    });
                    break;
            }
            super.handleMessage(msg);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_thrid);

        // 初始化控件
        initView();


    }

    private void initView() {
        et_search = (EditText) findViewById(R.id.et_search);
        tv_tip = (TextView) findViewById(R.id.tv_tip);
        tv_clear = (ImageView) findViewById(R.id.tv_clear);
        sousuo = (TextView) findViewById(R.id.sousuo);
        mInflater = LayoutInflater.from(this);
        mFlowLayout = (TagFlowLayout) findViewById(R.id.id_flowlayout);

        strings = new ArrayList<>();

        final SharedPreferences preferences = getSharedPreferences("config",0);
        final  SharedPreferences.Editor editor = preferences.edit();

        String string = preferences.getString("string", "");

        String[] split = string.split("");
        if (split.length > 0&&!string.equals("")){
            for (int i = 0; i < split.length; i++) {
                strings.add(split[i]);
            }
            handler.sendEmptyMessageDelayed(1,0);
        }

        // 调整EditText左边的搜索按钮的大小
        Drawable drawable = getResources().getDrawable(R.drawable.search);
        drawable.setBounds(0, 0, 60, 60);// 第一0是距左边距离，第二0是距上边距离，60分别是长宽
        et_search.setCompoundDrawables(drawable, null, null, null);// 只放左边

        sousuo.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {

                String string = preferences.getString("string", "");

                historylist.clear();

                if (!et_search.getText().toString().trim().equals("")) {
                    String aa = et_search.getText().toString().trim();

                    Set<String> set = new ArraySet<>();
                    set.add(aa);
                    historylist.add(aa);
                    a++;
                    history+= aa+"   ";
                    for (int i=0;i<historylist.size();i++){
                        editor.putString("string",history).commit();
                        strings.add(historylist.get(i));
                    }
                    //通知handler更新UI
                    handler.sendEmptyMessageDelayed(1, 0);
                }else{
                    Toast.makeText(ThridActivity.this, "请输入要搜索的内容", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //TODO:清除历史信息
        tv_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                history = "";
                historylist.clear();
                strings.clear();
                handler.sendEmptyMessageDelayed(1, 0);
            }
        });

        //流式布局tag的点击方法
        mFlowLayout.setOnTagClickListener(new TagFlowLayout.OnTagClickListener() {
            @Override
            public boolean onTagClick(View view, int position, FlowLayout parent) {
                Toast.makeText(ThridActivity.this, textview.getText(), Toast.LENGTH_SHORT).show();
                return true;
            }
        });

    }


}

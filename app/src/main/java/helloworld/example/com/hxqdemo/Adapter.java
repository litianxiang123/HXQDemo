package helloworld.example.com.hxqdemo;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 李天祥 on 2018/3/13.
 */

public class Adapter extends BaseAdapter{
    private Context context;
    private List<String> list;
    private LayoutInflater inflater;
    private  int selectedPosition = 0;


    public Adapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    //这句是把listview的点击position,传递过来
    public void clearSelection(int position) {
        selectedPosition = position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.item,null);
            holder.tv =convertView.findViewById(R.id.tv);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

         //判断点击了哪个item,然后判断，让他的textview变色
        if(selectedPosition==position){
            holder.tv.setTextColor(Color.parseColor("#ff6501"));
            //在这里同时可以改变convertView的背景色
            //convertView.setBackgroundResource(R.color.red); 这里实在color中写的
        }else{
            holder.tv.setTextColor(Color.parseColor("#404040"));
            //这里设置未被选中的item的颜色
            //convertView.setBackgroundResource(R.color.color_fffff);
        }
        String s= list.get(position);
        holder.tv.setText("花小钱");
        return convertView;
    }

    class ViewHolder{
        TextView tv;
    }
}

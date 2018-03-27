package helloworld.example.com.hxqdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import helloworld.example.com.hxqdemo.bean.CateGroySubBean;

/**
 * Created by 李天祥 on 2018/3/21.
 */

public class CateAdapter extends BaseAdapter{

    private Context context;
    private List<CateGroySubBean.ResultBean> list;
    private LayoutInflater inflater;

    public CateAdapter(Context context, List<CateGroySubBean.ResultBean> list) {
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

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.item_cate,null);
            holder.tv_cate =convertView.findViewById(R.id.tv_cate);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        CateGroySubBean.ResultBean resultBean = list.get(position);
        holder.tv_cate.setText(resultBean.getName());
        return convertView;
    }

    class ViewHolder{
        TextView tv_cate;
    }
}

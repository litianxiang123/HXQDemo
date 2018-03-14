package helloworld.example.com.hxqdemo;

import android.content.Context;
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
        String s= list.get(position);
        holder.tv.setText(s);
        return convertView;
    }

    class ViewHolder{
        TextView tv;
    }
}

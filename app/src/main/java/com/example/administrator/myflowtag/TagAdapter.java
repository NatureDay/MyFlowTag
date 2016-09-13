package com.example.administrator.myflowtag;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

public class TagAdapter<T> extends BaseAdapter implements FlowTagLayout.OnInitSelectedPosition {

    private Context mContext;
    private List<T> mDataList;

    public TagAdapter(Context context) {
        this.mContext = context;
        this.mDataList = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return mDataList.size();
    }

    @Override
    public Object getItem(int position) {
        return mDataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        View view = LayoutInflater.from(mContext).inflate(R.layout.tag_item, null);
//        TextView textView = (TextView) view.findViewById(R.id.tv_tag);
//        T t = mDataList.get(position);
//        if (t instanceof GoodsSku) {
//            textView.setText(((GoodsSku) t).getSkuName());
//        }
        return null;
    }

    public void onlyAddAll(List<T> datas) {
        mDataList.addAll(datas);
        notifyDataSetChanged();
    }

    public void clearAndAddAll(List<T> datas) {
        mDataList.clear();
        onlyAddAll(datas);
    }

    @Override
    public boolean isSelectedPosition(int position) {
        if (position == 0) {
            return true;
        }
        return false;
    }
}














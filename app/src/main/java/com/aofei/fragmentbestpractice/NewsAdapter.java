package com.aofei.fragmentbestpractice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * 新闻的一个适配器
 * Created by kenway on 17/3/23 17:25
 * Email : xiaokai090704@126.com
 */

public class NewsAdapter extends ArrayAdapter<News> {
    private int resourceId;

    public NewsAdapter(Context context, int resource, List<News> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        News news = getItem(position);
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.news_item, null);

        } else {
            view = convertView;
        }

        TextView textView = (TextView) view.findViewById(R.id.news_title);
        textView.setText(news.getTitle());
        return view;
    }

}

package com.example.lab2_ameranataliamah;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class imageAdapter extends BaseAdapter {
    private Context mContext;
    public static Integer[] thumbImages = {
            R.drawable.pic_1, R.drawable.pic_2, R.drawable.pic_3, R.drawable.pic_4, R.drawable.pic_5, R.drawable.pic_6, R.drawable.pic_7, R.drawable.pic_8, R.drawable.pic_9
    };
    public imageAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount(){
        return thumbImages.length;
    }

    @Override
    public Object getItem(int position){
        return thumbImages[position];
    }

    @Override
    public long getItemId(int posiiton){
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(250,250));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8,8,8,8);
        imageView.setImageResource(thumbImages[position]);
        return imageView;

    }
}

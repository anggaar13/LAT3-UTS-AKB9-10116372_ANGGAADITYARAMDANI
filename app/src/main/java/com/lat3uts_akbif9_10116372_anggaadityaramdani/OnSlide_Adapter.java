package com.lat3uts_akbif9_10116372_anggaadityaramdani;

/*3-April-2019
  10115372
  Akb-if9
  Angga Aditya Ramdani*/

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

class OnSlide_Adapter extends PagerAdapter {

    private Context mContext;
    ArrayList<OnSlideItem> onSlideItems=new ArrayList<>();


    public OnSlide_Adapter(Context mContext, ArrayList<OnSlideItem> items) {
        this.mContext = mContext;
        this.onSlideItems = items;
    }

    @Override
    public int getCount() {
        return onSlideItems.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.onslide_item, container, false);

        OnSlideItem item=onSlideItems.get(position);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.iv_onboard);
        imageView.setImageResource(item.getImageID());

        TextView tv_title=(TextView)itemView.findViewById(R.id.tv_header);
        tv_title.setText(item.getTitle());

        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }

}

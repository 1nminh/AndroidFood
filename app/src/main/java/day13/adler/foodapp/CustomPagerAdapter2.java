package day13.adler.foodapp;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CustomPagerAdapter2 extends PagerAdapter {

    private Context mContext;

    public CustomPagerAdapter2(Context context) {
        mContext = context;
    }



    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        ModelObject2 modelObject = ModelObject2.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(modelObject.getLayoutResId(), collection, false);
        collection.addView(layout);

//        int resId = 0;
//        switch (position) {
//            case 1:
//                resId = R.layout.view_5;
//                View view = inflater.inflate(resId, null);
//
//                ((ViewPager) collection).addView(view, 0);
//                return view;
//        }



        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return ModelObject2.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        ModelObject2 customPagerEnum = ModelObject2.values()[position];
        return mContext.getString(customPagerEnum.getTitleResId());
    }

}

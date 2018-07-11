package day13.adler.foodapp;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CustomPagerAdapter5 extends PagerAdapter {

    private Context mContext;

    public CustomPagerAdapter5(Context context) {
        mContext = context;
    }






    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        ModelObject5 modelObject5 = ModelObject5.values()[position];
        final LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(modelObject5.getLayoutResId(), collection, false);
        collection.addView(layout);





        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }




    @Override
    public int getCount() {
        return ModelObject5.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        ModelObject5 customPagerEnum = ModelObject5.values()[position];
        return mContext.getString(customPagerEnum.getTitleResId());
    }



}

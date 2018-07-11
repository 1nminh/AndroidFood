package day13.adler.foodapp;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CustomPagerAdapter6 extends PagerAdapter {

    private Context mContext;

    public CustomPagerAdapter6(Context context) {
        mContext = context;
    }






    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        ModelObject6 modelObject6 = ModelObject6.values()[position];
        final LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(modelObject6.getLayoutResId(), collection, false);
        collection.addView(layout);





        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }




    @Override
    public int getCount() {
        return ModelObject6.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        ModelObject6 customPagerEnum = ModelObject6.values()[position];
        return mContext.getString(customPagerEnum.getTitleResId());
    }



}

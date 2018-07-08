package day13.adler.foodapp;

public enum ModelObject2 {

    RED(R.string.red1, R.layout.view_5),
    BLUE(R.string.blue1, R.layout.activity_food_detail_view_pager);
//    GREEN(R.string.green, R.layout.view_4);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject2(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}

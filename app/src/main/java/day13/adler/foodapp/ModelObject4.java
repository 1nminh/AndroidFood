package day13.adler.foodapp;

public enum ModelObject4 {

    D(R.string.green, R.layout.view_9),
    RED(R.string.red, R.layout.view_10),
    BLUE(R.string.blue, R.layout.view_11);


    private int mTitleResId;
    private int mLayoutResId;

    ModelObject4(int titleResId, int layoutResId) {
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

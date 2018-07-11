package day13.adler.foodapp;

public enum ModelObject5 {

    D(R.string.green, R.layout.view_12),
    RED(R.string.red, R.layout.view_13);



    private int mTitleResId;
    private int mLayoutResId;

    ModelObject5(int titleResId, int layoutResId) {
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

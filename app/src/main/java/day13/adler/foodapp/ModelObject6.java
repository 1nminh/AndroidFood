package day13.adler.foodapp;

public enum ModelObject6 {

    D(R.string.green, R.layout.view_14),
    RED(R.string.red, R.layout.view_15),
    BLUE(R.string.blue, R.layout.view_16),
    GREEN(R.string.green, R.layout.view_17),
    A(R.string.red, R.layout.view_18);



    private int mTitleResId;
    private int mLayoutResId;

    ModelObject6(int titleResId, int layoutResId) {
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

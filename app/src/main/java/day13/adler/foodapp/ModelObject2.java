package day13.adler.foodapp;

public enum ModelObject2 {


    GREEN(R.string.green, R.layout.view_4),
    A(R.string.red, R.layout.view_5),
    B(R.string.blue, R.layout.view_6);


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

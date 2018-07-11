package day13.adler.foodapp;

public enum ModelObject3 {

    D(R.string.green, R.layout.view_7),
    RED(R.string.red, R.layout.view_8);



    private int mTitleResId;
    private int mLayoutResId;

    ModelObject3(int titleResId, int layoutResId) {
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

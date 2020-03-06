package com.example.app4sat7sem;

public enum ResourcesModel {

    // создаем 3 перечисления с тайтлом и макетом
    // для удобной работы в адаптере
    FIRST_SCREEN(R.string.txt_screen_1, R.layout.fragment1),
    SECOND_SCREEN(R.string.txt_screen_2, R.layout.fragment2),
    THIRD_SCREEN(R.string.txt_screen_3, R.layout.fragment3),
    FOURTH_SCREEN(R.string.txt_screen_4, R.layout.fragment4),
    FIFTH_SCREEN(R.string.txt_screen_5, R.layout.fragment5);
    private int mTitleResourceId;
    private int mLayoutResourceId;

    ResourcesModel(int titleResId, int layoutResId) {
        mTitleResourceId = titleResId;
        mLayoutResourceId = layoutResId;
    }

    public int getTitleResourceId() {
        return mTitleResourceId;
    }

    public int getLayoutResourceId() {
        return mLayoutResourceId;
    }
}

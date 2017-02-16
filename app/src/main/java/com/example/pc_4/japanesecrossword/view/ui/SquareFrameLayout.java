package com.example.pc_4.japanesecrossword.view.ui;

import android.content.Context;
import android.widget.FrameLayout;

/**
 * Created by PC-4 on 16.02.2017.
 */

public class SquareFrameLayout extends FrameLayout {
    public SquareFrameLayout(Context context) {
        super(context);
    }



    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //noinspection SuspiciousNameCombination
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }
}
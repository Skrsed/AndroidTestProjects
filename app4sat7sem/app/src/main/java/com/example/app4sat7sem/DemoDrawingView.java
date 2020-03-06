package com.example.app4sat7sem;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class DemoDrawingView extends View {
    public DemoDrawingView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    private final Paint paint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        canvas.drawColor(Color.BLUE);
    }

}

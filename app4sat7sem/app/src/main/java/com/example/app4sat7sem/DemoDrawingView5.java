package com.example.app4sat7sem;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;

import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;

public class DemoDrawingView5 extends View {
    private final Paint paint = new Paint();

    private int[] firePixels;
    private int fireWidth;
    private int fireHeight;

    private Bitmap bitmap;

    private final Random random = new Random();

    private int[] bitmapPixels;


    public DemoDrawingView5(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {

        float aspectRatio = (float) w / h;
        fireWidth = 150;
        fireHeight = (int) (fireWidth / aspectRatio);
        firePixels = new int[fireWidth * fireHeight];

        for (int x = 0; x < fireWidth; x ++) {
            firePixels[x + (fireHeight - 1) * fireWidth] = firePalette.length - 1;
        }
        bitmap = Bitmap.createBitmap(fireWidth, fireHeight, Bitmap.Config.RGB_565);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        spreadFire();
        drawFire(canvas);
        invalidate();
    }

    private void spreadFire() {
        for (int y = 0; y < fireHeight - 1; y++) {
            for (int x = 0; x < fireWidth; x++) {
                int rand_x = random.nextInt(3);
                int rand_y = random.nextInt(6);
                int dst_x = Math.min(fireWidth - 1, Math.max(0, x + rand_x - 1));
                int dst_y = Math.min(fireHeight - 1, y + rand_y);
                int deltaFire = -(rand_x & 1);
                firePixels[x + y * fireWidth] = Math.max(0, firePixels[dst_x + dst_y * fireWidth] + deltaFire);
            }
        }
    }

    private void drawFire(Canvas canvas) {
        final int pixelCount = fireWidth * fireHeight;
        if (bitmapPixels == null || bitmapPixels.length < pixelCount ) {
            bitmapPixels = new int[pixelCount];
        }

        for (int x = 0; x < fireWidth; x++) {
            for (int y = 0; y < fireHeight; y++) {
                int temperature = firePixels[x + y*fireWidth];
                if (temperature < 0) {
                    temperature = 0;
                }
                if (temperature >= firePalette.length) {
                    temperature = firePalette.length - 1;
                }
                @ColorInt int color = firePalette[temperature];
                bitmapPixels[fireWidth * y + x] = color;
            }
        }
        bitmap.setPixels(bitmapPixels, 0, fireWidth, 0, 0, fireWidth, fireHeight);

        float scale = (float) getWidth() / fireWidth;
        canvas.scale(scale, scale);
        canvas.drawBitmap(bitmap, 0, 0, paint);
        canvas.drawBitmap(bitmap, 0, 0, paint);
    }

    //region firePalete values
    private static final int[] firePalette = {
            0xff070707,
            0xff1F0707,
            0xff2F0F07,
            0xff470F07,
            0xff571707,
            0xff671F07,
            0xff771F07,
            0xff8F2707,
            0xff9F2F07,
            0xffAF3F07,
            0xffBF4707,
            0xffC74707,
            0xffDF4F07,
            0xffDF5707,
            0xffDF5707,
            0xffD75F07,
            0xffD75F07,
            0xffD7670F,
            0xffCF6F0F,
            0xffCF770F,
            0xffCF7F0F,
            0xffCF8717,
            0xffC78717,
            0xffC78F17,
            0xffC7971F,
            0xffBF9F1F,
            0xffBF9F1F,
            0xffBFA727,
            0xffBFA727,
            0xffBFAF2F,
            0xffB7AF2F,
            0xffB7B72F,
            0xffB7B737,
            0xffCFCF6F,
            0xffDFDF9F,
            0xffEFEFC7,
            0xffFFFFFF
    };
    //endregion

}

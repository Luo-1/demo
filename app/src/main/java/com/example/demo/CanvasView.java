package com.example.demo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

// 自定义控件
public class CanvasView extends View {

    public CanvasView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    // 画折线图
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 定义画笔
        Paint paint = new Paint();
        paint.setColor(Color.RED);

        int x = 100;
        int y = 400;

        canvas.drawLine(x, y-300, x, y, paint);

        canvas.drawLine(x, y, x + 300, y, paint);

        canvas.drawLine(x, y, x+50, y-100,paint);

        canvas.drawLine(x+50, y-100, x+ 100, y-50, paint);

        canvas.drawLine(x+100, y-50, x+150, y-150,paint);

        canvas.drawLine(x+150, y-150, x+160, y-40, paint);

    }
}

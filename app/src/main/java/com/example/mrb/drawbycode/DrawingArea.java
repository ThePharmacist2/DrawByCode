package com.example.mrb.drawbycode;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by mrb on 16-04-26.
 */
public class DrawingArea extends View // You need to extend the View class
{
    boolean blnShowText;
    int intTextPosition;

    Paint pntTextPaint;     // Painting object to handle the paint jobs for text
    Paint pntBlackPaint;    // Painting object to handle the paint jobs for graphics
    Paint pntWhitePaint;      // Painting object to handle the paint jobs for graphics
    Paint pntBluePaint;
    Paint pntGreyPaint;

    public DrawingArea(Context context, AttributeSet attrs)
    {
        super(context, attrs);

        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.DrawingArea,
                0, 0);

        try {
            blnShowText = a.getBoolean(R.styleable.DrawingArea_displayText, false);
            intTextPosition = a.getInteger(R.styleable.DrawingArea_labelPosition, 0);
        } finally {
            a.recycle();
        }

        init(); // Calling the init() method happens once, when we set up our Paint objects
    }

    private void init()
    {
        // This method is called once when the DrawingArea object is made.
        // It is best practice to handle the set-up of our Paint objects here rather than in onDraw()

        pntTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        pntBlackPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        pntWhitePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        pntBluePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        pntGreyPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

        pntBlackPaint.setColor(Color.BLACK);
        pntBlackPaint.setStrokeWidth(60);

        pntWhitePaint.setColor(Color.WHITE);
        pntWhitePaint.setStrokeWidth(3);

        pntBluePaint.setColor(Color.BLUE);
        pntBluePaint.setStrokeWidth(3);

        pntGreyPaint.setColor(Color.GRAY);
        pntGreyPaint.setStrokeWidth(60);
    }

    protected void onSizeChanged(int w, int h, int oldw, int oldh)
    {
        // This method exists to handle re-drawing of the DrawingArea object in the event of a
        //   resize of our App. For example, tilting the device may require us to redraw our content.
        // More instructions are meant to be added at the bottom if required.

        super.onSizeChanged(w, h, oldw, oldh);

    }

    protected void onDraw(Canvas canvas)
    {
        // This method is where we issue our actual drawing commands.
        // The Canvas parameter is what we draw ON; the Paint objects defined above are what we draw WITH.

        super.onDraw(canvas);
        //head
        canvas.drawRect((float) 175.0, (float) 50.0, (float) 475.0, (float) 350.0, pntGreyPaint);
        //eye components
        canvas.drawCircle((float) 400.0, (float) 150.0, (float) 35.0, pntWhitePaint);

        canvas.drawCircle((float) 400.0, (float) 150.0, (float) 28.0, pntBlackPaint);

        canvas.drawCircle((float) 400.0, (float) 150.0, (float) 25.0, pntBluePaint);

        canvas.drawCircle((float) 400.0, (float) 150.0, (float) 17.0, pntBlackPaint);

        canvas.drawCircle((float) 250.0, (float) 150.0, (float) 35.0, pntWhitePaint);

        canvas.drawCircle((float) 250.0, (float) 150.0, (float) 28.0, pntBlackPaint);

        canvas.drawCircle((float) 250.0, (float) 150.0, (float) 25.0, pntBluePaint);

        canvas.drawCircle((float) 250.0, (float) 150.0, (float) 17.0, pntBlackPaint);
        //mouth components
        canvas.drawRect((float) 225.0, (float) 240.0, (float) 425.0, (float) 300.0, pntBluePaint);

        canvas.drawRect((float) 225.0, (float) 265.0, (float) 425.0, (float) 275.0, pntBlackPaint);

        canvas.drawRect((float) 270.0, (float) 240.0, (float) 280.0, (float) 300.0, pntBlackPaint);

        canvas.drawRect((float) 320.0, (float) 240.0, (float) 330.0, (float) 300.0, pntBlackPaint);

        canvas.drawRect((float) 370.0, (float) 240.0, (float) 380.0, (float) 300.0, pntBlackPaint);

        canvas.drawRect((float) 225.0, (float) 240.0, (float) 230.0, (float) 300.0, pntBlackPaint);

        canvas.drawRect((float) 420.0, (float) 240.0, (float) 425.0, (float) 300.0, pntBlackPaint);

        canvas.drawRect((float) 225.0, (float) 240.0, (float) 425.0, (float) 245.0, pntBlackPaint);

        canvas.drawRect((float) 225.0, (float) 295.0, (float) 425.0, (float) 300.0, pntBlackPaint);

        //right leg
        canvas.drawRect((float) 365.0, (float) 650.0, (float) 455.0, (float) 825.0, pntBlackPaint);

        //left leg
        canvas.drawRect((float) 195.0, (float) 650.0, (float) 285.0, (float) 825.0, pntBlackPaint);
        //arms
        canvas.drawLine((float) 260.0, (float) 375.0, (float) 150.0, (float) 600, pntBlackPaint);

        canvas.drawLine((float) 395.0, (float) 375.0, (float) 505.0, (float) 600, pntBlackPaint);

        //body
        canvas.drawRect((float) 235.0, (float) 350.0, (float) 415.0, (float) 750.0, pntGreyPaint);
    }


}

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

    //Vertical line component of grid creation variables



    boolean blnShowText;
    int intTextPosition;

    Paint pntTextPaint;     // Painting object to handle the paint jobs for text
    Paint pntBlackPaint;    // Painting object to handle the paint jobs for graphics
    Paint pntWhitePaint;      // Painting object to handle the paint jobs for graphics
    Paint pntBluePaint;
    Paint pntGreyPaint;
    Paint pntRedPaint;

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
        pntRedPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

        pntBlackPaint.setColor(Color.BLACK);
        pntBlackPaint.setStrokeWidth(60);

        pntWhitePaint.setColor(Color.WHITE);
        pntWhitePaint.setStrokeWidth(3);

        pntBluePaint.setColor(Color.BLUE);
        pntBluePaint.setStrokeWidth(3);

        pntGreyPaint.setColor(Color.GRAY);
        pntGreyPaint.setStrokeWidth(10);

        pntRedPaint.setColor(Color.RED);
        pntRedPaint.setStrokeWidth(10);
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

       /* super.onDraw(canvas);
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
    */

    //The area below this comment will be the code that draws my code
       /* float xPositionGrid = (float)0.0;
        int i = 0;

        while(i < 10){
            canvas.drawLine( xPositionGrid, (float) 0.0, xPositionGrid, (float) 1045.0, pntGreyPaint);
            i = i + 1;
            xPositionGrid = xPositionGrid + (float)80.0;
        }

        int i2 = 0;
        float yPosition = (float)0.0;

        while(i2 < 17){
            canvas.drawLine((float) 0.0, yPosition,(float) 640.0, yPosition, pntGreyPaint);
                i2 = i2 + 1;
                yPosition = yPosition + (float)80.0;
        }
        */
    float rectTop = (float)0;
    float rectBot = (float)80;
    float rectLeft = (float)0;
    float rectRight = (float)80;
    int i3 = 0;

        while(i3 < 52) {
            canvas.drawRect(rectLeft, rectTop, rectRight, rectBot, pntBlackPaint);
            rectLeft = rectLeft + 160;
            rectRight = rectRight + 160;
            i3 = i3 + 1;

            if(i3 == 4 || i3 == 12 || i3 == 20 || i3 == 28 || i3 == 36 || i3 == 44){
                rectTop = rectTop + 80;
                rectBot = rectBot + 80;
                rectLeft = 80;
                rectRight = 160;
            }

            if (i3 == 8 || i3 == 16 || i3 == 24 || i3 == 32 || i3 == 40 || i3 == 48){
                rectBot = rectBot + 80;
                rectTop = rectTop + 80;
                rectLeft = 0;
                rectRight = 80;
            }
        }

        float rectTop2 = (float)0;
        float rectBot2 = (float)80;
        float rectLeft2 = (float)80;
        float rectRight2 = (float)160;
        int i4 = 0;

        while(i4 < 52) {
            canvas.drawRect(rectLeft2, rectTop2, rectRight2, rectBot2, pntRedPaint);
            rectLeft2 = rectLeft2 + 160;
            rectRight2 = rectRight2 + 160;
            i4 = i4 + 1;

            if(i4 == 8 || i4 == 16 || i4 == 24 || i4 == 32 || i4 == 40 || i4 == 48){
                rectTop2 = rectTop2 + 80;
                rectBot2 = rectBot2 + 80;
                rectLeft2 = 80;
                rectRight2 = 160;
            }

            if (i4 == 4 || i4 == 12 || i4 == 20 || i4 == 28 || i4 == 36 || i4 == 44){
                rectBot2 = rectBot2 + 80;
                rectTop2 = rectTop2 + 80;
                rectLeft2 = 0;
                rectRight2 = 80;
            }
        }


    }


}

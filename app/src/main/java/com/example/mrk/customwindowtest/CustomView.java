package com.example.mrk.customwindowtest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by mariko on 2017/10/20.
 */

public class CustomView extends LinearLayout {
    private static String TAG = "CustomViewTest";

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        View view = LayoutInflater.from(context).inflate(R.layout.custom_view, this);
        TextView textView = (TextView) view.findViewById(R.id.textview);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linearLayout);

//        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.CustomView);
//        int textColor = array.getColor(R.styleable.CustomView_setTextColor, 0);
//        int backgroundColor = array.getColor(R.styleable.CustomView_setBackgroundColor, 0);
//        textView.setTextColor(textColor);
//        linearLayout.setBackgroundColor(backgroundColor);
//        array.recycle();
    }

    @Override
    public void onProvideAutofillStructure(ViewStructure structure, int flags) {
        super.onProvideAutofillStructure(structure, flags);
        Log.d(TAG, "CustomView::onProvideAutofillStructure()");
        Log.d(TAG, "childCount=" + structure.getChildCount() + "autofillId=" + structure.getAutofillId());

        structure.setAutofillType(AUTOFILL_TYPE_TEXT);
        structure.setAutofillValue(AutofillValue.forText("hoge"));
    }
}


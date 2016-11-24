package com.czp.searchmlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * Created by liuyunming on 2016/7/4.
 */
public class selfSearchGridView extends GridView {

    public selfSearchGridView(Context context) {
        super(context);
    }

    public selfSearchGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public selfSearchGridView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int heightSpec;
        if(getLayoutParams().height== ViewGroup.LayoutParams.WRAP_CONTENT)
        {
            heightSpec = MeasureSpec.makeMeasureSpec(
                    Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
            //Integer.MAX_VALUE >> 2 == 2的31次方-1 表示的int的最大值
        }
        else {
            // Any other height should be respected as is.
            heightSpec = heightMeasureSpec;
        }
        super.onMeasure(widthMeasureSpec, heightSpec);
    }
}

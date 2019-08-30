package com.example.demo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;

public class ScrollChangeHeadView extends ListView {

    private View headView;
    private View topBar;


    public ScrollChangeHeadView(Context context, AttributeSet attrs) {
        super(context, attrs);
        headView = LayoutInflater.from(context).inflate(R.layout.scroll_change_head, null);
        addHeaderView(headView);

        setOnScrollListener(new OnScrollListener() {
            //
            @Override
            public void onScrollStateChanged(AbsListView absListView, int i) {

            }

            // 滚动中
            @Override
            public void onScroll(AbsListView absListView, int i, int i1, int i2) {

                if (topBar != null) {
                    int top = headView.getTop();
                    top = Math.abs(top);
                    int height = headView.getHeight();

                    topBar.getBackground().setAlpha(top * (255 / height));

                }
            }
        });
    }

    public ScrollChangeHeadView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    public void setTopBar(View view) {
        topBar = view;
    }

}

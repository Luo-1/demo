package com.example.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout topbar = (LinearLayout) findViewById(R.id.topBar);
        ScrollChangeHeadView headView = (ScrollChangeHeadView) findViewById(R.id.scrollView);
        // 设置头部
        headView.setTopBar(topbar);

        headView.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return 100;
            }

            @Override
            public Object getItem(int i) {
                return null;
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                TextView v = new TextView(MainActivity.this);
                v.setText("+++++"+i);
                return v;
            }
        });

    }
}

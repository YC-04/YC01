package com.example.project03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView mImage;
    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化构件
        initView();
        //初始化数据
        initData();
    }
    private  void  initData(){
        String[] title={"第1张图片","第2张图片","第3张图片","第4张图片"};
        int[] images={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d};

        mImage.setImageResource(images[0]);
        mText.setText(title[0]);
    }
    private void initView(){
        mImage=findViewById(R.id.iv_show);
        mText = findViewById(R.id.tv_show);
        findViewById(R.id.btn_previous).setOnClickListener(this);
        findViewById(R.id.btn_next).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}
package com.seek.zjlproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private MyRatingBar myRatingBar;
    private MyRatingBarLarge myRatingBarLarge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * 多分辨率兼容，两个关键点 1.图片必须放在 drawable里面 2. float scale
         * =context.getResources().getDisplayMetrics().density;
         * linearParams.height = (int) (24 * scale + 0.5f);
         *
         * 把这里的24，替换成图片的高度
         */

        /**
         * 使用步骤： 1.MyRatingBar.java 和 MyRatingBarLarge.java放入项目中
         * 2.icon_ratingbar_large_normal.png等4个图标，放入drawable目录中
         * 3.my_rating_bar.xml 和 my_rating_bar_large.xml 两个背景文件，放入drawable目录中
         * 4.view_myratingbar.xml 和 view_myratingbar_large.xml
         * 两个自定义控件的layout，放入layout文件夹中
         */
        initView();

        myRatingBar.setRating(5);
        myRatingBar.setIsIndicator(false);// 设置星星是否能触摸改变

        myRatingBarLarge.setRating(0);
        myRatingBarLarge.setIsIndicator(false);

    }

    private void initView() {
        myRatingBar = (MyRatingBar) findViewById(R.id.my_ratingbar);
        myRatingBarLarge = (MyRatingBarLarge) findViewById(R.id.my_ratingbar_large);

    }
}

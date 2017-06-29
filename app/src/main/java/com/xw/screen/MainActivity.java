package com.xw.screen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


/**
 *  1、在layout中分别创建单面板和多面板布局，例如：
 *   activity_main   单面板布局
 *   activity_main_twoscreen   多面板布局
 *
 *  2、在res下建立res/values/layout.xml、
 *              res/values-large/layout.xml、
 *              res/values-sw600dp/layout.xml三个文件。
 *
 *  3、在res/values/layout.xml默认布局中加入：
 *              <item name="main" type="layout">@layout/activity_main</item>
 *     在res/values-large/layout.xml(3.2之前的平板布局)、
 *     res/values-sw600dp/layout.xml(3.2之后的平板布局)中加入
 *              <item name="main" type="layout">@layout/activity_main_twoscreen</item>
 *
 *  4、在activity中setContentView(R.layout.main);   main-->name="main"中的main
 *
 *  5、在平板上横竖屏是要显示不同的布局：
 *     res/values-sw600dp-land/layouts.xml:横屏
 *     res/values-sw600dp-port/layouts.xml:竖屏
 *
 *
 */



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //判断是横屏和竖屏，以显示不同布局
        if (getResources().getBoolean(R.bool.has_two_panes)){
            
        }
    }
}

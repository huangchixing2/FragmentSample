package com.example.admin.fragmentsample;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /*
    动态添加Fragment主要分为4步：
    1、获取到FragmentManager对象，在V4包中通过getSupportFragmentManager方法获取，在系统中原生的Fragment是通过getFragmentManager获得的。
    2、开启一个事务，通过调用beginTransaction方法开启。
    3 、向容器内加入Fragment，一般使用add或者replace方法实现，需要传入容器的id和Fragment的实例。
    4、提交事务，调用commit方法提交。
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //动态加载fragment的四个步骤
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FirstFragment firstFragment = new FirstFragment();
        fragmentTransaction.add(R.id.fragment_container, firstFragment);
        fragmentTransaction.commit();
    }
}

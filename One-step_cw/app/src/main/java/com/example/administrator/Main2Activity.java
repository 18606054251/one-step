package com.example.administrator;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private home fragment1;
    private find fragment2;
    private person fragment3;
    private FragmentTransaction transaction;
    private FragmentManager fragmentManager;
    private String[] data={"我的心愿单","我的分享","我的收藏","设置"};
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        fragmentManager = getSupportFragmentManager();
            transaction = fragmentManager.beginTransaction();
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    hideFragment(transaction);
                    fragment1 = new home();
                    transaction.replace(R.id.content, fragment1);
                    transaction.commit();
                    return true;
               case R.id.navigation_find:
                    hideFragment(transaction);
                    fragment2 = new find();
                    transaction.replace(R.id.content, fragment2);
                    transaction.commit();
                    return true;
                case R.id.navigation_person:
                    hideFragment(transaction);
                    fragment3 = new person();
                    transaction.replace(R.id.content, fragment3);
                    transaction.commit();

                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        fragment1 = new home();
        fragment2 = new find();
        fragment3 = new person();
        fragmentManager = getSupportFragmentManager();
        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.content, fragment1);
        transaction.commit();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private void hideFragment(FragmentTransaction transaction) {
        if (fragment1 != null) {
            //transaction.hide(f1);隐藏方法也可以实现同样的效果，不过我一般使用去除
            transaction.remove(fragment1);
        }
        if (fragment2 != null) {
            //transaction.hide(f2);
            transaction.remove(fragment2);
        }
        if (fragment3 != null) {
            //transaction.hide(f3);
            transaction.remove(fragment3);
        }


    }

}

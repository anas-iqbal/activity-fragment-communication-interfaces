package com.example.anasiqbal.fragmentscommunication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    Button activitybutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         activitybutton=findViewById(R.id.activitybutton);

        ButterKnife.bind(this);
        final FragmentOne frag1=new FragmentOne();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fl1,frag1);
        fragmentTransaction.commit();

        activitybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag1.doSomething();
            }
        });

    }
    interface EventListener
    {
         void doSomething();
    }
}

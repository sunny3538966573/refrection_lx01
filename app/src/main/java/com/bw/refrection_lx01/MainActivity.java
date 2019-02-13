package com.bw.refrection_lx01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.bw.butterknife_lx.BindView;
import com.bw.butterknife_lx.Butterknife;
import com.bw.butterknife_lx.ContentView;
import com.bw.refrection_lx01.R;

@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textview)
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        Butterknife.bind(this);
        textView.setText("上善若水");
    }
}

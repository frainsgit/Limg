package com.example.frains.limg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity{
    private Button btn_load,btn_print;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_load = (Button) findViewById(R.id.btn_load);
        btn_print = (Button) findViewById(R.id.btn_print);
        btn_load.setOnClickListener(mylistener);
        btn_print.setOnClickListener(mylistener);
    }

    View.OnClickListener mylistener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_load:
                    Log.d(TAG, "Load new image!!!\n");
                    break;
                case R.id.btn_print:
                    Log.d(TAG, "Print image!!!\n");
                    break;
                default:
                    break;
            }
        }
    };

}

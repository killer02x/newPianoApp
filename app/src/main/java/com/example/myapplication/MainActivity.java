package com.example.myapplication;

import android.media.MediaPlayer;
import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity {
   private Button ring;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button one = (Button)this.findViewById(R.id.button11);
        Button do2 = (Button)this.findViewById(R.id.button12);
        Button re = (Button)this.findViewById(R.id.button13);
        Button mi = (Button)this.findViewById(R.id.button14);
        Button fa = (Button)this.findViewById(R.id.button15);
        Button sol = (Button)this.findViewById(R.id.button16);
        Button la = (Button)this.findViewById(R.id.button17);
        Button si = (Button)this.findViewById(R.id.button18);

        one.setText("First");
        do2.setText("Second");
        re.setText("Third");
        mi.setText("Fourth");
        fa.setText("Fifth");
        sol.setText("Sixth");
        la.setText("Seventh");
        si.setText("Eighths");
        List<MediaPlayer> mp = new ArrayList<>();
        mp.add(MediaPlayer.create(this, R.raw.first));
        mp.add(MediaPlayer.create(this, R.raw.do2));
        mp.add(MediaPlayer.create(this, R.raw.re));
        mp.add(MediaPlayer.create(this, R.raw.mi));
        mp.add(MediaPlayer.create(this, R.raw.fa));
        mp.add(MediaPlayer.create(this, R.raw.sol));
        mp.add(MediaPlayer.create(this, R.raw.la));
        mp.add(MediaPlayer.create(this, R.raw.si));
        one.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp.get(0).start();
            }
        });
        do2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp.get(1).start();
            }
        });
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.CUPCAKE) {
            one.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                    if ((event != null && (event.getKeyCode() == KeyEvent.KEYCODE_ENTER)) || (actionId == EditorInfo.IME_ACTION_DONE)) {
                        Log.i(TAG,"Enter pressed");
                    }
                    return false;
                }
            });
        }

        re.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp.get(2).start();
            }
        });
        mi.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp.get(3).start();
            }
        });
        fa.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp.get(4).start();
            }
        });
        sol.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp.get(5).start();
            }
        });
        la.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp.get(6).start();
            }
        });
        si.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp.get(7).start();
            }
        });
    }
}

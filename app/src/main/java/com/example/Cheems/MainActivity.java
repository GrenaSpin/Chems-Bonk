package com.example.Cheems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button miboton = (Button) findViewById(R.id.button);
        //final TextView mitexto = (TextView) findViewById(R.id.textView);

        ImageView imageview = (ImageView) findViewById(R.id.cheems);
        final boolean[] visible= {true};
        imageview.setVisibility(View.INVISIBLE);

        miboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //mitexto.setText("lo que sea que yo quiera");
                if(visible[0]){
                    imageview.setVisibility(View.INVISIBLE);
                    visible[0]=false;

                }else{
                    imageview.setVisibility(View.VISIBLE);
                    visible[0]=true;
                }
            }
        });
    }
}
package com.keeyoshi.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class ScrollPictureActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton radioOcean, radioCity, radioMountain;
    ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_picture);
        radioOcean=findViewById(R.id.Ocean);
        radioCity=findViewById(R.id.City);
        radioMountain=findViewById(R.id.Mountain);
        ivImage=findViewById(R.id.tvImage);
        radioOcean.setOnClickListener(this);
        radioCity.setOnClickListener(this);
        radioMountain.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.Ocean:
                ivImage.setImageResource(R.drawable.ocean);
                break;
            case R.id.Mountain:
                ivImage.setImageResource(R.drawable.mountain);
                break;
            case R.id.City:
                ivImage.setImageResource(R.drawable.city);
                break;

        }
    }
}

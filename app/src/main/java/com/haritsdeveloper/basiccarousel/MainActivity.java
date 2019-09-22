package com.haritsdeveloper.basiccarousel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {



    private int[] mImages = new int[]{
            R.drawable.beruang,R.drawable.buayaaa, R.drawable.panda,R.drawable.sulaiman, R.drawable.lionking
    };
    private String[]mImagesTitle = new String[]{
            "Slogan", "Slogan", "Slogan","Slogan","Slogan"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarouselView caroulselView = findViewById(R.id.carouselid);
        caroulselView.setPageCount(mImages.length);
        caroulselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                    imageView.setImageResource(mImages[position]);
            }
        });
         caroulselView.setImageClickListener(new ImageClickListener() {
             @Override
             public void onClick(int position) {
                 Toast.makeText(MainActivity.this,mImagesTitle[position],Toast.LENGTH_SHORT).show();
             }
         });

    }
}

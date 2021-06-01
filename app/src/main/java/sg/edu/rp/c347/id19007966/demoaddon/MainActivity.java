package sg.edu.rp.c347.id19007966.demoaddon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.jsibbold.zoomage.ZoomageView;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ZoomageView zoomageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        zoomageView = findViewById(R.id.myZoomageView);

        String imageUrl = "https://i.imgur.com/tGbaZCY.jpg";
        Picasso.with(this)
                .load(imageUrl)
                .into(imageView);
        Picasso.with(this)
                .load(imageUrl)
                .into(zoomageView);
    }
}
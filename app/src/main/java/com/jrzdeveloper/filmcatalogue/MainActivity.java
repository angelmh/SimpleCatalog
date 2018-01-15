package com.jrzdeveloper.filmcatalogue;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView movieImageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieImageview = (ImageView) findViewById(R.id.movie_img);

        Button buttonGravity = (Button) findViewById(R.id.gravity_button);
        Button buttonJumanji = (Button) findViewById(R.id.jumanji_button);
        Button buttonTheLionKing = (Button) findViewById(R.id.the_lion_king_button);
        Button buttonStarsWars = (Button) findViewById(R.id.stars_wars_button);
        Button buttonOrigen = (Button) findViewById(R.id.origen_button);
        Button buttonToysStory = (Button) findViewById(R.id.toys_story_button);

        buttonGravity.setOnClickListener(this);
        buttonJumanji.setOnClickListener(this);
        buttonTheLionKing.setOnClickListener(this);
        buttonStarsWars.setOnClickListener(this);
        buttonOrigen.setOnClickListener(this);
        buttonToysStory.setOnClickListener(this);
    }

    @Override
    public void onClick(View buttonView) {
        int buttonId = buttonView.getId();

        int imageId;
        switch (buttonId)
        {
            case R.id.gravity_button:
                imageId = R.drawable.gravity;
                break;
            case R.id.jumanji_button:
                imageId = R.drawable.jumanji;
                break;
            case R.id.the_lion_king_button:
                imageId = R.drawable.rey_leon;
                break;
            case R.id.stars_wars_button:
                imageId = R.drawable.stars_wars;
                break;
            case R.id.origen_button:
                imageId = R.drawable.origen;
                break;
            case R.id.toys_story_button:
                imageId = R.drawable.toy_story;
                break;
            default:
                imageId = 0;
                break;
        }

        if (imageId !=0 )
        movieImageview.setImageDrawable(ContextCompat.getDrawable(this,imageId));

    }
}

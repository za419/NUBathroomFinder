package com.ieee.nubathroomfinder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    // Bind the maps
    @Bind(R.id.first_floor_image) ImageView firstFloorImage;
    @Bind(R.id.ground_floor_image) ImageView groundFloorImage;
    @Bind(R.id.second_floor_image) ImageView secondFloorImage;
    @Bind(R.id.third_floor_image) ImageView thirdFloorImage;
    @Bind(R.id.fourth_floor_image) ImageView fourthFloorImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    // Sets all the maps to visibility GONE
    public void clearMapsFromScreen() {
        firstFloorImage.setVisibility(View.GONE);
        groundFloorImage.setVisibility(View.GONE);
 //       secondFloorImage.setVisibility(View.GONE);
 //       thirdFloorImage.setVisibility(View.GONE);
 //       fourthFloorImage.setVisibility(View.GONE);
    }

    // Clear maps from the screen and show the map passed in as argument
    public void showMap(ImageView map) {
        clearMapsFromScreen();
        map.setVisibility(View.VISIBLE);
    }

    // On click listeners

    @OnClick(R.id.first_floor_button)
    public void showFirstFloorMap() {
        showMap(firstFloorImage);
    }

    @OnClick(R.id.ground_floor_button)
    public void showGroundFloorMap() {
        showMap(groundFloorImage);
    }

    @OnClick(R.id.second_floor_button)
    public void showSecondFloorMap() {
 //       showMap(secondFloorImage);
    }

    @OnClick(R.id.third_floor_button)
    public void showThirdFloorMap() {
 //       showMap(thirdFloorImage);
    }

    @OnClick(R.id.fourth_floor_button)
    public void showFourthFloorMap() {
 //       showMap(fourthFloorImage);
    }
}

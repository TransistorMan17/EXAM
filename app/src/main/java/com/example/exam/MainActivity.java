package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mScore1;
    private int mScore2;
    ImageView batteryLife;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        batteryLife=findViewById(R.id.Battery);
        batteryLife.setImageResource(R.drawable.ic_batt20);
    }


    /**
     * Method that handles the onClick of both the decrement buttons
     * @param view The button view that was clicked
     */
    public void decreaseScore(View view) {
        // Get the ID of the button that was clicked
        int viewID = view.getId();
        switch (viewID){
            //If it was on Team 1
            
            case R.id.decreaseBatt:
                //Decrement the score and update the TextView
                mScore1--;
                if(mScore1==-1){
                    mScore1=0;
                }
                updateBatt();
                break;
        }
    }

    private void updateBatt() {
        switch(mScore1){
            case 0:
                batteryLife.setImageResource(R.drawable.ic_batt20);
                break;
            case 1:
                batteryLife.setImageResource(R.drawable.ic_batt30);
                break;
            case 2:
                batteryLife.setImageResource(R.drawable.ic_batt50);
                break;
            case 3:
                batteryLife.setImageResource(R.drawable.ic_batt60);
                break;
            case 4:
                batteryLife.setImageResource(R.drawable.ic_batt80);
                break;
            case 5:
                batteryLife.setImageResource(R.drawable.ic_battery_90_black_24dp);
                break;
            case 6:
                batteryLife.setImageResource(R.drawable.ic_battery_full_black_24dp);
                break;



        }

    }

    /**
     * Method that handles the onClick of both the increment buttons
     * @param view The button view that was clicked
     */
    public void increaseScore(View view) {
        //Get the ID of the button that was clicked
        int viewID = view.getId();
        switch (viewID){
            //If it was on Team 1
            case R.id.increaseBatt:
                //Increment the score and update the TextView
                mScore1++;
                if(mScore1==7){
                    mScore1=6;
                }
                updateBatt();
                break;
        }
    }
}

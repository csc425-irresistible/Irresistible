package com.example.resistorapp;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


public class MainActivity extends AppCompatActivity {

    Integer bandOne = -1;
    Integer bandTwo = -1;
    Integer bandThree = -1;
    Integer bandFour = -1;
    //Clinton - Main text view for communicating messages and results to users
    TextView status;

    ImageView resistor;

    Button calculateButton;
    Button buyButton;

    Button blackButton;
    Button brownButton;
    Button redButton;
    Button orangeButton;
    Button yellowButton;
    Button greenButton;
    Button blueButton;
    Button purpleButton;
    Button grayButton;
    Button whiteButton;
    Button goldButton;
    Button silverButton;
    Button blankButton;
    //Clinton - These buttons get their background colors updated as users indicate band color
    //and allow a user to click in order to clear a previously indicated color
    Button firstBandDisplay;
    Button secondBandDisplay;
    Button thirdBandDisplay;
    Button fourthBandDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        status = findViewById(R.id.statusTextView);
        calculateButton = findViewById(R.id.calculatebutton);
        buyButton = findViewById(R.id.buybutton);

        //Band Color Selection Buttons
        blackButton = findViewById(R.id.blackbutton);
        brownButton = findViewById(R.id.brownbutton);
        redButton = findViewById(R.id.redbutton);
        orangeButton = findViewById(R.id.orangebutton);
        yellowButton = findViewById(R.id.yellowbutton);
        greenButton = findViewById(R.id.greenbutton);
        blueButton = findViewById(R.id.bluebutton);
        purpleButton = findViewById(R.id.purplebutton);
        grayButton = findViewById(R.id.graybutton);
        whiteButton = findViewById(R.id.whitebutton);
        goldButton = findViewById(R.id.goldbutton);
        silverButton = findViewById(R.id.silverbutton);
        blankButton = findViewById(R.id.blankbutton);

        //Selected Color Displays
        firstBandDisplay = findViewById(R.id.bandonebutton);
        secondBandDisplay = findViewById(R.id.bandtwobutton);
        thirdBandDisplay = findViewById(R.id.bandthreebutton);
        fourthBandDisplay = findViewById(R.id.bandfourbutton);

        //Clinton - Fade in effect for resistor element
        resistor = (ImageView) findViewById(R.id.imageView);
        Animation myAnimation = AnimationUtils.loadAnimation(this,R.anim.resistoranimation);
        resistor.startAnimation(myAnimation);
    }
    //Clinton - all colored buttonOnClicks set corresponding band ints as appropriate
    //and update display with indicated color
    public void blackButtonOnClick(View view){
        if (bandOne == -1) {
            firstBandDisplay.setBackgroundColor(Color.parseColor("#000000"));
            bandOne = 0;
        }
        else if(bandTwo == -1){
            secondBandDisplay.setBackgroundColor(Color.parseColor("#000000"));
            bandTwo = 0;
        }
        else if(bandThree == -1){
            thirdBandDisplay.setBackgroundColor(Color.parseColor("#000000"));
            bandThree = 0;
        }
        else if(bandFour == -1){
            fourthBandDisplay.setBackgroundColor(Color.parseColor("#000000"));
            bandFour = 0;
        }
        statusUpdate();
    }

    public void brownButtonOnClick(View view){
        if (bandOne == -1) {
            firstBandDisplay.setBackgroundColor(Color.parseColor("#8B4513"));
            bandOne = 1;
        }
        else if(bandTwo == -1){
            secondBandDisplay.setBackgroundColor(Color.parseColor("#8B4513"));
            bandTwo = 1;
        }
        else if(bandThree == -1){
            thirdBandDisplay.setBackgroundColor(Color.parseColor("#8B4513"));
            bandThree = 1;
        }
        else if(bandFour == -1){
            fourthBandDisplay.setBackgroundColor(Color.parseColor("#8B4513"));
            bandFour = 1;
        }
        statusUpdate();
    }

    public void redButtonOnClick(View view){
        if (bandOne == -1) {
            firstBandDisplay.setBackgroundColor(Color.parseColor("#FF0000"));
            bandOne = 2;
        }
        else if(bandTwo == -1){
            secondBandDisplay.setBackgroundColor(Color.parseColor("#FF0000"));
            bandTwo = 2;
        }
        else if(bandThree == -1){
            thirdBandDisplay.setBackgroundColor(Color.parseColor("#FF0000"));
            bandThree = 2;
        }
        else if(bandFour == -1){
            fourthBandDisplay.setBackgroundColor(Color.parseColor("#FF0000"));
            bandFour = 2;
        }
        statusUpdate();
    }

    public void orangeButtonOnClick(View view){
        if (bandOne == -1) {
            firstBandDisplay.setBackgroundColor(Color.parseColor("#FF6F22"));
            bandOne = 3;
        }
        else if(bandTwo == -1){
            secondBandDisplay.setBackgroundColor(Color.parseColor("#FF6F22"));
            bandTwo = 3;
        }
        else if(bandThree == -1){
            thirdBandDisplay.setBackgroundColor(Color.parseColor("#FF6F22"));
            bandThree = 3;
        }
        else if(bandFour == -1){
            fourthBandDisplay.setBackgroundColor(Color.parseColor("#FF6F22"));
            bandFour = 3;
        }
        statusUpdate();
    }

    public void yellowButtonOnClick(View view){
        if (bandOne == -1) {
            firstBandDisplay.setBackgroundColor(Color.parseColor("#FFFF00"));
            bandOne = 4;
        }
        else if(bandTwo == -1){
            secondBandDisplay.setBackgroundColor(Color.parseColor("#FFFF00"));
            bandTwo = 4;
        }
        else if(bandThree == -1){
            thirdBandDisplay.setBackgroundColor(Color.parseColor("#FFFF00"));
            bandThree = 4;
        }
        else if(bandFour == -1){
            fourthBandDisplay.setBackgroundColor(Color.parseColor("#FFFF00"));
            bandFour = 4;
        }
        statusUpdate();
    }

    public void greenButtonOnClick(View view){
        if (bandOne == -1) {
            firstBandDisplay.setBackgroundColor(Color.parseColor("#008000"));
            bandOne = 5;
        }
        else if(bandTwo == -1){
            secondBandDisplay.setBackgroundColor(Color.parseColor("#008000"));
            bandTwo = 5;
        }
        else if(bandThree == -1){
            thirdBandDisplay.setBackgroundColor(Color.parseColor("#008000"));
            bandThree = 5;
        }
        else if(bandFour == -1){
            fourthBandDisplay.setBackgroundColor(Color.parseColor("#008000"));
            bandFour = 5;
        }
        statusUpdate();
    }

    public void blueButtonOnClick(View view){
        if (bandOne == -1) {
            firstBandDisplay.setBackgroundColor(Color.parseColor("#0000FF"));
            bandOne = 6;
        }
        else if(bandTwo == -1){
            secondBandDisplay.setBackgroundColor(Color.parseColor("#0000FF"));
            bandTwo = 6;
        }
        else if(bandThree == -1){
            thirdBandDisplay.setBackgroundColor(Color.parseColor("#0000FF"));
            bandThree = 6;
        }
        else if(bandFour == -1){
            fourthBandDisplay.setBackgroundColor(Color.parseColor("#0000FF"));
            bandFour = 6;
        }
        statusUpdate();
    }

    public void purpleButtonOnClick(View view){
        if (bandOne == -1) {
            firstBandDisplay.setBackgroundColor(Color.parseColor("#6738B4"));
            bandOne = 7;
        }
        else if(bandTwo == -1){
            secondBandDisplay.setBackgroundColor(Color.parseColor("#6738B4"));
            bandTwo = 7;
        }
        else if(bandThree == -1){
            thirdBandDisplay.setBackgroundColor(Color.parseColor("#6738B4"));
            bandThree = 7;
        }
        else if(bandFour == -1){
            fourthBandDisplay.setBackgroundColor(Color.parseColor("#6738B4"));
            bandFour = 7;
        }
        statusUpdate();
    }

    public void grayButtonOnClick(View view){
        if (bandOne == -1) {
            firstBandDisplay.setBackgroundColor(Color.parseColor("#808080"));
            bandOne = 8;
        }
        else if(bandTwo == -1){
            secondBandDisplay.setBackgroundColor(Color.parseColor("#808080"));
            bandTwo = 8;
        }
        else if(bandThree == -1){
            thirdBandDisplay.setBackgroundColor(Color.parseColor("#808080"));
            bandThree = 8;
        }
        else if(bandFour == -1){
            fourthBandDisplay.setBackgroundColor(Color.parseColor("#808080"));
            bandFour = 8;
        }
        statusUpdate();
    }

    public void whiteButtonOnClick(View view){
        if (bandOne == -1) {
            firstBandDisplay.setBackgroundColor(Color.parseColor("#FFFFFF"));
            bandOne = 9;
        }
        else if(bandTwo == -1){
            secondBandDisplay.setBackgroundColor(Color.parseColor("#FFFFFF"));
            bandTwo = 9;
        }
        else if(bandThree == -1){
            thirdBandDisplay.setBackgroundColor(Color.parseColor("#FFFFFF"));
            bandThree = 9;
        }
        else if(bandFour == -1){
            fourthBandDisplay.setBackgroundColor(Color.parseColor("#FFFFFF"));
            bandFour = 9;
        }
        statusUpdate();
    }

    public void goldButtonOnClick(View view){
        if (bandOne == -1) {
            firstBandDisplay.setBackgroundColor(Color.parseColor("#FF9800"));
            bandOne = 10;
        }
        else if(bandTwo == -1){
            secondBandDisplay.setBackgroundColor(Color.parseColor("#FF9800"));
            bandTwo = 10;
        }
        else if(bandThree == -1){
            thirdBandDisplay.setBackgroundColor(Color.parseColor("#FF9800"));
            bandThree = 10;
        }
        else if(bandFour == -1){
            fourthBandDisplay.setBackgroundColor(Color.parseColor("#FF9800"));
            bandFour = 10;
        }
        statusUpdate();
    }

    public void silverButtonOnClick(View view){
        if (bandOne == -1) {
            firstBandDisplay.setBackgroundColor(Color.parseColor("#D2C0C0C0"));
            bandOne = 11;
        }
        else if(bandTwo == -1){
            secondBandDisplay.setBackgroundColor(Color.parseColor("#D2C0C0C0"));
            bandTwo = 11;
        }
        else if(bandThree == -1){
            thirdBandDisplay.setBackgroundColor(Color.parseColor("#D2C0C0C0"));
            bandThree = 11;
        }
        else if(bandFour == -1){
            fourthBandDisplay.setBackgroundColor(Color.parseColor("#D2C0C0C0"));
            bandFour = 11;
        }
        statusUpdate();
    }

    public void blankButtonOnClick(View view){
        if (bandOne == -1) {
            firstBandDisplay.setBackgroundColor(Color.parseColor("#FFFFFF"));
            bandOne = 12;
        }
        else if(bandTwo == -1){
            secondBandDisplay.setBackgroundColor(Color.parseColor("#FFFFFF"));
            bandTwo = 12;
        }
        else if(bandThree == -1){
            thirdBandDisplay.setBackgroundColor(Color.parseColor("#FFFFFF"));
            bandThree = 12;
        }
        else if(bandFour == -1){
            fourthBandDisplay.setBackgroundColor(Color.parseColor("#FFFFFF"));
            bandFour = 12;
        }
        statusUpdate();
    }
    //Clinton - Resets band ints and clears display prompting user to choose a new color
    public void firstBandOnClick(View view){
        firstBandDisplay.setBackgroundColor(Color.parseColor("#41FFFFFF"));
        bandOne = -1;
        statusUpdate();
    }

    public void secondBandOnClick(View view){
        secondBandDisplay.setBackgroundColor(Color.parseColor("#41FFFFFF"));
        bandTwo = -1;
        statusUpdate();
    }
    public void thirdBandOnClick(View view){
        thirdBandDisplay.setBackgroundColor(Color.parseColor("#41FFFFFF"));
        bandThree = -1;
        statusUpdate();
    }
    public void fourthBandOnClick(View view){
        fourthBandDisplay.setBackgroundColor(Color.parseColor("#41FFFFFF"));
        bandFour = -1;
        statusUpdate();
    }
    //Clinton - Updates status TextView as appropriate
    public void statusUpdate(){
        if (bandOne == -1) {
            status.setText("Please select first band color.");
        }
        else if(bandTwo == -1){
            status.setText("Please select second band color.");
        }
        else if(bandThree == -1){
            status.setText("Please select third band color.");
        }
        else if(bandFour == -1){
            status.setText("Please select fourth band color.");
        }
        else{
            status.setText("Please press calculate if ready.");
            calculateButton.setVisibility(View.VISIBLE);
        }
    }
    //Clinton - Passes band values to logic function and updates status TextView with returned strings
    public void calculateButtonOnClick(View view){
        String statusString = resistance(bandOne,bandTwo,bandThree,bandFour);
        status.setText(statusString);

        //Victor - added buybutton visibility to calculate onclick
        buyButton.setVisibility(View.VISIBLE);
    }
    //Andrew - Decoding Logic
    public static String resistance(int bandOne, int bandTwo, int bandThree, int bandFour){
        if (bandOne == 10 ||
                bandOne == 11 ||
                bandOne == 12 ||
                bandTwo == 10 ||
                bandTwo == 11 ||
                bandTwo == 12){
            return "Error: Invalid Input";
        }
        double mult = 1;
        switch (bandThree){
            case 0:
                mult = 1;
                break;
            case 1:
                mult = 10;
                break;
            case 2:
                mult = 100;
                break;
            case 3:
                mult = 1000;
                break;
            case 4:
                mult = 10000;
                break;
            case 5:
                mult = 100000;
                break;
            case 6:
                mult = 1000000;
                break;
            case 7:
                mult = 10000000;
                break;
            case 8:
                mult = 100000000;
                break;
            case 9:
                mult = 1000000000;
                break;
            case 10:
                mult = 0.1;
                break;
            case 11:
                mult = 0.01;
                break;
            case 12:
                return "Error: Invalid Input";
        }
        double resistance = ((10 * bandOne) + bandTwo) * mult;
        String tolerance = "";
        switch (bandFour) {
            case 0:
                tolerance = "";
                break;
            case 1:
                tolerance = "±1%";
                break;
            case 2:
                tolerance = "±2%";
                break;
            case 3:
                tolerance = "±3%";
                break;
            case 4:
                tolerance = "±4%";
                break;
            case 5:
                tolerance = "±0.5%";
                break;
            case 6:
                tolerance = "±0.25%";
                break;
            case 7:
                tolerance = "±0.10%";
                break;
            case 8:
                tolerance = "±0.05%";
                break;
            case 9:
                tolerance = "";
                break;
            case 10:
                tolerance = "±5%";
                break;
            case 11:
                tolerance = "±10%";
                break;
            case 12:
                tolerance = "±20%";
                break;
        }
        String output = Double.toString(resistance) + " ohms Tolerance: " + tolerance;
        return output;
    }

    //Victor - Method that takes in a url to view
    public void openWebURL( String inURL ) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse( inURL ) );

        startActivity( browse );
    }

    //Victor - Buy button that makes use of the above method to search amazon for the product
    public void buyButtonOnClick(View view){
        String statusString = resistance(bandOne,bandTwo,bandThree,bandFour);
        openWebURL("https://www.amazon.com/s?k=" + statusString + " resistor" + "&ref=nb_sb_noss_2");
    }
}


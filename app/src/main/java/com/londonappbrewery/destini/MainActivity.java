package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    int mCurrentStoryNumber = 1;

    Button topButton;
    Button botButton;
    TextView storyText;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
            topButton = (Button)findViewById(R.id.buttonTop);
            botButton = (Button)findViewById(R.id.buttonBottom);
            storyText = (TextView)findViewById(R.id.storyTextView);

            topButton.setOnClickListener(topBtnListener);
            botButton.setOnClickListener(botBtnListener);
        }
        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        View.OnClickListener topBtnListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(mCurrentStoryNumber) {
                    case 1:
                    case 2:
                        topButton.setText(R.string.T3_Ans1);
                        botButton.setText(R.string.T3_Ans2);
                        storyText.setText(R.string.T3_Story);
                        mCurrentStoryNumber = 3;
                        break;
                    case 3:
                        topButton.setText("End");
                        botButton.setText("Restart");
                        storyText.setText(R.string.T6_End);
                        mCurrentStoryNumber = 111;
                        break;
                    case 111:
                        finish();
                        break;
                }
            }
        };

    // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        View.OnClickListener botBtnListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(mCurrentStoryNumber) {
                    case 1:
                        topButton.setText(R.string.T2_Ans1);
                        botButton.setText(R.string.T2_Ans2);
                        storyText.setText(R.string.T2_Story);
                        mCurrentStoryNumber = 2;
                        break;
                    case 2:
                        topButton.setText("End");
                        botButton.setText("Restart");
                        storyText.setText(R.string.T4_End);
                        mCurrentStoryNumber = 111;
                        break;
                    case 3:
                        topButton.setText("End");
                        botButton.setText("Restart");
                        storyText.setText(R.string.T5_End);
                        mCurrentStoryNumber = 111;
                        break;
                    case 111:
                        topButton.setText(R.string.T1_Ans1);
                        botButton.setText(R.string.T1_Ans2);
                        storyText.setText(R.string.T1_Story);
                        mCurrentStoryNumber = 1;
                        break;
                }
            }
        };












}

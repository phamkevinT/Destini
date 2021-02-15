package com.londonappbrewery.destini;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declare member variables here:
    private TextView mStoryView;
    private Button mTopButton;
    private Button mBottomButton;

    // Keep track of user's progression
    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Wire up the 3 views from the layout to the member variables:
        mStoryView = (TextView) findViewById(R.id.storyTextView);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);


        // Set a listener for the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1 || mStoryIndex == 2) {
                    mStoryView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else if (mStoryIndex == 3) {
                    mStoryView.setText(R.string.T6_End);
                    mTopButton.setText(R.string.Close_App);
                    mBottomButton.setVisibility(View.GONE);
                    mStoryIndex = 0;
                } else if (mStoryIndex == 0) {
                    // Exit out the application
                    finish();
                }
            }
        });


        // Set a listener for the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    mStoryView.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mBottomButton.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2) {
                    mStoryView.setText(R.string.T4_End);
                    mTopButton.setText(R.string.Close_App);
                    mBottomButton.setVisibility(View.GONE);
                    mStoryIndex = 4;
                } else if (mStoryIndex == 3) {
                    mStoryView.setText(R.string.T5_End);
                    mTopButton.setText(R.string.Close_App);
                    mBottomButton.setVisibility(View.GONE);
                    mStoryIndex = 0;
                } else if (mStoryIndex == 0) {
                    // Exit out the application
                    finish();
                }
            }
        });

    }

}

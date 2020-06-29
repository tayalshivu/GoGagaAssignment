package com.shivam.gogagaassignment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.github.stefanodp91.android.circularseekbar.CircularSeekBar;
import com.like.LikeButton;
import com.like.OnLikeListener;

import io.feeeei.circleseekbar.CircleSeekBar;


/**
 * A simple {@link Fragment} subclass.
 */
public class MatchPreferences extends Fragment {

    CircleSeekBar circleSeekBar;
    TextView textView;
    ScaleAnimation scaleAnimation;
    ToggleButton male,female;

    public MatchPreferences() {
        // Required empty public constructor
    }


    @SuppressLint("ResourceAsColor")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_match_preferences, container, false);

        male=view.findViewById(R.id.male);
        female=view.findViewById(R.id.female);

        circleSeekBar=view.findViewById(R.id.circle_seek_bar);
        textView=view.findViewById(R.id.progress);

        circleSeekBar.setLeft(100);
        circleSeekBar.setOnSeekBarChangeListener(new CircleSeekBar.OnSeekBarChangeListener() {
            @Override
            public void onChanged(CircleSeekBar seekbar, int curValue) {

                if (curValue>=18){
                    textView.setText("Age "+curValue+"\n& Below");
                    textView.setTextColor(R.color.red_900);
                    textView.setTextSize(18);
                }
                else if (curValue==0){
                    textView.setText("Please select\nage preference");
                }
                else{
                    textView.setText("Minimum\nage 18\nrequired\nKeep\nRotating");
                    textView.setTextColor(R.color.purple_800);
                    textView.setTextSize(15);
                }
            }
        });

        scaleAnimation = new ScaleAnimation(0.7f, 1.0f, 0.7f, 1.0f, Animation.RELATIVE_TO_SELF, 0.7f, Animation.RELATIVE_TO_SELF, 0.7f);
        scaleAnimation.setDuration(300);
        BounceInterpolator bounceInterpolator = new BounceInterpolator();
        scaleAnimation.setInterpolator(bounceInterpolator);

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (male.isChecked()){
                    female.setChecked(false);
                }
            }
        });
        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (female.isChecked()){
                    male.setChecked(false);
                }
            }
        });

        male.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                buttonView.startAnimation(scaleAnimation);
            }
        });

        female.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                buttonView.startAnimation(scaleAnimation);
            }
        });

        return view;
    }
}

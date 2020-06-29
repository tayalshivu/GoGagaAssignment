package com.shivam.gogagaassignment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shivam.gogagaassignment.adapter.RviewAdapter;
import com.shivam.gogagaassignment.modelClass.RviewModel;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AppPreferences extends Fragment {

    RecyclerView recyclerView;

    public AppPreferences() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_app_preferences, container, false);

        recyclerView=view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.isClickable();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new RviewAdapter(Items()));

        return view;
    }

    private ArrayList<RviewModel> Items() {

        ArrayList<RviewModel> models =new ArrayList<>();
        RviewModel rviewModel = new RviewModel();
        rviewModel.setTopText("Alerts");
        rviewModel.setMiddleText("Sound");
        rviewModel.setBottomText("We strongly recommend to keep the notifications ON. " +
                "You don't want to miss a chat notification from your match");
        models.add(rviewModel);

        rviewModel = new RviewModel();
        rviewModel.setTopText("Matchmaker-Only Mode");
        rviewModel.setMiddleText("Hide My Profile");
        rviewModel.setBottomText("Here to only help friends? " +
                "Just hide your profile and be a match-maker");
        models.add(rviewModel);

        rviewModel = new RviewModel();
        rviewModel.setTopText("Themes");
        rviewModel.setMiddleText("Dark Theme");
        rviewModel.setBottomText("Here you can make your app" +
                " to dark theme");
        models.add(rviewModel);

        rviewModel = new RviewModel();
        rviewModel.setTopText("Notification Manager");
        rviewModel.setMiddleText("Enable Notification");
        rviewModel.setBottomText("Never miss an update by whitelisting our app " +
                "from battery optimisation");
        models.add(rviewModel);

        return models;

    }
}

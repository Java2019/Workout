package com.example.use.workout;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class WorkoutListFragment extends ListFragment {


    public WorkoutListFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] names = new String[Workout.WORKOUTS.length];
            for (int i=0; i<names.length; i++){
                names[i] = Workout.WORKOUTS[i].getName();
            }
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1,names);
        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}

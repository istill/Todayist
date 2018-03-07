package kr.lab1.todayist.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;
import android.app.Activity;

import kr.lab1.todayist.R;
import kr.lab1.todayist.MainActivity;

import butterknife.BindView;
import butterknife.ButterKnife;


public class CalendarFragment extends BaseFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calendar, container, false);

        ButterKnife.bind(this, view);
        ( (MainActivity)getActivity()).updateToolbarTitle("캘린더");
        return view;
    }
}
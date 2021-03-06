package kr.lab1.todayist.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kr.lab1.todayist.R;
import kr.lab1.todayist.MainActivity;

import butterknife.ButterKnife;

public class ProfileFragment extends BaseFragment{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        ButterKnife.bind(this, view);
        ( (MainActivity)getActivity()).updateToolbarTitle("프로필");
        return view;
    }
}
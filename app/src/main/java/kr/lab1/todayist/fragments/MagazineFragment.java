package kr.lab1.todayist.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import kr.lab1.todayist.R;
import kr.lab1.todayist.MainActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MagazineFragment extends BaseFragment{

    @BindView(R.id.btn_click_me)
    Button btnClickMe;

    int fragCount;

    public static MagazineFragment newInstance(int instance) {
        Bundle args = new Bundle();
        args.putInt(ARGS_INSTANCE, instance);
        MagazineFragment fragment = new MagazineFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_magazine, container, false);
        ButterKnife.bind(this, view);

        Bundle args = getArguments();
        if (args != null) {
            fragCount = args.getInt(ARGS_INSTANCE);
        }
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mFragmentNavigation != null) {
                    mFragmentNavigation.pushFragment(MagazineFragment.newInstance(fragCount + 1));
                }
            }
        });

        ( (MainActivity)getActivity()).updateToolbarTitle((fragCount == 0) ? "매거진" : "매거진 Sub "+fragCount);
    }
}

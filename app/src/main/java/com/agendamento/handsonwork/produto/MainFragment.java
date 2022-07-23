package com.agendamento.handsonwork.produto;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.agendamento.handsonwork.R;

public class MainFragment extends Fragment {

    public MainFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if (savedInstanceState == null) {
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame_produtos, new ListarFragment()).commit();
        }


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.produto_fragment_main, container, false);
    }
}
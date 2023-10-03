package com.kel5.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kel5.app.adapter.cardAdapter;


public class cardFragment extends Fragment {
    private RecyclerView recyclerView;

    Object[][] data = {
            {R.drawable.kamar1, "Kamar 1", "Kamar Mandi: Luar"},
            {R.drawable.kamar2, "Kamar 2", "Kamar Mandi: Luar"},
            {R.drawable.kamar3, "Kamar 3", "Kamar Mandi: Luar"},
            {R.drawable.kamar4, "Kamar 4", "Kamar Mandi: Luar"}
            // Add more rows as needed...
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_card, container, false);
        recyclerView = view.findViewById(R.id.RecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        cardAdapter adapter = new cardAdapter(data);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
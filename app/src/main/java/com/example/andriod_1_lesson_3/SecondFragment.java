package com.example.andriod_1_lesson_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class SecondFragment extends Fragment {

    private final List<String> list = new ArrayList<>();
    private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.recycler_view);

        list.add("Cупер форсаж");
        list.add("Синяя тюрьма");
        list.add("Унисённые призраками");
        list.add("Аватар");
        list.add("Токийские Мстители");
        list.add("CR7");
        list.add("Чёрный клевер ");
        list.add("ван пис");
        list.add("Один дома");
        list.add("наруто");
        list.add("форсаж_1");
        list.add("форсаж_2");
        list.add("форсаж_3");
        list.add("форсаж_4");
        list.add("форсаж_5");
        list.add("форсаж_6");
        list.add("форсаж_7");


        NamesAdapter name = new NamesAdapter(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()
                ,RecyclerView.VERTICAL,false));
        recyclerView.setAdapter(name);


    }
}
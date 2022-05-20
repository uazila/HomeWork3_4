package com.example.homework3_4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.homework3_4.databinding.FragmentTwoBinding;

import java.util.ArrayList;

public class TwoFragment extends Fragment implements ClickItem {

    private FragmentTwoBinding binding;
    private Adapter adapter;
    private ArrayList<Model> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentTwoBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new Adapter(list, this::clickItem);
        binding.recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        list = new ArrayList<>();
        list.add(new Model("Жамгыр токту", "4:32", "Т. Казаков"));
        list.add(new Model("Кусалык", "4:32", "Ж. Мамытов"));
        list.add(new Model("Ак куулар", "4:32", "Р. Абдыкадыров"));
        list.add(new Model("Аккан суу", "4:32", "Женижок"));
        list.add(new Model("Ак булуттар", "4:32", "А. Керимбаев"));
        list.add(new Model("Сагындым туулган жер сени", "4:32", "Р. Абдыкадыров"));
        list.add(new Model("Эллегия", "4:32", "Т.Казаков"));
    }

    @Override
    public void clickItem(String name) {
        Bundle bundle = new Bundle();
        bundle.putString("key", name);
        ScreenFragment fragment = new ScreenFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().add(R.id.container_main, fragment).addToBackStack("").commit();
    }
}
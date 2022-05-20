package com.example.homework3_4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework3_4.databinding.ItemMusicBinding;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MusicViewHolder> {

    private ArrayList<Model> list = new ArrayList<>();
    ClickItem clickItem;

    public Adapter(ArrayList<Model> list, ClickItem clickItem) {
        this.list = list;
        this.clickItem = clickItem;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MusicViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MusicViewHolder extends RecyclerView.ViewHolder {
        private ItemMusicBinding binding;

        public MusicViewHolder(@NonNull ItemMusicBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Model model) {
            binding.tvNameMusic.setText(model.nameMusic);
            binding.timeMusic.setText(model.timeMusic);
            binding.tvNameAuthor.setText(model.nameAuthor);
            binding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clickItem.clickItem(model.nameMusic);
                }
            });
        }
    }
}

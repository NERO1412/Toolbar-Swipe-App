package com.lbird.toolbarswipe.adapter.partone.viewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.lbird.toolbarswipe.R;

public class RecyclerItemViewHolder extends RecyclerView.ViewHolder {

    private final TextView mItemTextView;

    public RecyclerItemViewHolder(final View parent, TextView itemTextView) {
        super(parent);
        mItemTextView = itemTextView;
    }

    public static RecyclerItemViewHolder newInstance(View parent) {
        TextView itemTextView = (TextView) parent.findViewById(R.id.itemTextView);
        return new RecyclerItemViewHolder(parent, itemTextView);
    }

    public void setItemText(CharSequence text) {
        mItemTextView.setText(text);
    }

}

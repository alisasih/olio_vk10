package com.example.olio_vk9;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    TextView userName, userDegree, userEmail, previousDegrees, txt;
    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        userName = itemView.findViewById(R.id.rvUserName);
        userDegree = itemView.findViewById(R.id.rvDegree);
        userEmail = itemView.findViewById(R.id.rvEmail);
        txt = itemView.findViewById(R.id.rvTxt);
        previousDegrees = itemView.findViewById(R.id.rvPrevious);
    }
}

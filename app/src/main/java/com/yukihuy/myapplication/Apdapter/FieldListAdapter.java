package com.yukihuy.myapplication.Apdapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yukihuy.myapplication.Model.Field;
import com.yukihuy.myapplication.QuestionActivity;
import com.yukihuy.myapplication.R;

import java.util.LinkedList;


public class FieldListAdapter extends RecyclerView.Adapter<FieldListAdapter.FieldViewHoder>{
    public Context mContext;
    private LinkedList<Field> mfieldLinkedList;
    private LayoutInflater mInflater;


    public FieldListAdapter(Context context,LinkedList<Field> fieldLinkedList) {
        mInflater = LayoutInflater.from(context);
        this.mfieldLinkedList = fieldLinkedList;
    }

    @NonNull
    @Override
    public FieldViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.field_item,parent,false);
        return new FieldViewHoder(view,this);
    }

    @Override
    public void onBindViewHolder(@NonNull FieldViewHoder holder, int position) {
        String mCurrent = mfieldLinkedList.get(position).getTen_linh_vuc();
        holder.bntField.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mfieldLinkedList.size();
    }




    public class FieldViewHoder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final Button bntField;
        FieldListAdapter mAdapter;
        public FieldViewHoder(@NonNull View itemView, FieldListAdapter adapter) {
            super(itemView);
            bntField = itemView.findViewById(R.id.btnField);
            this.mAdapter = adapter;
            bntField.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
                int mPosition = getLayoutPosition();
                Field field = mfieldLinkedList.get(mPosition);
                Intent intent=new Intent(itemView.getContext(), QuestionActivity.class);
                intent.putExtra("Message",String.valueOf(field.getId()));
                itemView.getContext().startActivity(intent);

        }

    }
}

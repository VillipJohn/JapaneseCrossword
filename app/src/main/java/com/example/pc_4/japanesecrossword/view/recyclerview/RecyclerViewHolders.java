package com.example.pc_4.japanesecrossword.view.recyclerview;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.pc_4.japanesecrossword.R;
import com.example.pc_4.japanesecrossword.view.ui.SquareCardView;


public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

    public SquareCardView squareItem;
    public TextView everyItem;
    public int selector = 0;

    public RecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);

        squareItem = (SquareCardView) itemView.findViewById(R.id.square_card_view);
        //frameLayout.setBackgroundResource(R.drawable.rectangle);
        everyItem = (TextView)itemView.findViewById(R.id.card_date);

    }

    @Override
    public void onClick(View view) {

        switch(selector) {
            case 0:
                squareItem.setBackgroundColor(Color.parseColor("#000000"));
                //frameLayout.setTextColor(Color.parseColor("#000000"));
                break;
            case 1:
                squareItem.setBackgroundResource(R.drawable.x);
                //frameLayout.setTextColor(Color.parseColor("#000000"));
                break;
            case 2:
                squareItem.setBackgroundColor(Color.parseColor("#ffffff"));
                //frameLayout.setTextColor(Color.parseColor("#ffffff"));
                break;
            default:
                break;
        }

        selector++;
        if(selector == 3){
            selector = 0;
        }
      /* // Context context = view.getContext();
        Intent intent = new Intent(view.getContext(), ListEventsActivity.class);
        intent.putExtra("key_day", everyDay.getText().toString() + " " + MainContentFragment.staticMonthYear);
        view.getContext().startActivity(intent);*/

    }

   /* @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int size = 0;
        int width = getMeasuredWidth();
        int height = getMeasuredHeight();

        if (width &gt; height) {
            size = height;
        } else {
            size = width;
        }
        setMeasuredDimension(size, size);
    }*/
}
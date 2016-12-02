package kumar.recyclerview;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by User on 11/30/2016.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Item> itemlist;
    public ItemAdapter (Context context, ArrayList<Item> itemlist){
        this.context=context;
        this.itemlist=itemlist;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view=inflater.from(parent.getContext())
                .inflate(R.layout.cardview, parent, false);
       ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

       Item item= itemlist.get(position);

        Picasso.with(context)
                .load(item.img)
                .placeholder(R.drawable.chrysanthemum)
                .error(android.R.drawable.stat_notify_error)
                .into(holder.imageView);
        holder.t1.setText(item.text);

//  holder.t1.setText("HI");



    }

    @Override
    public int getItemCount() {
        if (itemlist!=null) {
            return itemlist.size();
        }

            return 0;

    }
//View holder class
    public static class ViewHolder extends RecyclerView.ViewHolder{
    public CardView cardView;
    public ImageView imageView;
    public TextView t1;

        public ViewHolder(View itemView) {
            super(itemView);
            cardView=(CardView) itemView.findViewById(R.id.card_view);
            imageView=(ImageView) itemView.findViewById(R.id.imageview);
            t1=(TextView) itemView.findViewById(R.id.T1);
        }
    }
}

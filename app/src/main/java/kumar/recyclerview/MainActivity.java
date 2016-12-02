package kumar.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import static android.R.id.list;

public class MainActivity extends AppCompatActivity {

   RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);
        //layout manager
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //this=context
        LinearLayoutManager manager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        ArrayList<Item> itemlist=generateDummy();

        //Adapter
        ItemAdapter adapter=new ItemAdapter(getApplicationContext(),itemlist);
        recyclerView.setAdapter(adapter);
    }
    private ArrayList<Item> generateDummy(){
        // creating a list of items
        ArrayList<Item> list= new ArrayList<>();
        for (int i=0;i<50;i++){
            if(i%3==0){
                Item item=new Item();
                item.id=i;
                item.img="http://vistina.mk/wp-content/uploads/2016/01/Guadalajara-cathedral-Mexico.jpg";
                item.text="Buenos Dias";
                list.add(item);

            }
            else if (i%7==0){
                Item item=new Item();
                item.id=i;
                item.img="https://s-media-cache-ak0.pinimg.com/originals/82/b1/d5/82b1d545238ae5d6dfb1cc9435e6bb89.jpg";
                item.text="Buenos tardes";
                list.add(item);
            }
            else if (i%11==0){
                Item item=new Item();
                item.id=i;
                item.img="http://www.mendaily.com/wp-content/uploads/2012/11/Mexico-City-Metropolitan-Cathedral.jpg";
                item.text="Buenos noches";
                list.add(item);
            }
            else {
                Item item=new Item();
                item.id=i;
                item.img="https://upload.wikimedia.org/wikipedia/commons/c/cb/Hospicio_Caba%C3%B1as.JPG";
                item.text="Adios";
                list.add(item);
            }

        }
        return list;

    }
}

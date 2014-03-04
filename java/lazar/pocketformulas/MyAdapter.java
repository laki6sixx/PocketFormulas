package lazar.pocketformulas;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Lazar on 2/13/14.
 */

public class MyAdapter extends ArrayAdapter<Model> {

    public Context context;
    private final ArrayList<Model> modelsArrayList;

    public MyAdapter(Context context, ArrayList<Model> modelsArrayList) {

        super(context, R.layout.target_item, modelsArrayList);

        this.context = context;
        this.modelsArrayList = modelsArrayList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // 1. Create inflater
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // 2. Get rowView from inflater

        View rowView = null;
        Context context = MainActivity.getContext();
        AssetManager manager = context.getAssets();
        Typeface font = Typeface.createFromAsset(manager, "Bariol.otf");
        if (!modelsArrayList.get(position).isGroupHeader()) {
            rowView = inflater.inflate(R.layout.target_item, parent, false);

            // 3. Get icon,title & counter views from the rowView
            ImageView imgView = (ImageView) rowView.findViewById(R.id.item_icon);
            TextView titleView = (TextView) rowView.findViewById(R.id.item_title);
            titleView.setGravity(Gravity.CENTER_VERTICAL);
            titleView.setTypeface(font);
            // 4. Set the text for textView
            imgView.setImageResource(modelsArrayList.get(position).getIcon());
            titleView.setText(modelsArrayList.get(position).getTitle());
        } else {
            rowView = inflater.inflate(R.layout.group_header_item, parent, false);
            TextView titleView = (TextView) rowView.findViewById(R.id.header);
            titleView.setTypeface(font);
            if (position == 15 || position == 19) {
                titleView.setText(" - " + modelsArrayList.get(position).getTitle() + " - ");
                titleView.setTextSize(20);
            } else {
                titleView.setText(modelsArrayList.get(position).getTitle());
                titleView.setTextSize(25);
            }
        }

        // 5. return rowView
        return rowView;
    }
}
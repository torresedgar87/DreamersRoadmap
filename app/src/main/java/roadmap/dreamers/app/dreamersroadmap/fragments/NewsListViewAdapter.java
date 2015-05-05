package roadmap.dreamers.app.dreamersroadmap.fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.Date;

import roadmap.dreamers.app.dreamersroadmap.R;

public class NewsListViewAdapter extends ArrayAdapter<String>
{
    private final Context context;
    private final String[] values;

    public NewsListViewAdapter(Context context, String[] values)
    {
        super(context, R.layout.listview_news, values);
        this.context = context;
        this.values = values;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.listview_news, parent, false);

        TextView textView = (TextView) rowView.findViewById(R.id.firstLine);
        textView.setText("News Update " + new Date());

        TextView textView1 = (TextView) rowView.findViewById(R.id.secondLine);
        textView.setText(values[0]);

        return rowView;
    }
}

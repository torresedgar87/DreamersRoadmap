package roadmap.dreamers.app.dreamersroadmap.fragments;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import roadmap.dreamers.app.dreamersroadmap.R;

public class NewsListFragment extends ListFragment
{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        String[] values = {"This will be filled with news information"};

        NewsListViewAdapter adapter = new NewsListViewAdapter(getActivity().getApplicationContext(), values);

        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}

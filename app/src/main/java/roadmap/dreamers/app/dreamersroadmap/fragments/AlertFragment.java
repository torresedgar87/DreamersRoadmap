package roadmap.dreamers.app.dreamersroadmap.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import roadmap.dreamers.app.dreamersroadmap.R;

/**
 * Created by Edgar on 5/4/15.
 */
public class AlertFragment extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_alert, container, false);
    }
}

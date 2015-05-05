package roadmap.dreamers.app.dreamersroadmap;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;

import roadmap.dreamers.app.dreamersroadmap.fragments.AlertFragment;
import roadmap.dreamers.app.dreamersroadmap.fragments.NewsFragment;
import roadmap.dreamers.app.dreamersroadmap.fragments.NewsListFragment;
import roadmap.dreamers.app.dreamersroadmap.fragments.ScholarshipFragment;
import roadmap.dreamers.app.dreamersroadmap.fragments.SettingsFragment;
import roadmap.dreamers.app.dreamersroadmap.fragments.UserFragment;

public class HomeActivity extends Activity {;

    private FragmentManager fragmentManager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        fragmentManager = getFragmentManager();

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.placeholder, new NewsListFragment());
        transaction.commit();

        getActionBar().setDisplayShowHomeEnabled(false);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_actionbar, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Fragment fragment = null;
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        switch (item.getItemId()) {
            case R.id.menu_user_action:
                fragment = new UserFragment();
                break;
            case R.id.menu_news_action:
                fragment = new NewsListFragment();
                break;
            case R.id.menu_alert_action:
                fragment = new AlertFragment();
                break;
            case R.id.menu_scholar_action:
                fragment = new ScholarshipFragment();
                break;
            case R.id.menu_settings_action:
                fragment = new SettingsFragment();
                break;
            default:
                break;
        }

        transaction.replace(R.id.placeholder, fragment);
        transaction.commit();

        return true;
    }
}

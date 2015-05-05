package roadmap.dreamers.app.dreamersroadmap.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import roadmap.dreamers.app.dreamersroadmap.R;

public class UserFragment extends Fragment
{
    private EditText nameEditText = null;
    private EditText emailEditText = null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        nameEditText = (EditText) getActivity().findViewById(R.id.user_name_edit);
        emailEditText = (EditText) getActivity().findViewById(R.id.user_email_edit);

        return inflater.inflate(R.layout.fragment_user, container, false);
    }

    /*@Override
    protected void onStart() {
        super.onStart();

        AsyncClass c = new AsyncClass();
        c.execute("http://192.168.0.105:8080/RESTfulExample/rest/user/" + "torresedgar87@yahoo.com");

        JSONObject user = null;
        try {
            user = new JSONObject(c.get());
            nameEditText.setText(user.get("name").toString());
            emailEditText.setText(user.get("email").toString());
            passwordEditText.setText(user.get("password").toString());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }


    private class AsyncClass extends AsyncTask<String, String, String>
    {

        @Override
        protected String doInBackground(String... strings) {

            String restCall = strings[0];
            String finalLine= "";

            // HTTP Get
            try {

                URL url = new URL(restCall);
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(url.openStream()));

                String inputLine;
                while ((inputLine = in.readLine()) != null)
                    finalLine += inputLine;

                in.close();

            } catch (Exception e ) {

                System.out.println(e.getMessage());
                return e.getMessage();
            }

            return finalLine;
        }
    }*/
}

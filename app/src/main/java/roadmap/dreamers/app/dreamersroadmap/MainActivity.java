package roadmap.dreamers.app.dreamersroadmap;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class MainActivity extends Activity {

    private Button loginButton = null;
    private EditText emailText = null;
    private EditText passwordText = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = (Button) findViewById(R.id.main_login_button);
        emailText = (EditText) findViewById(R.id.main_email_edit);
        passwordText = (EditText) findViewById(R.id.main_password_edit);

        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent homeIntent = new Intent(getApplicationContext(), HomeActivity.class);

                String email = emailText.getText().toString();
                String password = passwordText.getText().toString();

                /*if(!email.isEmpty() && !password.isEmpty())
                {
                    AsyncClass c = new AsyncClass();
                    c.execute("http://192.168.0.105:8080/RESTfulExample/rest/user/" + email);

                    JSONObject user = null;
                    try {
                        user = new JSONObject(c.get());
                    }
                    catch (Exception e)
                    {
                        System.out.println(e.getMessage());
                    }

                    try {
                        if (user.get("password").equals(password))
                        {
                            startActivity(homeIntent);
                        }
                    }
                    catch (Exception e)
                    {
                        System.out.println(e.getMessage());
                    }

                }*/
                startActivity(homeIntent);
            }

        });
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
    }

}

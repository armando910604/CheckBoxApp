package armando.checkboxapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


public class seleccion extends ActionBarActivity {
    TextView textView;
    Button env;
    CheckBox chb1, chb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion);
        textView = (TextView) findViewById(R.id.textView);
        env = (Button) findViewById(R.id.env);
        chb1 = (CheckBox) findViewById(R.id.chek1);
        chb2 = (CheckBox) findViewById(R.id.chek2);
    }

    public void enviardatos(View v) {
        switch (v.getId()) {
            case R.id.env:
                if
                        (chb1.isChecked()== true && chb2.isChecked() == true) {
                    textView.setText(R.string.aviso);
                }
                else if
                        (chb1.isChecked()== false && chb2.isChecked() == false) {
                    textView.setText(R.string.aviso2);
                }
                else {

                    if (chb1.isChecked() == true) {
                        textView.setText(R.string.saludom);

                    }
                    if (chb2.isChecked() == true) {
                        textView.setText(R.string.saludof);
                    }
                }

                break;
            default:
                break;
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_seleccion, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

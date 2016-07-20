package moblab.calculadoraonline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.github.kittinunf.fuel.Fuel;
import com.github.kittinunf.fuel.core.FuelError;
import com.github.kittinunf.fuel.core.Handler;
import com.github.kittinunf.fuel.core.Request;
import com.github.kittinunf.fuel.core.Response;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void soma (View view){
        String valor1 = ((EditText)findViewById(R.id.valor_1)).getText().toString();
        String valor2 = ((EditText)findViewById(R.id.valor_2)).getText().toString();



        Fuel.get("http://192.168.10.125:5000/soma?numero_1="+valor1+"&numero_2="+valor2).responseString(new Handler<String>() {
            @Override
            public void failure(Request request, Response response, FuelError error) {
                Log.d("RESULTADO NO", response.toString());
            }

            @Override
            public void success(Request request, Response response, String data) {
                Log.d("RESULTADO YES", response.toString());
                ((TextView)findViewById(R.id.resultado)).setText(data);

            }
        });
    }
    public void sub (View view){
        String valor1 = ((EditText)findViewById(R.id.valor_1)).getText().toString();
        String valor2 = ((EditText)findViewById(R.id.valor_2)).getText().toString();



        Fuel.get("http://192.168.10.125:5000/sub?numero_1="+valor1+"&numero_2="+valor2).responseString(new Handler<String>() {
            @Override
            public void failure(Request request, Response response, FuelError error) {
                Log.d("RESULTADO NO", response.toString());
            }

            @Override
            public void success(Request request, Response response, String data) {
                Log.d("RESULTADO YES", response.toString());
                ((TextView)findViewById(R.id.resultado)).setText(data);

            }
        });
    }
    public void mult (View view){
        String valor1 = ((EditText)findViewById(R.id.valor_1)).getText().toString();
        String valor2 = ((EditText)findViewById(R.id.valor_2)).getText().toString();



        Fuel.get("http://192.168.10.125:5000/mult?numero_1="+valor1+"&numero_2="+valor2).responseString(new Handler<String>() {
            @Override
            public void failure(Request request, Response response, FuelError error) {
                Log.d("RESULTADO NO", response.toString());
            }

            @Override
            public void success(Request request, Response response, String data) {
                Log.d("RESULTADO YES", response.toString());
                ((TextView)findViewById(R.id.resultado)).setText(data);

            }
        });
    }
    public void div (View view){
        String valor1 = ((EditText)findViewById(R.id.valor_1)).getText().toString();
        String valor2 = ((EditText)findViewById(R.id.valor_2)).getText().toString();



        Fuel.get("http://192.168.10.125:5000/div?numero_1="+valor1+"&numero_2="+valor2).responseString(new Handler<String>() {
            @Override
            public void failure(Request request, Response response, FuelError error) {
                Log.d("RESULTADO NO", response.toString());
            }

            @Override
            public void success(Request request, Response response, String data) {
                Log.d("RESULTADO YES", response.toString());
                ((TextView)findViewById(R.id.resultado)).setText(data);

            }
        });
    }

}



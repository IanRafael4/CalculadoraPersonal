package ipn.cecyt9.calculadorapersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    Double numero1, numero2;
    Double resultado, euro;
    String operador, reset;

    public void onClickButtonOne(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "1");
    }

    public void onClickButtonTwo(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "2");
    }

    public void onClickButtonThree(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "3");
    }

    public void onClickButtonFour(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "4");
    }

    public void onClickButtonFive(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "5");
    }

    public void onClickButtonSix(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "6");
    }

    public void onClickButtonSeven(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "7");
    }

    public void onClickButtonEight(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "8");
    }

    public void onClickButtonNine(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "9");
    }

    public void onClickButtonZero(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "0");
    }



    public void onClickOperacionCapNum1(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void onClickSuma(View miView)
    {
        operador="+";
        onClickOperacionCapNum1(miView);
    }

    public void onClickResta(View miView)
    {
        operador="-";
        onClickOperacionCapNum1(miView);
    }

    public void onClickMulti(View miView)
    {
        operador="-";
        onClickOperacionCapNum1(miView);
    }

    public void onClickDivision(View miView)
    {
        operador="/";
        onClickOperacionCapNum1(miView);
    }

    public void onClickIgual(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        numero2 = Double.parseDouble(tv.getText().toString());

        try {

            if (operador.equals("+")) {
                resultado = numero1 + numero2;
            }
            else{
                if(operador.equals("-")){
                    resultado = numero1 - numero2;
                }
                else{
                    if(operador.equals("*")){
                        resultado = numero1 * numero2;
                    }
                    else{
                        if(operador.equals("/")){
                            resultado = numero1 / numero2;
                        }

                    }
                }
            }

            tv.setText(resultado.toString());


        }catch(NumberFormatException nfe){
            Toast.makeText(this,"Numero Incorrecto", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickButtonReset(View miView){
        TextView tv = (TextView) findViewById(R.id.textView) ;
        reset = "";
        tv.setText(reset.toString());
    }
    public void onClickButtonEuroPesos(View miView) {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        euro = numero1*24.67;
        tv.setText(euro.toString());
    }
}
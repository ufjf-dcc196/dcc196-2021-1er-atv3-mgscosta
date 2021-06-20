package br.ufjf.dcc196.mgscosta.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText number_one;
    private EditText number_two;
    private TextView result;
    private Double num1;
    private Double num2;
    private Double resultadoCalculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number_one = findViewById(R.id.number_one);
        number_two = findViewById(R.id.number_two);
        result = findViewById(R.id.result);
    }

    public void sum(View view) {
        num1 = Double.parseDouble(number_one.getText().toString());
        num2 = Double.parseDouble(number_two.getText().toString());
        resultadoCalculo = num1 + num2;
        result.setText(resultadoCalculo.toString());
    }

    public void subtract(View view) {
        num1 = Double.parseDouble(number_one.getText().toString());
        num2 = Double.parseDouble(number_two.getText().toString());
        resultadoCalculo = num1 - num2;
        result.setText(resultadoCalculo.toString());
    }

//    public void multiply(View view) {
//
//    }
//
//    public void divide(View view) {
//
//    }

}
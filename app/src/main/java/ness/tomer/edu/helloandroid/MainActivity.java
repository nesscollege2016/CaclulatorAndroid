package ness.tomer.edu.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int num1 = 0;
    String lastOperator = "=";

    //1) צור משתנה מהסוג הדרוש
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //2
        //מקשרים בין המשתנה שיצרנו לבין הפקד מהעיצוב ע"י מצא-פקד-לפי-מזהה
        //findViewById(R.id.<YOURView>
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);

    }

    //All numbers 0-9
    public void numberClicked(View view) {
        Button btn = (Button) view;

        String displayText = tvDisplay.getText().toString();

        if (displayText.equals("0")){
            tvDisplay.setText(btn.getText());
        }else{
            tvDisplay.setText(displayText + btn.getText());
        }

/*
        if (tvDisplay.getText().equals("0")){
            tvDisplay.setText(btn.getText());
        }else {
            tvDisplay.append(btn.getText());
        }*/
    }

    //All operators : + / - x
    public void operatorClicked(View view) {
        Button op = (Button) view;
        lastOperator = op.getText().toString();
        String n1 = tvDisplay.getText().toString();
        num1 = Integer.valueOf(n1);
        tvDisplay.setText("0");
    }

    //Equals button
    public void evaluateClicked(View view) {
        
    }
}

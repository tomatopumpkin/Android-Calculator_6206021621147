package com.wimonsiri.calculator_6206021621147;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView expression = findViewById(R.id.expression);
        final TextView resultHolder = findViewById(R.id.resultHolder);

        final Button cBtn = findViewById(R.id.cBtn);
        final Button addSubBtn = findViewById(R.id.addSubBtn);
        final Button divisionBtn = findViewById(R.id.divisionBtn);
        final Button sevenBtn = findViewById(R.id.sevenBtn);
        final Button eightBtn = findViewById(R.id.eightBtn);
        final Button nineBtn = findViewById(R.id.nineBtn);
        final Button multiplicationBtn = findViewById(R.id.multiplicationBtn);
        final Button fourBtn = findViewById(R.id.fourBtn);
        final Button fiveBtn = findViewById(R.id.fiveBtn);
        final Button sixBtn = findViewById(R.id.sixBtn);
        final Button oneBtn = findViewById(R.id.oneBtn);
        final Button twoBtn = findViewById(R.id.twoBtn);
        final Button threeBtn = findViewById(R.id.threeBtn);
        final Button dotBtn = findViewById(R.id.dotBtn);
        final Button zeroBtn = findViewById(R.id.zeroBtn);
        final Button delBtn = findViewById(R.id.delBtn);
        final Button equalsBtn = findViewById(R.id.equalsBtn);
        final Button subtractionBtn = findViewById(R.id.subtractionBtn);
        final Button additionBtn = findViewById(R.id.additionBtn);

        //onclick listeners
        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText() + "1");
            }
        });
        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText() + "2");
            }
        });
        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText() + "3");
            }
        });
        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText() + "4");
            }
        });
        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText() + "5");
            }
        });
        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText() + "6");
            }
        });
        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText() + "7");
            }
        });
        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText() + "8");
            }
        });
        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText() + "9");
            }
        });
        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText() + "0");
            }
        });
        dotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression.setText(expression.getText() + ".");
            }
        });
        delBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String expressionText = expression.getText().toString();
                if (!expressionText.isEmpty()) {
                    expression.setText(expressionText.substring(0, expressionText.length() - 1));
                }
            }
        });
        cBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression.setText(""); //empty exression
                resultHolder.setText(""); // make both expression and result holder empty
            }
        });

        additionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String expressionText = expression.getText().toString();

                if (expressionText.isEmpty()) {
                    expression.setText("0+");
                } else {
                    final char getLastCharacter = expressionText.charAt(expressionText.length() - 1);

                    if (getLastCharacter == '+' || getLastCharacter == '-' || getLastCharacter == '×' || getLastCharacter == '÷') {
                        expression.setText(expressionText.substring(0, expressionText.length() - 1) + "+");
                    } else {
                        expression.setText(expressionText + "+");
                    }
                }
            }
        });
        subtractionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String expressionText = expression.getText().toString();

                if (expressionText.isEmpty()) {
                    expression.setText("0-");
                } else {
                    final char getLastCharacter = expressionText.charAt(expressionText.length() - 1);

                    if (getLastCharacter == '+' || getLastCharacter == '-' || getLastCharacter == '×' || getLastCharacter == '÷') {
                        expression.setText(expressionText.substring(0, expressionText.length() - 1) + "-");
                    } else {
                        expression.setText(expressionText + "-");
                    }
                }
            }
        });
        multiplicationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String expressionText = expression.getText().toString();

                if (expressionText.isEmpty()) {
                    expression.setText("0×");
                } else {
                    final char getLastCharacter = expressionText.charAt(expressionText.length() - 1);

                    if (getLastCharacter == '+' || getLastCharacter == '-' || getLastCharacter == '×' || getLastCharacter == '÷') {
                        expression.setText(expressionText.substring(0, expressionText.length() - 1) + "×");
                    } else {
                        expression.setText(expressionText + "×");
                    }
                }
            }
        });
        divisionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String expressionText = expression.getText().toString();

                if (expressionText.isEmpty()) {
                    expression.setText("0/");
                } else {
                    final char getLastCharacter = expressionText.charAt(expressionText.length() - 1);

                    if (getLastCharacter == '+' || getLastCharacter == '-' || getLastCharacter == '×' || getLastCharacter == '÷') {
                        expression.setText(expressionText.substring(0, expressionText.length() - 1) + "/");
                    } else {
                        expression.setText(expressionText + "÷");
                    }
                }
            }
        });

        addSubBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float value = 0; // initial value

                String strValue = expression.getText().toString();
                if (!strValue.equals(""))
                    value = Float.parseFloat(strValue);
                if (value != 0) {
                    value = value * (-1);
                    expression.setText(String.valueOf(value));
                }


            }
        });
        equalsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = expression.getText().toString();
                String replacedstr = val.replace('÷', '/').replace('×', '*');
                double result = eval(replacedstr);
                expression.setText(String.valueOf(result));
                resultHolder.setText(val);
            }
        });

    }


    //eval function
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }


            double parseExpression() {
                double x = parseTerm();
                for (; ; ) {
                    if (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (; ; ) {
                    if (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }

                return x;
            }
        }.parse();
    }
}
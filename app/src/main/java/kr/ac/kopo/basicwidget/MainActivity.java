package kr.ac.kopo.basicwidget;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edit1; // 전역변수 선언
    TextView textResult;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        TextView text1 = findViewById(R.id.text1);
        TextView text2 = findViewById(R.id.text2);
        TextView text3 = findViewById(R.id.text3);

        text1.setTextSize(20);
        text1.setTextColor(Color.MAGENTA);
        text1.setText("한국폴리텍대학");

        text2.setTextSize(30);
        text2.setTextColor(Color.BLUE);
        text2.setText("인공지능소프트웨어과");

        text3.setSingleLine(true);
        text3.setText("SingleLine 속성SingleLine 속성SingleLine 속성SingleLine 속성SingleLine 속성SingleLine 속성SingleLine 속성SingleLine 속성");

        edit1 = findViewById(R.id.edit1);
        textResult = findViewById(R.id.textResult);
        Button btnResult = findViewById(R.id.btnResult);

        btnResult.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String univName = edit1.getText().toString(); // 반환 받은 값을 스트링 형식으로 변환
            String result = univName + "에 합격하신 것을 진심으로 축하드립니다!";
            textResult.setText(result); // TextView에 문구 출력
            textResult.setTextColor(Color.rgb(183, 240, 177));
        }
    };
}
package opstudio.hello;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        Button button2 = (Button) findViewById(R.id.button2); // inflation
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                startActivity(intent);
            }
        });

        Button button6 = (Button) findViewById(R.id.button6); // inflation
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, FrameLayoutActivity.class);
                startActivity(intent);
            }
        });

        Button button7 = (Button) findViewById(R.id.button7); // inflation
        button7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, LayoutInflaterActivity.class);
                startActivity(intent);
            }
        });
    }

    // 버튼 - Toast Message 띄우기
    public void onButton1Clicked(View v) {

        Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "버튼이 클릭되었습니다.", Toast.LENGTH_SHORT).show();
    }

    // 버튼 - 전화 걸기
    public void onButton3Clicked(View v) {

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-4000-0000"));
        startActivity(intent);
    }

    // 버튼 - 새로운 화면(액티비티) 연결
    public void onButton4Clicked(View v) {

        Intent intent = new Intent(this, NewActivity.class);
        startActivity(intent);
    }

    public void onButton5Clicked(View v) {

        Intent intent = new Intent(this, ImageActivity.class);
        startActivity(intent);
    }


}

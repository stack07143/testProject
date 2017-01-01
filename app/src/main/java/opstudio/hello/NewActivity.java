package opstudio.hello;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
    }

    // 버튼 - Main Activity로 돌아가기
    public void onButton1Clicked(View v) {

        finish();
    }
}

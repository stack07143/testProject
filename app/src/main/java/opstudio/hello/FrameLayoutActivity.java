package opstudio.hello;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FrameLayoutActivity extends AppCompatActivity {

    ImageView imageView;
    ImageView imageView2;

    boolean selected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        imageView = (ImageView) findViewById(R.id.imageView_framelayout_01);
        imageView2 = (ImageView) findViewById(R.id.imageView_framelayout_02);

        Button button = (Button) findViewById(R.id.button_change_framelayout);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                if(selected) {

                    imageView.setVisibility(View.VISIBLE);
                    imageView2.setVisibility(View.GONE);
                }
                else {

                    imageView.setVisibility(View.GONE);
                    imageView2.setVisibility(View.VISIBLE);
                }

                selected = !selected;
            }
        });


    }
}

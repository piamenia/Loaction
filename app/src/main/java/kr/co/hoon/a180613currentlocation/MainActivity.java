package kr.co.hoon.a180613currentlocation;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                // 위도와 경도를 생성
                double lat = 37.497844;
                double lng = 127.027531;

                // 위도와 경도를 가지고 맵 URL 생성
                // URL을 웹이나 이메일, 전화번호, sms 형태로 만들면 그 기능을 수행하는 앱을 실행함
                String pos = String.format("geo:%f,%f?z=16", lat, lng);

                // URL실행
                Uri uri = Uri.parse(pos);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}

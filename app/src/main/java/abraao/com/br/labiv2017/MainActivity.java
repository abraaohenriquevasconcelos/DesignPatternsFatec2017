package abraao.com.br.labiv2017;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public ImageView profile;


    public void init(){
        profile = (ImageView) findViewById(R.id.imageViewProfile);

        profile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent profileIntent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(profileIntent);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }
}

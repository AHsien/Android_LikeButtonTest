package tw.org.iii.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.like.LikeButton;
import com.like.OnLikeListener;

public class MainActivity extends AppCompatActivity {
    private LikeButton likeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        likeButton = findViewById(R.id.star_button);

        likeButton.setOnLikeListener(new OnLikeListener() {
            @Override
            public void liked(LikeButton likeButton) {
                Log.v("brad", "liked");
            }

            @Override
            public void unLiked(LikeButton likeButton) {
                Log.v("brad", "unLiked");
            }
        });
    }

    public void test1(View view) {
        likeButton.setLiked(true);
    }

    public void test2(View view) {
        likeButton.setEnabled(true);
    }

    public void test3(View view) {
        likeButton.setEnabled(false);
    }
}

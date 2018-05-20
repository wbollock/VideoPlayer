package wbollock.com.videoplayer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView buckysVideoView = (VideoView) findViewById(R.id.buckysVideoView);
        buckysVideoView.setVideoPath("http://techslides.com/demos/sample-videos/small.mp4");

        //player controls for video
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(buckysVideoView);
        buckysVideoView.setMediaController(mediaController);
        
        buckysVideoView.start();
            }




}

package com.hotsoupapps.fivealbumsthatchangedmylife;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Reminder: need to draw string directly from the resource's context. It's fine to do this here
    // because it is a URL and does not need to be localized.
    public void playAlbumOne(View view) {
        openBrowser(this.getString(R.string.album_link_1));
    }

    public void playAlbumTwo(View view) {
        openBrowser(this.getString(R.string.album_link_2));
    }

    public void playAlbumThree(View view) {
        openBrowser(this.getString(R.string.album_link_3));
    }

    public void playAlbumFour(View view) {
        openBrowser(this.getString(R.string.album_link_4));
    }

    public void playAlbumFive(View view) {
        openBrowser(this.getString(R.string.album_link_5));
    }

    // Allows people with and without the youtube app to view the video

    public void openBrowser(String id) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=" + id));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}

package com.example.a100559792.sociallmediaa;

import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;
import com.twitter.sdk.android.tweetui.UserTimeline;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by 100559792 on 12/2/2017.
 */

public class TwitterFeed extends ListActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twitter_layout);

        Twitter.initialize(TwitterFeed.this);

        final UserTimeline userTimeline = new UserTimeline.Builder()
                .screenName("uoit")
                .build();
        final TweetTimelineListAdapter adapter = new TweetTimelineListAdapter.Builder(this)
                .setTimeline(userTimeline)
                .build();
        setListAdapter(adapter);
    }

    public void back(View source){
        finish();
    }
}

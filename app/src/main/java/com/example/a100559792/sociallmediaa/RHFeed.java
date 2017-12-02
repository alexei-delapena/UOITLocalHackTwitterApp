package com.example.a100559792.sociallmediaa;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;

import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;
import com.twitter.sdk.android.tweetui.UserTimeline;

/**
 * Created by 100559792 on 12/2/2017.
 */

public class RHFeed extends ListActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twitter_layout);

        Twitter.initialize(RHFeed.this);

        final UserTimeline userTimeline = new UserTimeline.Builder()
                .screenName("ridgebackhacks")
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

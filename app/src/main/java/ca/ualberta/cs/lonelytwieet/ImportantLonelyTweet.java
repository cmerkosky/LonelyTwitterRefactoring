package ca.ualberta.cs.lonelytwieet;


import android.util.Log;

/**
 * Created by cole on 13/03/18.
 */

public class ImportantLonelyTweet extends LonelyTweet {

    public ImportantLonelyTweet(){
    }

    public ImportantLonelyTweet(String text) {

    }

    // Made method private
    private String getTweetBody() {
        return tweetBody.toUpperCase();
    }

    // Simplified the redundant if statement
    public boolean isValid() {
        return !(tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 20);
    }

    public String toString(){
        String string = getTweetDate() + " | " + getTweetBody();
        Log.i("ImportantLonelyTweet", string);
        return string;
    }
}

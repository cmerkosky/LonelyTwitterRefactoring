package ca.ualberta.cs.lonelytwieet;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by cole on 13/03/18.
 */

public abstract class LonelyTweet implements Serializable {

    private static final long serialVersionUID = 1L;

    // Made the fields package private
    Date tweetDate;
    String tweetBody;

    // Made the constructor package private
    LonelyTweet() {
    }

    public LonelyTweet(String text) {
        this.tweetDate = new Date();
        this.tweetBody = text;
    }

    // Made method package private
    Date getTweetDate() {
        return tweetDate;
    }

    public void setTweetDate(Date tweetDate) {
        this.tweetDate = tweetDate;
    }

    public void setTweetBody(String tweetBody) {
        this.tweetBody = tweetBody;
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeObject(tweetDate);
        out.writeObject(tweetBody);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException,
            ClassNotFoundException {
        tweetDate = (Date) in.readObject();
        tweetBody = (String) in.readObject();
    }

    public abstract boolean isValid();
}


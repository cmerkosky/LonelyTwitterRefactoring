package ca.ualberta.cs.lonelytwieet;

import java.util.Date;

public class NormalLonelyTweet extends LonelyTweet {


	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	// Simplified the redundant if statement
	@Override
	public boolean isValid() {
		return !(tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 10);
	}

	@Override
	public String toString() {
		return getTweetDate() + " | " + getTweetBody() ;
	}

	public String getTweetBody() {
        return tweetBody;
    }
}
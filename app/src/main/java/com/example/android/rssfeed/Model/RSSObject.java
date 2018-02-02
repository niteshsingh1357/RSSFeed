package com.example.android.rssfeed.Model;

import java.util.List;

/**
 * Created by nitesh on 2/1/18.
 */

public class RSSObject {
    public String status;
    public Feed feed;
    public List<item> items;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Feed getFeed() {
        return feed;
    }

    public void setFeed(Feed feed) {
        this.feed = feed;
    }

    public List<item> getItems() {
        return items;
    }

    public void setItems(List<item> items) {
        this.items = items;
    }
}

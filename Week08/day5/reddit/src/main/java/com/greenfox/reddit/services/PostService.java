package com.greenfox.reddit.services;

import com.greenfox.reddit.models.Post;

public interface PostService {

    Iterable<Post> findAll();

    void savePost(String title, String url);

    void upvote(Long id);

    void downvote(Long id);
}

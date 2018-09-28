package com.greenfox.reddit.services;

import com.greenfox.reddit.models.Post;

public interface PostService {

    Iterable<Post> findAll();
}

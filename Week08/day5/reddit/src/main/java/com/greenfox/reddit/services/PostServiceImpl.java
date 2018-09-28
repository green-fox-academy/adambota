package com.greenfox.reddit.services;

import com.greenfox.reddit.models.Post;
import com.greenfox.reddit.repositories.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Iterable<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Iterable<Post> findAllByOrderByScoreDesc() {
        return postRepository.findAllByOrderByScoreDesc();
    }

    @Override
    public void savePost(String title, String url) {
        Post post = new Post(title, url);
        postRepository.save(post);
    }

    @Override
    public void upvote(Long id) {
        if (postRepository.findById(id).isPresent()) {
            Post post = postRepository.findById(id).get();
            post.setScore(post.getScore() + 1);
            postRepository.save(post);
        }
    }

    @Override
    public void downvote(Long id) {
        if (postRepository.findById(id).isPresent()) {
            Post post = postRepository.findById(id).get();
            post.setScore(post.getScore() - 1);
            postRepository.save(post);
        }
    }
}

package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private List<Post> posts = new ArrayList<Post>(Arrays.asList(
                    new Post(0L,"The tiger silently stalked its prey.", new Date()),
                    new Post(1L,"The dolphin gracefully leaped through the waves.", new Date()),
                    new Post(2L,"The owl hooted softly in the night.", new Date()))
    );

    public void create(String text) {
        posts.add(new Post((long) posts.size(), text, new Date()));
    }

    public List<Post> listAllPosts() {
        return posts;
    }
}

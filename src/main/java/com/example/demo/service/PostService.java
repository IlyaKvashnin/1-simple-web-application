package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        return List.of(
                new Post("The majestic lion roams freely across the African savannah, exuding strength and elegance."),
                new Post("The playful dolphins leap and spin in the crystal-clear waters, delighting onlookers with their acrobatics."),
                new Post("The agile cheetah, known as the fastest land animal, gracefully hunts its prey on the vast plains.")
        );
    }
}

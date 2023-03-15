package com.myLearnings.security.service;

import com.myLearnings.security.payload.PostDto;
import com.myLearnings.security.payload.PostResponse;


public interface PostService {

    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);
}

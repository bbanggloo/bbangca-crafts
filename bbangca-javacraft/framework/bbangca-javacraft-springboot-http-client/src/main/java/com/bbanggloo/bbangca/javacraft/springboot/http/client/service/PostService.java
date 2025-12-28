package com.bbanggloo.bbangca.javacraft.springboot.http.client.service;

import java.util.List;

import com.bbanggloo.bbangca.javacraft.springboot.http.client.dto.Post;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Slf4j
@Service
@RequiredArgsConstructor
public class PostService {

	private final RestClient restClient;

	public List<Post> getAllPosts() {
		log.info("Fetching all posts");
		return this.restClient.get()
				.uri("/posts")
				.retrieve()
				.body(new ParameterizedTypeReference<>() {});
	}

	public Post getPostById(Long id) {
		log.info("Fetching post with id: {}", id);
		return this.restClient.get()
				.uri("/posts/{id}", id)
				.retrieve()
				.body(Post.class);
	}

	public Post createPost(Post post) {
		log.info("Creating post: {}", post);
		return this.restClient.post()
				.uri("/posts")
				.body(post)
				.retrieve()
				.body(Post.class);
	}

	public Post updatePost(Long id, Post post) {
		log.info("Updating post with id: {}", id);
		return this.restClient.put()
				.uri("/posts/{id}", id)
				.body(post)
				.retrieve()
				.body(Post.class);
	}

	public void deletePost(Long id) {
		log.info("Deleting post with id: {}", id);
		this.restClient.delete()
				.uri("/posts/{id}", id)
				.retrieve()
				.toBodilessEntity();
	}
}
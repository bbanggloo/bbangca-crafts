package com.bbanggloo.bbangca.javacraft.springboot.http.client.controller;

import java.util.List;

import com.bbanggloo.bbangca.javacraft.springboot.http.client.dto.Post;
import com.bbanggloo.bbangca.javacraft.springboot.http.client.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {

	private final PostService postService;

	@GetMapping
	public ResponseEntity<List<Post>> getAllPosts() {
		log.info("GET /api/posts - 모든 게시글 조회 요청");
		List<Post> posts = this.postService.getAllPosts();
		return ResponseEntity.ok(posts);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Post> getPostById(@PathVariable Long id) {
		log.info("GET /api/posts/{} - 게시글 조회 요청", id);
		Post post = this.postService.getPostById(id);
		return ResponseEntity.ok(post);
	}

	@PostMapping
	public ResponseEntity<Post> createPost(@RequestBody Post post) {
		log.info("POST /api/posts - 게시글 생성 요청: {}", post.getTitle());
		Post createdPost = this.postService.createPost(post);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdPost);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Post> updatePost(@PathVariable Long id, @RequestBody Post post) {
		log.info("PUT /api/posts/{} - 게시글 수정 요청", id);
		Post updatedPost = this.postService.updatePost(id, post);
		return ResponseEntity.ok(updatedPost);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletePost(@PathVariable Long id) {
		log.info("DELETE /api/posts/{} - 게시글 삭제 요청", id);
		this.postService.deletePost(id);
		return ResponseEntity.noContent().build();
	}
}
package com.ssm.sbdocker.ctrl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/docker")
public class DockerCtrl {

	@GetMapping()
	public ResponseEntity<String> testEndpoint() {
		return ResponseEntity.ok("Hit Success...");
	}
	
	@PostMapping("/body")
	public ResponseEntity<Object> testPostEndpoint(@RequestBody Object object){
		return ResponseEntity.ok(object);
	}
 }

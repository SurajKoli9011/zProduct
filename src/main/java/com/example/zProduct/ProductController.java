package com.example.zProduct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/check")
public class ProductController {
	@GetMapping(path="/guru")
	public String check()
	{
		return "CR7 GOAT fhtfjyfjfu";
	}
}

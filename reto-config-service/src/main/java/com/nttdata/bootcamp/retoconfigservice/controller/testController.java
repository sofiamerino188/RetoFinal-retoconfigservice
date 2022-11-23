package com.nttdata.bootcamp.retoconfigservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class testController {
	
	@Value("${valores.valores-name}")
	private String valor;
	
	@GetMapping(path="/getValor")
	public String getvalor() {
		return this.valor;
	}
}

package com.marathon.demo.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/consulta")
public class ConsultaRuc {
	
	@GetMapping (value="/info/{ruc}",produces = MediaType.APPLICATION_JSON_VALUE)
	public String saludo(@PathVariable("ruc")String ruc) {
	System.out.println(ruc);
		return new RestTemplate().getForObject("http://wsruc.com/Ruc2WS_JSON.php?tipo=2&ruc="+ruc+"&token=cXdlcnR5bGFtYXJja19zYUBob3RtYWlsLmNvbXF3ZXJ0eQ==" ,String.class);
	}

}

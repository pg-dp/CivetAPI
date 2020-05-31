package org.diceresearch.civetWebService;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class Controller {
	
	@PostMapping("/uploadFile")
    public int uploadFile(@RequestParam("file") MultipartFile file, @RequestParam String dataset) throws IOException {
		Model model = ModelFactory.createDefaultModel();
		model.read( new ByteArrayInputStream( file.getBytes() ), null, "TTL" );
		String datasetUri = new String(dataset.getBytes(), StandardCharsets.UTF_8);
		return compute(model, datasetUri);
	}
	
	public int compute(Model model, String datasetUri) {
		return 5;
	}
}

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

/*
 * This is the demo spring boot rest controller for reading RDF model and datasetUri
 * sent from postman and process them for metrics and return the star.
 * 
 * @author Aamir Mohammed
 * */

@RestController
public class DemoController {

	// Post method for loading model and datasetUri
	@PostMapping("/uploadFile")
	public int uploadFile(@RequestParam("file") MultipartFile file, @RequestParam String dataset) throws IOException {
		Model model = ModelFactory.createDefaultModel();
		model.read(new ByteArrayInputStream(file.getBytes()), null, "TTL");
		String datasetUri = new String(dataset.getBytes(), StandardCharsets.UTF_8);
		return compute(model, datasetUri);
	}

	public int compute(Model model, String datasetUri) {
		return 5;
	}
}

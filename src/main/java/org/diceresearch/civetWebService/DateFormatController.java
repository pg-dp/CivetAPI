package org.diceresearch.civetWebService;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * This is a spring boot rest controller for reading RDF model and datasetUri
 * sent from postman and the returned result will be evaluated metric star.
 * 
 * @author Aamir Mohammed
 * 
 */

@RestController
public class DateFormatController {

	@PostMapping("/uploadFile")
	public int uploadFile(@RequestParam("file") MultipartFile file, @RequestParam String dataSet) throws Exception {
		Model model = ModelFactory.createDefaultModel();
		model.read(new ByteArrayInputStream(file.getBytes()), null, "TTL");
		String datasetUri = new String(dataSet.getBytes(), StandardCharsets.UTF_8);
		DateFormatMetric metric = new DateFormatMetric();
		return metric.compute(model, datasetUri);
	}
}

package org.diceresearch.civetWebService;

import org.apache.jena.rdf.model.Model;
import org.dice_research.opal.civet.TestData;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.multipart.MultipartFile;

public class MetricsControllerTest {

	TestData testdata;
	final String MODEL = "modeltest.ttl";
	Model model;

	@Before
	public void setUp() throws Exception {
		testdata = new TestData();
		model = testdata.getModel(MODEL);
	}

	@Test
	public void checkUploadFileDateFormat() throws Exception {

		MetricsController metric = new MetricsController();
		Integer stars = metric.uploadFileDateFormat((MultipartFile) model,
				"http://projekt-opal.de/dataset/_mcloudde_berlinelektro-ladestationeninberlin");
		Assert.assertEquals("Check received response is stars or not", 0, stars.intValue());
	}

	@Test
	public void checkUploadFileDescription() throws Exception {

		MetricsController metric = new MetricsController();
		Integer stars = metric.uploadFileDescription((MultipartFile) model,
				"http://projekt-opal.de/dataset/_mcloudde_berlinelektro-ladestationeninberlin");
		Assert.assertEquals("Check received response is stars or not", 0, stars.intValue());
	}

}

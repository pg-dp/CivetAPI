package org.diceresearch.civetWebService;

import org.diceresearch.civetWebService.metricsController.MetricsController;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * This  class implements test cases for the spring boot rest controller for
 * reading RDF model and datasetUri sent from postman and the returned
 * result will be evaluated metric star. Testing is done by using JUnit
 * framework and checking expected value against actual value.
 *
 * @author Amit Kumar
 */

@SpringBootTest
class CivetWebServiceApplicationTests {
    MetricsController objContoller = new MetricsController();
    String contentType = "text/plain";
    byte[] content = null;
    Path path;
    String dataset;
    MultipartFile file;

    @Test
    public void testTimelinessMetric() throws Exception {
        dataset = "http://projekt-opal.de/dataset/https___europeandataportal_eu_set_data_de6f2062_c0f9_4bb3_858d" +
                "_d722250b322b";
        path = Paths.get("src/test/resources/TestTimelinessMetric.ttl");

        try {
            content = Files.readAllBytes(path);
        } catch (final IOException e) {

        }
        file = new MockMultipartFile("TestTimelinessMetric.ttl", "TestTimelinessMetric.ttl",
                contentType, content);
        Assert.assertEquals(3, objContoller.uploadFileTimelinessMetric(file, dataset));
    }

    @Test
    public void testUpdateRateMetric() throws Exception {
        dataset = "http://projekt-opal.de/dataset/https___europeandataportal_eu_set_data_de68f4fc_2886_4775_" +
                "9537_2bf21d81dff7";
        path = Paths.get("src/test/resources/TestUpdaterateMetric.ttl");

        try {
            content = Files.readAllBytes(path);
        } catch (final IOException e) {
        }

        file = new MockMultipartFile("TestUpdaterateMetric.ttl", "TestUpdaterateMetric.ttl",
                contentType, content);
        Assert.assertEquals(3, objContoller.uploadFileUpdateRateMetric(file, dataset));

    }

    @Test
    public void testVersionMetric() throws Exception {
        dataset = "http://projekt-opal.de/dataset/https___europeandataportal_eu_set_data_f368cc99_e791_47b4_" +
                "ba4f_5c148140d00e";
        path = Paths.get("src/test/resources/TestVersioningMetric.ttl");

        try {
            content = Files.readAllBytes(path);
        } catch (final IOException e) {

        }
        file = new MockMultipartFile("TestVersioningMetric.ttl", "TestVersioningMetric.ttl",
                contentType, content);
        Assert.assertEquals(5, objContoller.uploadFileVersionMetric(file, dataset));
    }

    @Test
    public void testAccessibilityMetric() throws Exception {
        dataset = "http://projekt-opal.de/dataset/https___europeandataportal_eu_set_data_bp_2015_ville_de_rennes" +
                "_budget_principal_par_sous_fonctions";
        path = Paths.get("src/test/resources/TestAccessibilityMetric.ttl");

        try {
            content = Files.readAllBytes(path);
        } catch (final IOException e) {

        }
        file = new MockMultipartFile("TestAccessibilityMetric.ttl", "TestAccessibilityMetric.ttl",
                contentType, content);
        Assert.assertEquals(0, objContoller.uploadFileAccessibilityMetric(file, dataset));
    }

    @Test
    public void testProviderIdentityMetric() throws Exception {
        dataset = "http://projekt-opal.de/dataset/https___ckan_govdata_de_34a3e19c_323f_474a_b21b_b03be924093a";
        path = Paths.get("src/test/resources/TestDataProviderIdentityMetric.ttl");

        try {
            content = Files.readAllBytes(path);
        } catch (final IOException e) {

        }
        file = new MockMultipartFile("TestDataProviderIdentityMetric.ttl",
                "TestDataProviderIdentityMetric.ttl", contentType, content);
        Assert.assertEquals(3, objContoller.uploadFileProviderIdentity(file, dataset));
    }

    @Test
    public void testReadabilityMetric() throws Exception {
        dataset = "http://projekt-opal.de/dataset/https___europeandataportal_eu_set_data_designated_" +
                "neighbourhood_plan_areas49";
        path = Paths.get("src/test/resources/TestReadabilityMetric.ttl");

        try {
            content = Files.readAllBytes(path);
        } catch (final IOException e) {

        }
        file = new MockMultipartFile("TestReadabilityMetric.ttl", "TestReadabilityMetric.ttl",
                contentType, content);
        Assert.assertEquals(3, objContoller.uploadFileReadabilityMetric(file, dataset));
    }

    @Test
    public void testContactClassicMetric() throws Exception {
        dataset = "http://projekt-opal.de/dataset/https___europeandataportal_eu_set_data_btopoctettehhn_" +
                "pa3ttopedntejin_c_biodxet_b_obwnha_bopobo";
        path = Paths.get("src/test/resources/TestContactClassicInformationMetric.ttl");

        try {
            content = Files.readAllBytes(path);
        } catch (final IOException e) {

        }
        file = new MockMultipartFile("TestContactClassicInformationMetric.ttl",
                "TestContactClassicInformationMetric.ttl", contentType, content);
        Assert.assertEquals(2, objContoller.uploadFileContactClassicMetric(file, dataset));
    }

    @Test
    public void testFileContactEmailMetric() throws Exception {
        dataset = "http://projekt-opal.de/dataset/https___europeandataportal_eu_set_data_pr_aspro_00001_" +
                "20170127_120846_ds10";
        path = Paths.get("src/test/resources/TestContactEmailsMetric.ttl");

        try {
            content = Files.readAllBytes(path);
        } catch (final IOException e) {

        }
        file = new MockMultipartFile("TestContactEmailsMetric.ttl", "TestContactEmailsMetric.ttl",
                contentType, content);
        Assert.assertEquals(2, objContoller.uploadFileContactEmailMetric(file, dataset));
    }

    @Test
    public void testContactURLMetric() throws Exception {
        dataset = "http://projekt-opal.de/dataset/https___europeandataportal_eu_set_data_btopoctettehhn" +
                "_pa3ttopedntejin_c_biodxet_b_obwnha_bopobo";
        path = Paths.get("src/test/resources/TestContactURL.ttl");

        try {
            content = Files.readAllBytes(path);
        } catch (final IOException e) {

        }
        file = new MockMultipartFile("TestContactURL.ttl", "TestContactURL.ttl", contentType,
                content);
        Assert.assertEquals(0, objContoller.uploadFileContactURLMetric(file, dataset));
    }


    @Test
    public void testDataFormatMetric() throws Exception {
        dataset = "http://projekt-opal.de/dataset/https___europeandataportal_eu_set_data_birth_registrations_" +
                "by_month_since_january_2009_to_june_2011";
        path = Paths.get("src/test/resources/TestDataFormatMetric.ttl");

        try {
            content = Files.readAllBytes(path);
        } catch (final IOException e) {

        }
        file = new MockMultipartFile("TestDataFormatMetric.ttl", "TestDataFormatMetric.ttl",
                contentType, content);
        Assert.assertEquals(3, objContoller.uploadFileDataFormatMetric(file, dataset));
    }

    @Test
    public void testDateFormat() throws Exception {
        dataset = "http://projekt-opal.de/dataset/_mcloudde_vieljhrlicheraster" +
                "desmittlerenvegetationsbeginnsindeutschland";
        path = Paths.get("src/test/resources/TestDateFormatMetric.ttl");

        try {
            content = Files.readAllBytes(path);
        } catch (final IOException e) {

        }

        file = new MockMultipartFile("TestDateFormatMetric.ttl", "TestDateFormatMetric.ttl",
                contentType, content);
        Assert.assertEquals(5, objContoller.uploadFileDateFormat(file, dataset));
    }

    @Test
    public void testDescription() throws Exception {
        dataset = "http://projekt-opal.de/dataset/_mcloudde_vieljhrlicherasterdesmittlerenvegetationsbeginnsindeutschland";
        path = Paths.get("src/test/resources/TestDescriptionMetric.ttl");

        try {
            content = Files.readAllBytes(path);
        } catch (final IOException e) {

        }

        file = new MockMultipartFile("TestDescriptionMetric.ttl", "TestDescriptionMetric.ttl",
                contentType, content);
        Assert.assertEquals(4, objContoller.uploadFileDescription(file, dataset));
    }

    @Test
    public void testLicensesMetric() throws Exception {
        dataset = "http://projekt-opal.de/dataset/https___europeandataportal_eu_set_data_brownfield" +
                "_land_register_blackburn_with_darwen";
        path = Paths.get("src/test/resources/TestDataLicensesMetric.ttl");

        try {
            content = Files.readAllBytes(path);
        } catch (final IOException e) {

        }

        file = new MockMultipartFile("TestDataLicensesMetric.ttl",
                "TestDataLicensesMetric.ttl", contentType, content);
        Assert.assertEquals(5, objContoller.uploadFileLicensesMetric(file, dataset));
    }

    @Test
    public void testLanguageErrorMetric() throws Exception {
        dataset = "http://projekt-opal.de/dataset/https___" +
                "europeandataportal_eu_set_data_14f6d44d_c5d4_5225_96d9_f42a0879c8f1";
        path = Paths.get("src/test/resources/TestDataLanguageErrorMetric.ttl");

        try {
            content = Files.readAllBytes(path);
        } catch (final IOException e) {

        }

        file = new MockMultipartFile("TestDataLanguageErrorMetric.ttl",
                "TestDataLanguageErrorMetric.ttl", contentType, content);
        Assert.assertEquals(3, objContoller.uploadFileLanguageErrorMetric(file, dataset));
    }

}
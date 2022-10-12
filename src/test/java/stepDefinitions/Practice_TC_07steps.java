package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.Driver;

public class Practice_TC_07steps {
    @Given("Tarayıcıyı başlatarak {string} url'sine gidin")
    public void tarayıcıyı_başlatarak_url_sine_gidin(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);
    }
    @Then("Ana sayfanın başarıyla görünür olduğunu doğrulayın")
    public void ana_sayfanın_başarıyla_görünür_olduğunu_doğrulayın() {
    String homeUrl = "http://automationexercise.com";
        Assert.assertEquals("homeUrl esit degil",Driver.getDriver().getCurrentUrl(),homeUrl);
    }
    @Then("Test Case buttonu na tıklayın")
    public void test_case_buttonu_na_tıklayın() {
    }
    @Then("Kullanıcının test case sayfasına başarıyla yönlendirildiğini doğrulayın")
    public void kullanıcının_test_case_sayfasına_başarıyla_yönlendirildiğini_doğrulayın() {
    }
    @Then("İlgili sayfanın ekran görüntüsünü alın")
    public void ilgili_sayfanın_ekran_görüntüsünü_alın() {
    }


}

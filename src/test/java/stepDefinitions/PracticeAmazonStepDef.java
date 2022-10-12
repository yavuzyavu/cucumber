package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import pages.PracticeAmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class PracticeAmazonStepDef {

    PracticeAmazonPage practiceAmazonPage =new PracticeAmazonPage();
    //Faker faker = new Faker();

    @Given("kullanici Amazon web sitesine gider")
    public void kullanici_amazon_web_sitesine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @When("sign in butonuna tiklar")
    public void sign_in_butonuna_tiklar() {
practiceAmazonPage.signinButton.click();
    }
    @When("faker kullanarak e-posta gonderir")
    public void faker_kullanarak_e_posta_gonderir() {
        practiceAmazonPage.emailBox.sendKeys(Faker.instance().internet().emailAddress());


    }
    @When("gonderdigi e-postanin ekran goruntusunu alir")
    public void gonderdigi_e_postanin_ekran_goruntusunu_alir() {

    }
    @When("continiue'a tiklar")
    public void continiue_a_tiklar() {

    }
    @Then("There was a problem mesajini dogrular")
    public void there_was_a_problem_mesajini_dogrular() {

    }
    @Then("Need help e tiklar")
    public void need_help_e_tiklar() {

    }
    @Then("forgot your password e tiklar")
    public void forgot_your_password_e_tiklar() {

    }
    @Then("Password assistance metnini dogrular")
    public void password_assistance_metnini_dogrular() {

    }
    @Then("Geri gider")
    public void geri_gider() {

    }
    @Then("Create your account butonuna tiklar")
    public void create_your_account_butonuna_tiklar() {
        practiceAmazonPage.createYourAccountButton.click();
    }
    @Then("Create account metnini dogrular")
    public void create_account_metnini_dogrular() {

    }

}

package medunna.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import medunna.utilities.ConfigReader;
import medunna.utilities.Driver;

public class MedunnaRegisterStepDefinitions {

    MedunnaRegisterStepDefinitions medunnaRegister = new MedunnaRegisterStepDefinitions();
    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String Url) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @When("kullanici user iconuna tiklar")
    public void kullaniciUserIconunaTiklar() {

    }

    @And("kullanici Register butonuna tiklar")
    public void kullaniciRegisterButonunaTiklar() {
    }

    @And("kullanici registration sayfasinin acildigini dogrular")
    public void kullaniciRegistrationSayfasininAcildiginiDogrular() {
    }

    @And("kullanici SSN bilgisini girer")
    public void kullaniciSSNBilgisiniGirer() {
    }

    @And("kullanici First Name bilgisini girer")
    public void kullaniciFirstNameBilgisiniGirer() {
    }

    @And("kullanici Last Name bilgisini girer")
    public void kullaniciLastNameBilgisiniGirer() {
    }

    @And("kullanici Username bilgisini girer")
    public void kullaniciUsernameBilgisiniGirer() {
    }

    @And("kullanici Email bilgisini girer")
    public void kullaniciEmailBilgisiniGirer() {
    }

    @And("kullanici New Password bilgisini girer")
    public void kullaniciNewPasswordBilgisiniGirer() {
    }

    @And("kullanici New Password Confirmation bilgisini girer")
    public void kullaniciNewPasswordConfirmationBilgisiniGirer() {
    }

    @Then("kullanici Registiration saved yazisinin gorundugunu dogrular")
    public void kullaniciRegistirationSavedYazisininGorundugunuDogrular() {
    }

    @And("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int arg0) {
    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
    }


}

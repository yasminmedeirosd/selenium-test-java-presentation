package StepDefinitions
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObject.BasePage;
import pageObject.PesquisaPage;


/**
 * Teste de Pesquisar Sala
 */
public class PesquisarSala_test extends BaseTest{

    PesquisaPage pesquisaPage = new PesquisaPage(driver,wait);

    @Given("^que estou na home do Bate-Papo UOL$");
    public void que_estou_na_home_do_Bate_Papo_UOL() {
        GoToBatePapoUOL();
    }

    @Given("^eu digito \"([^\"]*)\" no campo de pesquisa$");
    public void eu_digito_no_campo_de_pesquisa(String sala) {
       pesquisaPage.InsertNameRoom(sala);
    }

    @When("^eu clico no botão de pesquisar$");
    public void eu_clico_no_botão_de_pesquisar() {
        pesquisaPage.ClickButtonSearch();
    }

    @Then("^eu vejo a \"([^\"]*)\"amizade\"([^\"]*)\" que a pesquisa foi feita$");
    public void eu_vejo_a_amizade_que_a_pesquisa_foi_feita(String messageSearch) {
       pesquisaPage.VerifyMessageValidSearch(messageSearch);
    }

    @Then("^eu vejo o \"([^\"]*)\" da minha pesquisa$");
    public void eu_vejo_o_da_minha_pesquisa(String resultSearchText) {
      pesquisaPage.VerifyValidRoomName(resultSearchText);
    }

    @Then("^eu vejo a \"([^\"]*)\"amizade(\\d+)\"([^\"]*)\" que a pesquisa foi feita com termo inválido$");
    public void eu_vejo_a_amizade_que_a_pesquisa_foi_feita_com_termo_inválido(String invalidMessage) {
        pesquisaPage.VerifyInvalidRoomName(invalidMessage);
    }

}

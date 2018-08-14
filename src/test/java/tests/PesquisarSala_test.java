package tests;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.PesquisaPage;

public class PesquisarSala_test extends BaseTest {

        WebDriverWait wait;
        PesquisaPage pesquisaPage = new PesquisaPage(driver, wait);

        @Given("^que estou na home do Bate-Papo UOL$")
        public void que_estou_na_home_do_Bate_Papo_UOL()  {

            GoToBatePapoUOL();

        }

        @Given("^eu digito \"([^\"]*)\" no campo de pesquisa$")
        public void eu_digito_no_campo_de_pesquisa(String sala) {
            pesquisaPage.InsertNameRoom(sala);
        }

        @When("^eu clico no botão de pesquisar$")
        public void eu_clico_no_botão_de_pesquisar() {

            pesquisaPage.ClickButtonSearch();
        }

        @Then("^eu vejo a \"(.*)\" que a pesquisa foi feita$")
        public void eu_vejo_a_amizade_que_a_pesquisa_foi_feita(String messageSearch) {
            pesquisaPage.VerifyMessageValidSearch(messageSearch);
        }

        @Then("^eu vejo o \"(.*)\" da minha pesquisa$")
        public void eu_vejo_o_da_minha_pesquisa(String resultSearchText) {
            pesquisaPage.VerifyValidRoomName(resultSearchText);
        }

        @Then("^eu vejo a \"(.*)\" que a pesquisa foi feita com termo inválido$")
        public void eu_vejo_a_amizade_que_a_pesquisa_foi_feita_com_termo_inválido(String invalidMessage) {
            pesquisaPage.VerifyInvalidRoomName(invalidMessage);
        }

    }

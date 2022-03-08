package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.lang.reflect.Type;
import java.util.List;

public class DataTableSteps {
    @Given("user is on NambaFood")
    public void user_is_on_namba_food() {
        System.out.println("user is on NambaFood");
        
    }
    @When("user clicks on Foods")
    public void user_clicks_on_foods() {
        System.out.println("user clicks Foods button");
        
    }
    @Then("user should find Sushi category")
    public void user_should_find_sushi_category() {
        System.out.println("user found Sushi");
        
    }
    @When("user click on Sushi")
    public void user_click_on_sushi() {
        System.out.println("user clicks on Sushi");
        
    }
    @Then("user should see List of cafes")
    public void user_should_see_list_of_cafes() {
        System.out.println("user see cafes");
        
    }
    @Then("user scroll down the page to Arigato cafe")
    public void user_scroll_down_the_page_to_arigato_cafe() {
        System.out.println("user scroll down to Arigato");
        
    }
    @When("user click on Arigato")
    public void user_click_on_arigato() {
        System.out.println("user clicked on Arigato");
        
    }
    @Then("user should see Arigato menu")
    public void user_should_see_arigato_menu() {
        System.out.println("user see Arigato menu");
        
    }
    @Then("user should find Kimchi")
    public void user_should_find_kimchi() {
        System.out.println("user find Kimchi");
        
    }
    @When("user increase Kimchi amount to {int}")
    public void user_increase_kimchi_amount_to(Integer KimchiAmount) {
        System.out.println("user increase Kimchi amount to:"+KimchiAmount);
        
    }
    @When("user should click on Order button")
    public void user_should_click_on_order_button() {
        System.out.println("user clicked on Order button");
        
    }
    @Then("on the Card user should see\"{int}$\"")
    public void on_the_card_user_should_see_$(Integer totalPriceAmount) {
        System.out.println("TotalPrice"+totalPriceAmount);
        
    }
/// Second Scenario
    @Given("user is on {string}")
    public void user_is_on(String URL) {
        System.out.println("user is on"+URL);

    }
    @Then("following menu bar should be displayed on Home page")
    public void following_menu_bar_should_be_displayed_on_home_page(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> data = dataTable.asLists((Type) String.class);
        System.out.println(data.get(0).get(1));

    }


}

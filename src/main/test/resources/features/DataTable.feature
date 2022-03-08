@Smoke

Feature: Data Table practise

  Scenario: Order Kimchi from Arigato
    Given user is on NambaFood
    When  user clicks on Foods
    Then  user should see "250 best cafe"
    And  user should find Sushi category
    When  user click on Sushi
    Then  user should see List of cafes
    And  user scroll down the page to Arigato cafe
    When  user click on Arigato
    Then user should see Arigato menu
    And user should find Kimchi
    When  user increase Kimchi amount to 3
    And user should click on Order button
    Then on the Card user should see"450$"

    Scenario: Verify following tabs are displayed in Amazon
      Given  user is on "https://www.amazon.com/"
      Then following menu bar should be displayed on Home page
      |All| Today's Deal| Customer Service | Registry| Gift Cards | Sell |


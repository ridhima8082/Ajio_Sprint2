Feature: Ajio Customization

  Scenario: Verify that the user can be able to select a product from Men's Category
    Given the user navigates to the homepage
    When the user click on the option to display categories in Men's section
    Then the brands and offers under men's section to be displayed.


  Scenario: Verify that the user can be able to select a product from Women's Category
    Given the user navigates to the ajio_homepage
    When the user click on the option to display categories in Women's section
    Then the brands and offers under women's section to be displayed.


  Scenario: Verify that the user is able to select a particular brand from Men's Category
    Given the user navigates to the men's category page
    When the user selects particular brand from men's category
    Then the products from men's section of the particular brand gets displayed

  Scenario: Verify that the user is able to select a particular brand from Women's Category
    Given the user navigates to the women's category page
    When the user selects particular brand from women's category
    Then the products from women's section of the particular brand gets displayed

  Scenario: Verify that the user is able to select the product of the particular brand selected from men's category
    Given the user navigates to the page of men's category
    When the user selects particular brand from men's section
    And the user selects particular product from the brand in men's section
    Then the product page gets displayed

  Scenario: Verify that the user is able to select the product of the particular brand selected from women's category
    Given the user navigates to the page of women's category
    When the user selects particular brand from women's section
    And the user selects particular product from the brand in women's section
    Then the product page gets displayed to user

  Scenario: Verify that the user can be able to select a product from Kidss Category
    Given the user navigates to the ajio homepage
    When the user click on the option to display categories in Kidss section
    Then the brands and offers under Kids section to be displayed.
  @smoke
  Scenario Outline: User should be able to search two products
    Given the user navigates to the homepage of ajio
    When the user clicks on searchbar
    And and user enters "<product1>"
    Then "<EMessage>" gets displayed
    Examples:
    | product1 |     | EMessage              |
    | jeans    |     | Items found           |
    | bags     |     | Items found           |






# Autor:LeidyFernandez
@stories
Feature: Academy Choucair
  As a user, I want to be able to add products to my shopping cart
  @scenario1
  Scenario: Add automated product to shopping cart
    Given Given Rose wants to add products to his cart
      |strEmail               |strPassword |
      |vanesa089-8@hotmail.com|Choucair1*  |

    When she adds a product when adding to cart

    Then She has the product in her shopping cart
  @scenario2
  Scenario: Add automated product to shopping cart as page visitor
    Given  Rose wants to add products to her cart without having an account on the platform
    When she adds a product when adding to carthaving an account on the platform

    Then she has the product in her shopping cart even though she is registered
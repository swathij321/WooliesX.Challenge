$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/wooliesx/challenge/features/OrdersFeature.feature");
formatter.feature({
  "name": "Order creation",
  "description": "\tIn order to make an order\n\tAs a shopping cart user\n\tI want to be able to add 2 items to the cart and place an order",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "I want to be able to add 2 items to the cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CartTest"
    }
  ]
});
formatter.step({
  "name": "I am on the My Account page and click the menu Women",
  "keyword": "Given "
});
formatter.step({
  "name": "I select the \u003cproduct\u003e from catalog and click on it",
  "keyword": "When "
});
formatter.step({
  "name": "I click Add to cart button at the details page",
  "keyword": "And "
});
formatter.step({
  "name": "Click Proceed to checkout button at the modal dialog",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product"
      ]
    },
    {
      "cells": [
        "Faded Short Sleeve T-shirts"
      ]
    },
    {
      "cells": [
        "Printed Chiffon Dress"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the Landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_am_on_the_Landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click sign in link and Go to Sign In page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_click_sign_in_link_and_Go_to_Sign_In_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid email address \"swathi.jolla@automationpractice.com\" and password \"automationpractice.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_enter_valid_email_address_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "I want to be able to add 2 items to the cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CartTest"
    }
  ]
});
formatter.step({
  "name": "I am on the My Account page and click the menu Women",
  "keyword": "Given "
});
formatter.match({
  "location": "CartSteps.i_am_on_the_My_Account_page_and_click_the_menu_Women()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the Faded Short Sleeve T-shirts from catalog and click on it",
  "keyword": "When "
});
formatter.match({
  "location": "CartSteps.i_select_the_from_catalog_and_click_on_it(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Add to cart button at the details page",
  "keyword": "And "
});
formatter.match({
  "location": "CartSteps.i_click_Add_to_cart_button_at_the_details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Proceed to checkout button at the modal dialog",
  "keyword": "And "
});
formatter.match({
  "location": "CartSteps.click_Proceed_to_checkout_button_at_the_modal_dialog()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the Landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_am_on_the_Landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click sign in link and Go to Sign In page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_click_sign_in_link_and_Go_to_Sign_In_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid email address \"swathi.jolla@automationpractice.com\" and password \"automationpractice.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_enter_valid_email_address_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "I want to be able to add 2 items to the cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CartTest"
    }
  ]
});
formatter.step({
  "name": "I am on the My Account page and click the menu Women",
  "keyword": "Given "
});
formatter.match({
  "location": "CartSteps.i_am_on_the_My_Account_page_and_click_the_menu_Women()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the Printed Chiffon Dress from catalog and click on it",
  "keyword": "When "
});
formatter.match({
  "location": "CartSteps.i_select_the_from_catalog_and_click_on_it(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Add to cart button at the details page",
  "keyword": "And "
});
formatter.match({
  "location": "CartSteps.i_click_Add_to_cart_button_at_the_details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Proceed to checkout button at the modal dialog",
  "keyword": "And "
});
formatter.match({
  "location": "CartSteps.click_Proceed_to_checkout_button_at_the_modal_dialog()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I am on the Landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_am_on_the_Landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click sign in link and Go to Sign In page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_click_sign_in_link_and_Go_to_Sign_In_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid email address \"swathi.jolla@automationpractice.com\" and password \"automationpractice.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_enter_valid_email_address_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "I want to be able to place an order with 2 items in the cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@OrderTest"
    }
  ]
});
formatter.step({
  "name": "I am on the My Account page and click the cart icon",
  "keyword": "Given "
});
formatter.match({
  "location": "OrdersSteps.i_am_on_the_My_Account_page_and_click_the_cart_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Proceed to checkout button at the cart details page",
  "keyword": "When "
});
formatter.match({
  "location": "OrdersSteps.click_Proceed_to_checkout_button_at_the_cart_details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Proceed to checkout button at the address page",
  "keyword": "And "
});
formatter.match({
  "location": "OrdersSteps.click_Proceed_to_checkout_button_at_the_address_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the Terms of service checkbox at the shipping page and click Proceed to checkout button",
  "keyword": "And "
});
formatter.match({
  "location": "OrdersSteps.select_the_Terms_of_service_checkbox_at_the_shipping_page_and_click_Proceed_to_checkout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the Pay by bank wire button at the payment page",
  "keyword": "And "
});
formatter.match({
  "location": "OrdersSteps.click_on_the_Pay_by_bank_wire_button_at_the_payment_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the I confirm my order button at the order summary page",
  "keyword": "And "
});
formatter.match({
  "location": "OrdersSteps.click_on_the_I_confirm_my_order_button_at_the_order_summary_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am able to see the order confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "OrdersSteps.i_am_able_to_see_the_order_confirmation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on sign out link to log out",
  "keyword": "And "
});
formatter.match({
  "location": "OrdersSteps.Click_on_sign_out_link_to_log_out()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@search
Feature: Shop items based on Search
 
 Background:

  @smoke @searchsmoke
  Scenario: Search of electronics items
   Given I am on the Home Page
    And enter search item "nikon" in the search box
    When I click on Search Button
    Then search details page to be displayed with search results
    When I click on the item in the search result page
    
#   Scenario Outline: Search of accessories 
#    Given I am on the Home Page
#    And enter search item "<items>" in the search box
#    When I click on Search Button
#    Then search details page to be displayed with search results
#    When I click on the item in the search result
    
#    Examples:
#    |items		|
#    |rayban		|
#    |canon		|
#    |nikon		|
    

 
Feature: Search Google

  Background:
    Given User visit google page

    @Google1
    Scenario: Simple Search Google
  #    Given User visit google page
      When User input search keyword
      Then User should see search result

    @Google2
    Scenario: Simple Search Google
    #    Given User visit google page
      When User input "Pertama" search
      When User input "Kedua" search
      When User input "Ketiga" search
      Then User should see search result

    @Google3
    Scenario Outline: Search Google with 3 keywords
  #    Given User visit google page
      When User input <keywords> in search field
      Then User should see search result

      Examples:
      |keywords|
      |Sekolah QA|
      |Cilsy     |
      |Testing   |
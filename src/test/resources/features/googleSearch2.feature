Feature: This is another google search

#  @Google2
  Scenario: Simple Search Google
    #    Given User visit google page
    When User input "Pertama" search
    When User input "Kedua" search
    When User input "Ketiga" search
    Then User should see search result
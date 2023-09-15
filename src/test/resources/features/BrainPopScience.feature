Feature: user able to play Tornadoes video

  Scenario: User able to select science, and access to the Forces of Nature
    When user should see the brainPop title
    And  User able to click science
    And user should able to see 16 Units in science units page
    And user click on Forces of Nature
    Then user should able to see 19 topics on Forces of Nature page
    Then user able to click on the topic Tornadoes
    And user should able to see Tornadoes-BrainPOP as title
    Then user should able to click on movie image icon
    Then user should able to click on play button
    And user perform various action with the movie player
    When user click on quiz after video
    Then user able to see Tornadoes Quiz - BrainPOP





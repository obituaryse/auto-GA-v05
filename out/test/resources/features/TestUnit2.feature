Feature: test from Person page

  Scenario: take test level 1, unit 2 listening comprehension
    Given enter the person page
    And click in element "Level 1"
    When start with the "Unit 2" and "Activity 1"
    And click in "concerts" option in question 1
    And click in the next view
    And click in "Latin Jam" option in question 2
    And click in the next view
    And click in "a blend of genres" option in question 3
    And click in the next view
    And click in "play" option in question 4
    And click in the next view
    And click in "$25.00" option in question 5
    And click in the next view
    And click in "two" option in question 5
    And click in the next view
    And click in "an author" option in question 6
    And click in the next view
    And click in "The Untouchable" option in question 7
    And click in the next view
    Then the test finished correctly with 100 points in test 1

  Scenario: take test level 1, unit 2 Reading Comprehension
    Given enter the person page
    And click in element "Level 1"
    When start with the "Unit 2" and "Activity 2"
    And click in "False" in question 1
    And click in the next view
    And click in "False" in question 2
    And click in the next view
    And click in "False" in question 3
    And click in the next view
    And click in "False" in question 4
    And click in the next view
    And click in "True" in question 5
    And click in the next view
    And click in "True" in question 6
    And click in the next view
    And click in "True" in question 7
    And click in the next view
    And click in "False" in question 8
    And click in the next view
    Then the test finished correctly with 100 points in test 1

  Scenario: take test level 1, unit 2 Grammar and Vocabulary
    Given enter the person page
    And click in element "Level 1"
    When start with the "Unit 2" and "Activity 3"
    And write in the question 1 the answer "at" and "at"
    And write in the question 2 the answer "In" and "in" and "on"
    And write in the question 3 the answer "at" and "on"
    And write in the question 4 the answer "at" and "in" and "in"
    And write in the question 5 the answer "in" and "in"
    And write in the question 6 the answer "at" and "in" and "at" and "in"
    Then click in button "Check Answers"
    And validate if the answers are correct
    And click in the next view page

  Scenario: take test level 1, unit 2 Activity 4 Grammar and Vocabulary
    Given enter the person page
    And click in element "Level 1"
    When start with the "Unit 2" and "Activity 4"
    And click in "False" in question 1
    And click in the next view
    And click in "False" in question 2
    And click in the next view
    And click in "True" in question 3
    And click in the next view
    And click in "False" in question 4
    And click in the next view
    And click in "True" in question 5
    And click in the next view
    And click in "True" in question 6
    And click in the next view
    Then the test finished correctly with 100 points in test 1
Feature: Funcionalidad pagina person

  Scenario: take test level 1, reading comprehension
    Given ingresar a la pagina person
    And click in element "Level 1"
    When start with the unit 2
    And click in "False" in question 1
    And click in the next view
    And click in "True" in question 2
    And click in the next view
    And click in "True" in question 3
    And click in the next view
    And click in "True" in question 4
    And click in the next view
    And click in "False" in question 5
    And click in the next view
    And click in "False" in question 6
    And click in the next view
    Then the test finished correctly with 100 points in test 1

  Scenario: take test level 1, Grammar and Vocabulary
    Given ingresar a la pagina person
    And click in element "Level 1"
    When start with the unit 3
    And select the option "a married woman" in question 1
    And click in the next view
    And select the option "family name" in question 2
    And click in the next view
    And select the option "nickname" in question 3
    And click in the next view
    And select the option "nationality" in question 4
    And click in the next view
    Then the test finished correctly with 100 points in test 2

  Scenario: take test level 1, activity 4 Grammar and Vocabulary
    Given ingresar a la pagina person
    And click in element "Level 1"
    When start with the unit 4
    And drap the element "He’s from Ireland." and drop in option "Where is he from?"
    And drap the element "He’s twenty-five." and drop in option "How old is he?"
    And drap the element "He’s a graphic designer." and drop in option "What’s his occupation?"
    And drap the element "His name’s Conner." and drop in option "Who’s that?"
    And drap the element "It’s Dublin." and drop in option "Where is he from?"
    Then click in button "Check Answers"
    And validate if the answers are correct
    And click in button Next

  Scenario: take test level 1, listen and comprension
    Given ingresar a la pagina person
    And click in element "Level 1"
    When start with the unit 1
    And drap the element "graphic designer" and drop in section "Fumiko Ito" in answer "occupation"
    And drap the element "Japanese" and drop in section "Fumiko Ito" in answer "nationality"
    And drap the element "musician" and drop in section "Lee Hyuk" in answer "occupation"
    And drap the element "Korean" and drop in section "Lee Hyuk" in answer "nationality"
    And down with the scroll bar
    And drap the element "computer programmer" and drop in section "Ilhan Ramic" in answer "occupation"
    And drap the element "Turkish" and drop in section "Ilhan Ramic" in answer "nationality"
    And drap the element "interpreter" and drop in section "Ana Gutierrez" in answer "occupation"
    And drap the element "Spanish" and drop in section "Ana Gutierrez" in answer "nationality"
    Then click in button "Check Answers"
    And validate if the answers are correct
    And click in button Next
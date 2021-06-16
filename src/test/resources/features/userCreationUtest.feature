# Autor: Jonathan Ferney Perafan Moreno
@stories
Feature: Technical Challenge Choucair
  As an applicant I want to pass the Choucair automation technical challenge, filling out the Utest.com form and creating a new user
  @scenario1
  Scenario: Scenario: Completion of the form and creation of user
    Given the Jonathan wants to pass the automation technical challenge of the Choucair company
    When he registers the user on the Utestcom platform
    | strFistName   | strLastName  | strEmail                 | strMonth  | strDay  | strYear  | strPassword |
    | Jonathan      | Perafan      | jonamoremore7634@gmail.com | August    | 12      | 1988     | Prueba1234* |

    Then register the user
    | strRegistration |
    | Welcome to the world's largest community of freelance software testers! |

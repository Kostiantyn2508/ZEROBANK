
@AccountSummary
Feature: AccountSummary

Background: User logs in as user with valid credentials

  @Summary
  Scenario: Account summary page should have the title Zero – Account summary
   Given Account summary page
    When User logs in as user with valid credentials
   Then Account summary page should have account types:
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |

    Then Credit Accounts table must have columns
      | Account     |
      | Credit Card |
      | Balance     |


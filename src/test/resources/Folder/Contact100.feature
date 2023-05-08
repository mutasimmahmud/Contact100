Feature: Demoblaze Contact page

@Jahan
Scenario: Contact page work

Given Open Demoblaze <"URL"> Applicationn
Then Click Contact Linkk
Then Enter Contact Emaill
Then Enter Contact Namee
Then Enter Contact Messagee
Then Click Send Message
Then Verify user can contact by sending message


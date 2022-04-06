Feature: programs meeting serenity demo
  This feature requires creating a business unit
  and scheduling a meeting with it.

  Scenario Outline: schedule meeting
    Given it is required to enter the serenity demo page and log in with "<user>" and "<password>"
    When a new business unit is created with the data "<name>" "<parent_unit>"
    And schedule a new meeting with the data "<name_meeting>", "<meeting_type>", "<meeting_number>","<star_date>","<start_hour>","<end_date>", "<end_hour>", "<location>", "<unit>", "<organizated_by>", "<reporter>", "<invited1>", "<invited2>", "<invited3>"
    Then validate that the meeting is created with name "<name_meeting>"

    Examples:
    |user |password|name      |parent_unit|name_meeting|meeting_type|meeting_number|star_date |start_hour|end_date  |end_hour|location|unit          |organizated_by  |reporter         |invited1          |invited2           |invited3   |
    |admin|serenity|informatic|Acme Corp. |test_meeting|Customer    |154879        |04/18/2022|11:45     |04/18/2022|12:45   |SD-01   |informatic    |brianna gonzales|alejandro russell|brandon washington|danielle richardson|Kyle Rivera|
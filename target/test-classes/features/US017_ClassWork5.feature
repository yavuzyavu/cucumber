Feature: US017 Class Work
  Scenario: explicitly waitt1
    Given kullanici "demoqaUrl" anasayfasinda
    Then kullanici Will enable bes seconds butonunun enable olmasini bekler
    And kullanici Will enable bes seconds butonunun enable oldugunu test edir
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Calc1.feature");
formatter.feature({
  "line": 2,
  "name": "Calculator",
  "description": "As an user\r\nI want to add two numbers\r\nSo that to view the result",
  "id": "calculator",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@calc1"
    }
  ]
});
formatter.scenario({
  "line": 8,
  "name": "Add two numbers",
  "description": "",
  "id": "calculator;add-two-numbers",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@add2num"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am at calculator page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I pass these values",
  "rows": [
    {
      "cells": [
        "a",
        "b"
      ],
      "line": 11
    },
    {
      "cells": [
        "3",
        "2"
      ],
      "line": 12
    },
    {
      "cells": [
        "8",
        "5"
      ],
      "line": 13
    },
    {
      "cells": [
        "8.3",
        "5"
      ],
      "line": 14
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Calc1StepDefinitions.i_am_at_calculator_page()"
});
formatter.result({
  "duration": 73000613,
  "status": "passed"
});
formatter.match({
  "location": "Calc1StepDefinitions.sumTest(DataTable)"
});
formatter.result({
  "duration": 3303126,
  "error_message": "java.lang.NumberFormatException: For input string: \"8.3\"\r\n\tat java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)\r\n\tat java.lang.Integer.parseInt(Integer.java:580)\r\n\tat java.lang.Integer.parseInt(Integer.java:615)\r\n\tat definitions.Calc1StepDefinitions.sumTest(Calc1StepDefinitions.java:37)\r\n\tat ✽.When I pass these values(Calc1.feature:10)\r\n",
  "status": "failed"
});
});
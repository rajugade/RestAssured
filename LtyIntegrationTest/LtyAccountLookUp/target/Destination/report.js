$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/LtyLookUp/LoyaltyLookUpScenarios.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: en"
    }
  ],
  "line": 2,
  "name": "loyalty lookup scenarios",
  "description": "",
  "id": "loyalty-lookup-scenarios",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Verify lookUp Offer",
  "description": "",
  "id": "loyalty-lookup-scenarios;verify-lookup-offer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I Create Offer for LookUp",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 7
    },
    {
      "cells": [
        "POST",
        "Request_CreateOffer_Scenario1.json",
        "Request_CreateOffer_Scenario1.json"
      ],
      "line": 8
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I update offer status for LookUp",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 11
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 12
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I LookUp Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile"
      ],
      "line": 15
    },
    {
      "cells": [
        "POST",
        "Request_LTYLookUP_Scenario1.xml"
      ],
      "line": 16
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LtyLookUpSteps.createOffer(DataTable)"
});
formatter.result({
  "duration": 7960802853,
  "error_message": "java.lang.NullPointerException\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.ltyLookUp.LtyLookUpSteps.createOffer(LtyLookUpSteps.java:34)\r\n\tat ✽.Given I Create Offer for LookUp(features/LtyLookUp/LoyaltyLookUpScenarios.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LtyLookUpSteps.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LtyLookUpSteps.i_LookUp_Offer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
});
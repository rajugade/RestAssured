$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/OfferTool/ControlElementsScenarios.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: en"
    }
  ],
  "line": 2,
  "name": "control elements feature",
  "description": "",
  "id": "control-elements-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Verify control elements when brand\u003dMACYS,division\u003d71,controlGroup\u003dEVENTTYPE selected",
  "description": "",
  "id": "control-elements-feature;verify-control-elements-when-brand\u003dmacys,division\u003d71,controlgroup\u003deventtype-selected",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I invoke getcontrolelements api",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "queryParameters",
        "responseFile"
      ],
      "line": 8
    },
    {
      "cells": [
        "GET",
        "brand\u003dMACYS;division\u003d71;controlGroup\u003dEVENTTYPE",
        "Response_ControlElements_ControlGroup_EVENTTYPE.json"
      ],
      "line": 9
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I Verify Control Elements API Response",
  "keyword": "Then "
});
formatter.match({
  "location": "ControlElementsSteps.getControlElements(DataTable)"
});
formatter.result({
  "duration": 5797231722,
  "status": "passed"
});
formatter.match({
  "location": "ControlElementsSteps.validateControlElements()"
});
formatter.result({
  "duration": 672650661,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify control elements when brand\u003dMACYS,division\u003d71,controlGroup\u003dOFFERTYPE selected",
  "description": "",
  "id": "control-elements-feature;verify-control-elements-when-brand\u003dmacys,division\u003d71,controlgroup\u003doffertype-selected",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@scenario2"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I invoke getcontrolelements api",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "queryParameters",
        "responseFile"
      ],
      "line": 16
    },
    {
      "cells": [
        "GET",
        "brand\u003dMACYS;division\u003d71;controlGroup\u003dOFFERTYPE",
        "Response_ControlElements_ControlGroup_OFFERTYPE.json"
      ],
      "line": 17
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I Verify Control Elements API Response",
  "keyword": "Then "
});
formatter.match({
  "location": "ControlElementsSteps.getControlElements(DataTable)"
});
formatter.result({
  "duration": 762997739,
  "status": "passed"
});
formatter.match({
  "location": "ControlElementsSteps.validateControlElements()"
});
formatter.result({
  "duration": 24262845,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Verify control elements when brand\u003dMACYS,division\u003d71,controlGroup\u003dPRICESTATUS selected",
  "description": "",
  "id": "control-elements-feature;verify-control-elements-when-brand\u003dmacys,division\u003d71,controlgroup\u003dpricestatus-selected",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@scenario3"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I invoke getcontrolelements api",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "queryParameters",
        "responseFile"
      ],
      "line": 24
    },
    {
      "cells": [
        "GET",
        "brand\u003dMACYS;division\u003d71;controlGroup\u003dPRICESTATUS",
        "Response_ControlElements_ControlGroup_PRICESTATUS.json"
      ],
      "line": 25
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I Verify Control Elements API Response",
  "keyword": "Then "
});
formatter.match({
  "location": "ControlElementsSteps.getControlElements(DataTable)"
});
formatter.result({
  "duration": 726557071,
  "status": "passed"
});
formatter.match({
  "location": "ControlElementsSteps.validateControlElements()"
});
formatter.result({
  "duration": 38284705,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Verify control elements when brand\u003dMACYS,division\u003d71,controlGroup\u003dPRESENTMENT selected",
  "description": "",
  "id": "control-elements-feature;verify-control-elements-when-brand\u003dmacys,division\u003d71,controlgroup\u003dpresentment-selected",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@scenario4"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "I invoke getcontrolelements api",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "queryParameters",
        "responseFile"
      ],
      "line": 32
    },
    {
      "cells": [
        "GET",
        "brand\u003dMACYS;division\u003d71;controlGroup\u003dPRESENTMENT",
        "Response_ControlElements_ControlGroup_PRESENTMENT.json"
      ],
      "line": 33
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "I Verify Control Elements API Response",
  "keyword": "Then "
});
formatter.match({
  "location": "ControlElementsSteps.getControlElements(DataTable)"
});
formatter.result({
  "duration": 755085746,
  "status": "passed"
});
formatter.match({
  "location": "ControlElementsSteps.validateControlElements()"
});
formatter.result({
  "duration": 8240857,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Verify control elements when brand\u003dMACYS,division\u003d71,controlGroup\u003dTIERLEVEL selected",
  "description": "",
  "id": "control-elements-feature;verify-control-elements-when-brand\u003dmacys,division\u003d71,controlgroup\u003dtierlevel-selected",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 37,
      "name": "@scenario5"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "I invoke getcontrolelements api",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "queryParameters",
        "responseFile"
      ],
      "line": 40
    },
    {
      "cells": [
        "GET",
        "brand\u003dMACYS;division\u003d71;controlGroup\u003dTIERLEVEL",
        "Response_ControlElements_ControlGroup_TIERLEVEL.json"
      ],
      "line": 41
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "I Verify Control Elements API Response",
  "keyword": "Then "
});
formatter.match({
  "location": "ControlElementsSteps.getControlElements(DataTable)"
});
formatter.result({
  "duration": 711184259,
  "status": "passed"
});
formatter.match({
  "location": "ControlElementsSteps.validateControlElements()"
});
formatter.result({
  "duration": 21011834,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "Verify control elements when brand\u003dMACYS,division\u003d71,controlGroup\u003dCHANNELELIGIBLE selected",
  "description": "",
  "id": "control-elements-feature;verify-control-elements-when-brand\u003dmacys,division\u003d71,controlgroup\u003dchanneleligible-selected",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 45,
      "name": "@scenario6"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "I invoke getcontrolelements api",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "queryParameters",
        "responseFile"
      ],
      "line": 48
    },
    {
      "cells": [
        "GET",
        "brand\u003dMACYS;division\u003d71;controlGroup\u003dCHANNELELIGIBLE",
        "Response_ControlElements_ControlGroup_CHANNELELIGIBLE.json"
      ],
      "line": 49
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 51,
  "name": "I Verify Control Elements API Response",
  "keyword": "Then "
});
formatter.match({
  "location": "ControlElementsSteps.getControlElements(DataTable)"
});
formatter.result({
  "duration": 725574327,
  "status": "passed"
});
formatter.match({
  "location": "ControlElementsSteps.validateControlElements()"
});
formatter.result({
  "duration": 8659101,
  "status": "passed"
});
formatter.scenario({
  "line": 54,
  "name": "Verify control elements when brand\u003dMACYS,division\u003d71,controlKey\u003d2 and controlGroup\u003dOFFERTYPE selected",
  "description": "",
  "id": "control-elements-feature;verify-control-elements-when-brand\u003dmacys,division\u003d71,controlkey\u003d2-and-controlgroup\u003doffertype-selected",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 53,
      "name": "@scenario7"
    }
  ]
});
formatter.step({
  "line": 55,
  "name": "I invoke getcontrolelements api",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "queryParameters",
        "responseFile"
      ],
      "line": 56
    },
    {
      "cells": [
        "GET",
        "brand\u003dMACYS;division\u003d71;controlKey\u003d2;controlGroup\u003dOFFERTYPE",
        "Response_ControlElements_ControlKey.json"
      ],
      "line": 57
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 59,
  "name": "I Verify Control Elements API Response",
  "keyword": "Then "
});
formatter.match({
  "location": "ControlElementsSteps.getControlElements(DataTable)"
});
formatter.result({
  "duration": 715325215,
  "status": "passed"
});
formatter.match({
  "location": "ControlElementsSteps.validateControlElements()"
});
formatter.result({
  "duration": 14338749,
  "status": "passed"
});
formatter.scenario({
  "line": 62,
  "name": "Verify control elements with no query parameters",
  "description": "",
  "id": "control-elements-feature;verify-control-elements-with-no-query-parameters",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 61,
      "name": "@scenario8"
    }
  ]
});
formatter.step({
  "line": 63,
  "name": "I invoke getcontrolelements api",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "responseFile"
      ],
      "line": 64
    },
    {
      "cells": [
        "GET",
        "Response_ControlElements.json"
      ],
      "line": 65
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 67,
  "name": "I Verify Control Elements API Response",
  "keyword": "Then "
});
formatter.match({
  "location": "ControlElementsSteps.getControlElements(DataTable)"
});
formatter.result({
  "duration": 715001482,
  "status": "passed"
});
formatter.match({
  "location": "ControlElementsSteps.validateControlElements()"
});
formatter.result({
  "duration": 696005600,
  "status": "passed"
});
formatter.uri("features/OfferTool/FixedIncrementalBonusOfferScenarios.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: en"
    }
  ],
  "line": 2,
  "name": "fixed incremental offer scenarios",
  "description": "",
  "id": "fixed-incremental-offer-scenarios",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Verify create Offer for fixed incremental points for every purchase of $XX(no products) with isincremental true and incremental amount",
  "description": "",
  "id": "fixed-incremental-offer-scenarios;verify-create-offer-for-fixed-incremental-points-for-every-purchase-of-$xx(no-products)-with-isincremental-true-and-incremental-amount",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I Create Offer",
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
        "Request_CreateOffer_Noproducts_isinctrueandwithincamount.json",
        "Response_CreateOffer_Noproducts_isinctrueandwithincamount.json"
      ],
      "line": 8
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 13
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_ViewOffer_Noproducts_isinctrueandwithincamount.json"
      ],
      "line": 14
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 19
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 20
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 23
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 24
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 27
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 28
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 1199410781,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 429593700,
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following 2 assertions failed:\r\n1) [The EffectiveDate value is: ] expected:\u003c\"2017-11-23T[12]:00:00.000\"\u003e but was:\u003c\"2017-11-23T[00]:00:00.000\"\u003e\r\n2) [The ExpirationDate value is: ] expected:\u003c\"2017-11-30T[11]:59:00.000\"\u003e but was:\u003c\"2017-11-30T[23]:59:00.000\"\u003e\r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:116)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validateOffer(OfferResponseValidator.java:115)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validate(OfferResponseValidator.java:35)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.offetool.StepDefinition.validateOffer(StepDefinition.java:47)\r\n\tat ✽.Then I Verify Offer Response(features/OfferTool/FixedIncrementalBonusOfferScenarios.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 32,
  "name": "Verify create Offer for fixed incremental points for every purchase of $XX product spend with isincremental true and incremental amount",
  "description": "",
  "id": "fixed-incremental-offer-scenarios;verify-create-offer-for-fixed-incremental-points-for-every-purchase-of-$xx-product-spend-with-isincremental-true-and-incremental-amount",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@scenario2"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 34
    },
    {
      "cells": [
        "POST",
        "Request_CreateOffer_productspend_isinctrueandwithincamount.json",
        "Response_CreateOffer_productspend_isinctrueandwithincamount.json"
      ],
      "line": 35
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 40
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_ViewOffer_productspend_isinctrueandwithincamount.json"
      ],
      "line": 41
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 46
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 47
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 50
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 51
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 54
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 55
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 1083801006,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 74638987,
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following 2 assertions failed:\r\n1) [The EffectiveDate value is: ] expected:\u003c\"2017-11-23T[12]:00:00.000\"\u003e but was:\u003c\"2017-11-23T[00]:00:00.000\"\u003e\r\n2) [The ExpirationDate value is: ] expected:\u003c\"2017-12-30T[11]:59:00.000\"\u003e but was:\u003c\"2017-12-30T[23]:59:00.000\"\u003e\r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:116)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validateOffer(OfferResponseValidator.java:115)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validate(OfferResponseValidator.java:35)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.offetool.StepDefinition.validateOffer(StepDefinition.java:47)\r\n\tat ✽.Then I Verify Offer Response(features/OfferTool/FixedIncrementalBonusOfferScenarios.feature:37)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 58,
  "name": "Verify create Offer for fixed incremental points for every purchase of $XX(no products) with isincremental false",
  "description": "",
  "id": "fixed-incremental-offer-scenarios;verify-create-offer-for-fixed-incremental-points-for-every-purchase-of-$xx(no-products)-with-isincremental-false",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 57,
      "name": "@scenario3"
    }
  ]
});
formatter.step({
  "line": 59,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 60
    },
    {
      "cells": [
        "POST",
        "Request_CreateOffer_Noproducts_isincrementalfalse.json",
        "Response_CreateOffer_Noproducts_isincrementalfalse.json"
      ],
      "line": 61
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 63,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 65,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 66
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_ViewOffer_Noproducts_isincrementalfalse.json"
      ],
      "line": 67
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 72
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 73
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 76
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 77
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 80
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 81
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 773600091,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 72883902,
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following 2 assertions failed:\r\n1) [The EffectiveDate value is: ] expected:\u003c\"2017-11-23T[12]:00:00.000\"\u003e but was:\u003c\"2017-11-23T[00]:00:00.000\"\u003e\r\n2) [The ExpirationDate value is: ] expected:\u003c\"2017-11-30T[11]:59:00.000\"\u003e but was:\u003c\"2017-11-30T[23]:59:00.000\"\u003e\r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:116)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validateOffer(OfferResponseValidator.java:115)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validate(OfferResponseValidator.java:35)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.offetool.StepDefinition.validateOffer(StepDefinition.java:47)\r\n\tat ✽.Then I Verify Offer Response(features/OfferTool/FixedIncrementalBonusOfferScenarios.feature:63)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 84,
  "name": "Verify create Offer for fixed incremental points for every purchase of $XX product spend with isincremental false",
  "description": "",
  "id": "fixed-incremental-offer-scenarios;verify-create-offer-for-fixed-incremental-points-for-every-purchase-of-$xx-product-spend-with-isincremental-false",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 83,
      "name": "@scenario4"
    }
  ]
});
formatter.step({
  "line": 85,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 86
    },
    {
      "cells": [
        "POST",
        "Request_CreateOffer_productspend_isincrementalfalse.json",
        "Response_CreateOffer_productspend_isincrementalfalse.json"
      ],
      "line": 87
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 89,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 91,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 92
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_ViewOffer_productspend_isincrementalfalse.json"
      ],
      "line": 93
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 97,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 98
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 99
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 101,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 102
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 103
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 105,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 106
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 107
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 987473640,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 45597129,
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following 2 assertions failed:\r\n1) [The EffectiveDate value is: ] expected:\u003c\"2017-11-23T[12]:00:00.000\"\u003e but was:\u003c\"2017-11-23T[00]:00:00.000\"\u003e\r\n2) [The ExpirationDate value is: ] expected:\u003c\"2017-12-30T[11]:59:00.000\"\u003e but was:\u003c\"2017-12-30T[23]:59:00.000\"\u003e\r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:116)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validateOffer(OfferResponseValidator.java:115)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validate(OfferResponseValidator.java:35)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.offetool.StepDefinition.validateOffer(StepDefinition.java:47)\r\n\tat ✽.Then I Verify Offer Response(features/OfferTool/FixedIncrementalBonusOfferScenarios.feature:89)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("features/OfferTool/FixedOfferSceanrios.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: en"
    }
  ],
  "line": 2,
  "name": "fixed offer scenarios",
  "description": "",
  "id": "fixed-offer-scenarios",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Verify create Offer",
  "description": "",
  "id": "fixed-offer-scenarios;verify-create-offer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I Create Offer",
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
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 13
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 14
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 17
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 18
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 20
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode"
      ],
      "line": 21
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 23
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 24
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 684093349,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 39195604,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "duration": 832860279,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "duration": 681620665,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "duration": 672473613,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "duration": 690500862,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "CreateFixedOfferForAnyPurchase",
  "description": "",
  "id": "fixed-offer-scenarios;createfixedofferforanypurchase",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile"
      ],
      "line": 28
    },
    {
      "cells": [
        "POST",
        "Request_CreateFixedOfferForAnyPurchase.json"
      ],
      "line": 29
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 31
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 32
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 34
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 35
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 37
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 38
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 720192752,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "duration": 1158333508,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "duration": 824590341,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "duration": 716442670,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "CreateFixedOfferForProductSpend",
  "description": "",
  "id": "fixed-offer-scenarios;createfixedofferforproductspend",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 41,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile"
      ],
      "line": 42
    },
    {
      "cells": [
        "POST",
        "Request_CreateFixedOfferForProductSpend.json"
      ],
      "line": 43
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 45
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 46
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 48
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 49
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 51
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 52
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 715677600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "duration": 852293221,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "duration": 809339410,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "duration": 692420164,
  "status": "passed"
});
formatter.scenario({
  "line": 54,
  "name": "CreateFixedOfferForTransactionSpend",
  "description": "",
  "id": "fixed-offer-scenarios;createfixedofferfortransactionspend",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 55,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile"
      ],
      "line": 56
    },
    {
      "cells": [
        "POST",
        "Request_CreateFixedOfferForTransactionSpend.json"
      ],
      "line": 57
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 58,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 59
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 60
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 62
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 63
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 65
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 66
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 709895315,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "duration": 731853115,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "duration": 694204329,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "duration": 724172055,
  "status": "passed"
});
formatter.uri("features/OfferTool/NonTransactionalOfferScenarios.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: en"
    }
  ],
  "line": 2,
  "name": "Non Transcational scenarios",
  "description": "",
  "id": "non-transcational-scenarios",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Scenario: Verify offer type and event type in offer response for event type \u0027CC Enroll\u0027 and offer type \u0027Fixed for non-transactional behavior (no purchase required therefore product hierarch selection should be disabled)\u0027",
  "description": "",
  "id": "non-transcational-scenarios;scenario:-verify-offer-type-and-event-type-in-offer-response-for-event-type-\u0027cc-enroll\u0027-and-offer-type-\u0027fixed-for-non-transactional-behavior-(no-purchase-required-therefore-product-hierarch-selection-should-be-disabled)\u0027",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "eventType",
        "requestFile",
        "responseFile"
      ],
      "line": 7
    },
    {
      "cells": [
        "POST",
        "CC ENROLL",
        "Request_CreateOffer_DiffEvents_FixedNonTransNoProduct.json",
        "Response_CreateOffer_DiffEvents_FixedNonTransNoProduct.json"
      ],
      "line": 8
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 11
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_CreateOffer_DiffEvents_FixedNonTransNoProduct.json"
      ],
      "line": 12
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 15
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 18
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 19
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 21
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 22
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 743943269,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 26947218,
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following 2 assertions failed:\r\n1) [The EffectiveDate value is: ] expected:\u003c\"2017-12-12T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-12T[00]:00:00.000\"\u003e\r\n2) [The ExpirationDate value is: ] expected:\u003c\"2017-12-13T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-13T[00]:00:00.000\"\u003e\r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:116)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validateOffer(OfferResponseValidator.java:115)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validate(OfferResponseValidator.java:35)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.offetool.StepDefinition.validateOffer(StepDefinition.java:47)\r\n\tat ✽.Then I Verify Offer Response(features/OfferTool/NonTransactionalOfferScenarios.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 25,
  "name": "Verify offer type and event type in offer response for event type \u0027Loyalty Enroll\u0027 and offer type \u0027Fixed for non-transactional behavior (no purchase required therefore product hierarch selection should be disabled)\u0027",
  "description": "",
  "id": "non-transcational-scenarios;verify-offer-type-and-event-type-in-offer-response-for-event-type-\u0027loyalty-enroll\u0027-and-offer-type-\u0027fixed-for-non-transactional-behavior-(no-purchase-required-therefore-product-hierarch-selection-should-be-disabled)\u0027",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@scenario2"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "eventType",
        "requestFile",
        "responseFile"
      ],
      "line": 27
    },
    {
      "cells": [
        "POST",
        "LOYALTY ENROLL",
        "Request_CreateOffer_DiffEvents_FixedNonTransNoProduct.json",
        "Response_CreateOffer_DiffEvents_FixedNonTransNoProduct.json"
      ],
      "line": 28
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 31
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_CreateOffer_DiffEvents_FixedNonTransNoProduct.json"
      ],
      "line": 32
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 35
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 36
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 38
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 39
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 41
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 42
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 698089122,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 15617857,
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following 2 assertions failed:\r\n1) [The EffectiveDate value is: ] expected:\u003c\"2017-12-12T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-12T[00]:00:00.000\"\u003e\r\n2) [The ExpirationDate value is: ] expected:\u003c\"2017-12-13T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-13T[00]:00:00.000\"\u003e\r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:116)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validateOffer(OfferResponseValidator.java:115)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validate(OfferResponseValidator.java:35)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.offetool.StepDefinition.validateOffer(StepDefinition.java:47)\r\n\tat ✽.Then I Verify Offer Response(features/OfferTool/NonTransactionalOfferScenarios.feature:29)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 45,
  "name": "Verify offer type and event type in offer response for event type \u0027Email add\u0027 and offer type \u0027Fixed for non-transactional behavior (no purchase required therefore product hierarch selection should be disabled)\u0027",
  "description": "",
  "id": "non-transcational-scenarios;verify-offer-type-and-event-type-in-offer-response-for-event-type-\u0027email-add\u0027-and-offer-type-\u0027fixed-for-non-transactional-behavior-(no-purchase-required-therefore-product-hierarch-selection-should-be-disabled)\u0027",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 44,
      "name": "@scenario3"
    }
  ]
});
formatter.step({
  "line": 46,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "eventType",
        "requestFile",
        "responseFile"
      ],
      "line": 47
    },
    {
      "cells": [
        "POST",
        "EMAIL ADD",
        "Request_CreateOffer_DiffEvents_FixedNonTransNoProduct.json",
        "Response_CreateOffer_DiffEvents_FixedNonTransNoProduct.json"
      ],
      "line": 48
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 49,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 51
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_CreateOffer_DiffEvents_FixedNonTransNoProduct.json"
      ],
      "line": 52
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 55
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 56
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 58
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 59
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 61
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 62
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 746365491,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 23769335,
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following 2 assertions failed:\r\n1) [The EffectiveDate value is: ] expected:\u003c\"2017-12-12T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-12T[00]:00:00.000\"\u003e\r\n2) [The ExpirationDate value is: ] expected:\u003c\"2017-12-13T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-13T[00]:00:00.000\"\u003e\r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:116)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validateOffer(OfferResponseValidator.java:115)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validate(OfferResponseValidator.java:35)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.offetool.StepDefinition.validateOffer(StepDefinition.java:47)\r\n\tat ✽.Then I Verify Offer Response(features/OfferTool/NonTransactionalOfferScenarios.feature:49)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 65,
  "name": "Verify offer type and event type in offer response for event type \u0027Tier upgrade\u0027 and offer type \u0027Fixed for non-transactional behavior (no purchase required therefore product hierarch selection should be disabled)\u0027",
  "description": "",
  "id": "non-transcational-scenarios;verify-offer-type-and-event-type-in-offer-response-for-event-type-\u0027tier-upgrade\u0027-and-offer-type-\u0027fixed-for-non-transactional-behavior-(no-purchase-required-therefore-product-hierarch-selection-should-be-disabled)\u0027",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 64,
      "name": "@scenario4"
    }
  ]
});
formatter.step({
  "line": 66,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "eventType",
        "requestFile",
        "responseFile"
      ],
      "line": 67
    },
    {
      "cells": [
        "POST",
        "TIER UPGRADE",
        "Request_CreateOffer_DiffEvents_FixedNonTransNoProduct.json",
        "Response_CreateOffer_DiffEvents_FixedNonTransNoProduct.json"
      ],
      "line": 68
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 69,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 70,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 71
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_CreateOffer_DiffEvents_FixedNonTransNoProduct.json"
      ],
      "line": 72
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 74,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 75
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 76
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 78
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 79
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 81
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 82
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 689041286,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 13736188,
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following 2 assertions failed:\r\n1) [The EffectiveDate value is: ] expected:\u003c\"2017-12-12T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-12T[00]:00:00.000\"\u003e\r\n2) [The ExpirationDate value is: ] expected:\u003c\"2017-12-13T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-13T[00]:00:00.000\"\u003e\r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:116)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validateOffer(OfferResponseValidator.java:115)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validate(OfferResponseValidator.java:35)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.offetool.StepDefinition.validateOffer(StepDefinition.java:47)\r\n\tat ✽.Then I Verify Offer Response(features/OfferTool/NonTransactionalOfferScenarios.feature:69)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 85,
  "name": "Verify offer type and event type in offer response for event type \u0027CC Enroll\u0027 and offer type \u0027Fixed for non-transactional behavior (purchase required)\u0027",
  "description": "",
  "id": "non-transcational-scenarios;verify-offer-type-and-event-type-in-offer-response-for-event-type-\u0027cc-enroll\u0027-and-offer-type-\u0027fixed-for-non-transactional-behavior-(purchase-required)\u0027",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 84,
      "name": "@scenario5"
    }
  ]
});
formatter.step({
  "line": 86,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "eventType",
        "requestFile",
        "responseFile"
      ],
      "line": 87
    },
    {
      "cells": [
        "POST",
        "CC ENROLL",
        "Request_CreateOffer_DiffEvents_FixedNonTransForProduct.json",
        "Response_CreateOffer_DiffEvents_FixedNonTransForProduct.json"
      ],
      "line": 88
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 89,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 90,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 91
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_CreateOffer_DiffEvents_FixedNonTransForProduct.json"
      ],
      "line": 92
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 94,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 95
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 96
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 97,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 98
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 99
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 100,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 101
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 102
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 729649851,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 31513688,
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following 2 assertions failed:\r\n1) [The EffectiveDate value is: ] expected:\u003c\"2017-12-12T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-12T[00]:00:00.000\"\u003e\r\n2) [The ExpirationDate value is: ] expected:\u003c\"2017-12-13T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-13T[00]:00:00.000\"\u003e\r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:116)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validateOffer(OfferResponseValidator.java:115)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validate(OfferResponseValidator.java:35)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.offetool.StepDefinition.validateOffer(StepDefinition.java:47)\r\n\tat ✽.Then I Verify Offer Response(features/OfferTool/NonTransactionalOfferScenarios.feature:89)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 105,
  "name": "Verify offer type and event type in offer response for event type \u0027Loyalty Enroll\u0027 and offer type \u0027Fixed for non-transactional behavior (purchase required)\u0027",
  "description": "",
  "id": "non-transcational-scenarios;verify-offer-type-and-event-type-in-offer-response-for-event-type-\u0027loyalty-enroll\u0027-and-offer-type-\u0027fixed-for-non-transactional-behavior-(purchase-required)\u0027",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 104,
      "name": "@scenario6"
    }
  ]
});
formatter.step({
  "line": 106,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "eventType",
        "requestFile",
        "responseFile"
      ],
      "line": 107
    },
    {
      "cells": [
        "POST",
        "LOYALTY ENROLL",
        "Request_CreateOffer_DiffEvents_FixedNonTransForProduct.json",
        "Response_CreateOffer_DiffEvents_FixedNonTransForProduct.json"
      ],
      "line": 108
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 109,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 110,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 111
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_CreateOffer_DiffEvents_FixedNonTransForProduct.json"
      ],
      "line": 112
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 113,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 114,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 115
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 116
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 117,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 118
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 119
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 120,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 121
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 122
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 729740514,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 23653441,
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following 2 assertions failed:\r\n1) [The EffectiveDate value is: ] expected:\u003c\"2017-12-12T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-12T[00]:00:00.000\"\u003e\r\n2) [The ExpirationDate value is: ] expected:\u003c\"2017-12-13T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-13T[00]:00:00.000\"\u003e\r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:116)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validateOffer(OfferResponseValidator.java:115)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validate(OfferResponseValidator.java:35)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.offetool.StepDefinition.validateOffer(StepDefinition.java:47)\r\n\tat ✽.Then I Verify Offer Response(features/OfferTool/NonTransactionalOfferScenarios.feature:109)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 125,
  "name": "Verify offer type and event type in offer response for event type \u0027Email add\u0027 and offer type \u0027Fixed for non-transactional behavior (purchase required)\u0027",
  "description": "",
  "id": "non-transcational-scenarios;verify-offer-type-and-event-type-in-offer-response-for-event-type-\u0027email-add\u0027-and-offer-type-\u0027fixed-for-non-transactional-behavior-(purchase-required)\u0027",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 124,
      "name": "@scenario7"
    }
  ]
});
formatter.step({
  "line": 126,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "eventType",
        "requestFile",
        "responseFile"
      ],
      "line": 127
    },
    {
      "cells": [
        "POST",
        "EMAIL ADD",
        "Request_CreateOffer_DiffEvents_FixedNonTransForProduct.json",
        "Response_CreateOffer_DiffEvents_FixedNonTransForProduct.json"
      ],
      "line": 128
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 129,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 130,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 131
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_CreateOffer_DiffEvents_FixedNonTransForProduct.json"
      ],
      "line": 132
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 133,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 134,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 135
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 136
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 137,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 138
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 139
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 140,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 141
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 142
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 705378880,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 36734893,
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following 2 assertions failed:\r\n1) [The EffectiveDate value is: ] expected:\u003c\"2017-12-12T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-12T[00]:00:00.000\"\u003e\r\n2) [The ExpirationDate value is: ] expected:\u003c\"2017-12-13T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-13T[00]:00:00.000\"\u003e\r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:116)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validateOffer(OfferResponseValidator.java:115)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validate(OfferResponseValidator.java:35)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.offetool.StepDefinition.validateOffer(StepDefinition.java:47)\r\n\tat ✽.Then I Verify Offer Response(features/OfferTool/NonTransactionalOfferScenarios.feature:129)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 145,
  "name": "Verify offer type and event type in offer response for event type \u0027Tier upgrade\u0027 and offer type \u0027Fixed for non-transactional behavior (purchase required)\u0027",
  "description": "",
  "id": "non-transcational-scenarios;verify-offer-type-and-event-type-in-offer-response-for-event-type-\u0027tier-upgrade\u0027-and-offer-type-\u0027fixed-for-non-transactional-behavior-(purchase-required)\u0027",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 144,
      "name": "@scenario8"
    }
  ]
});
formatter.step({
  "line": 146,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "eventType",
        "requestFile",
        "responseFile"
      ],
      "line": 147
    },
    {
      "cells": [
        "POST",
        "TIER UPGRADE",
        "Request_CreateOffer_DiffEvents_FixedNonTransForProduct.json",
        "Response_CreateOffer_DiffEvents_FixedNonTransForProduct.json"
      ],
      "line": 148
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 149,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 150,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 151
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_CreateOffer_DiffEvents_FixedNonTransForProduct.json"
      ],
      "line": 152
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 153,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 154,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 155
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 156
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 157,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 158
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 159
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 160,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 161
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 162
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 718937592,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 24465553,
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following 2 assertions failed:\r\n1) [The EffectiveDate value is: ] expected:\u003c\"2017-12-12T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-12T[00]:00:00.000\"\u003e\r\n2) [The ExpirationDate value is: ] expected:\u003c\"2017-12-13T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-13T[00]:00:00.000\"\u003e\r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:116)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validateOffer(OfferResponseValidator.java:115)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validate(OfferResponseValidator.java:35)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.offetool.StepDefinition.validateOffer(StepDefinition.java:47)\r\n\tat ✽.Then I Verify Offer Response(features/OfferTool/NonTransactionalOfferScenarios.feature:149)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 165,
  "name": "Verify offer type and event type in offer response for event type \u0027CC Enroll\u0027 and offer type \u0027Multiplier for non-transactional behavior (purchase required))\u0027",
  "description": "",
  "id": "non-transcational-scenarios;verify-offer-type-and-event-type-in-offer-response-for-event-type-\u0027cc-enroll\u0027-and-offer-type-\u0027multiplier-for-non-transactional-behavior-(purchase-required))\u0027",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 164,
      "name": "@scenario9"
    }
  ]
});
formatter.step({
  "line": 166,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "eventType",
        "requestFile",
        "responseFile"
      ],
      "line": 167
    },
    {
      "cells": [
        "POST",
        "CC ENROLL",
        "Request_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json",
        "Response_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json"
      ],
      "line": 168
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 169,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 170,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 171
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json"
      ],
      "line": 172
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 173,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 174,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 175
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 176
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 177,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 178
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 179
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 180,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 181
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 182
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 766370204,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 17591471,
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following 2 assertions failed:\r\n1) [The EffectiveDate value is: ] expected:\u003c\"2017-12-12T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-12T[00]:00:00.000\"\u003e\r\n2) [The ExpirationDate value is: ] expected:\u003c\"2017-12-13T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-13T[00]:00:00.000\"\u003e\r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:116)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validateOffer(OfferResponseValidator.java:115)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validate(OfferResponseValidator.java:35)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.offetool.StepDefinition.validateOffer(StepDefinition.java:47)\r\n\tat ✽.Then I Verify Offer Response(features/OfferTool/NonTransactionalOfferScenarios.feature:169)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 185,
  "name": "Verify offer type and event type in offer response for event type \u0027Loyalty Enroll\u0027 and offer type \u0027Multiplier for non-transactional behavior (purchase required))\u0027",
  "description": "",
  "id": "non-transcational-scenarios;verify-offer-type-and-event-type-in-offer-response-for-event-type-\u0027loyalty-enroll\u0027-and-offer-type-\u0027multiplier-for-non-transactional-behavior-(purchase-required))\u0027",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 184,
      "name": "@scenario10"
    }
  ]
});
formatter.step({
  "line": 186,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "eventType",
        "requestFile",
        "responseFile"
      ],
      "line": 187
    },
    {
      "cells": [
        "POST",
        "LOYALTY ENROLL",
        "Request_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json",
        "Response_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json"
      ],
      "line": 188
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 189,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 190,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 191
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json"
      ],
      "line": 192
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 193,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 194,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 195
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 196
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 197,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 198
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 199
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 200,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 201
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 202
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 657915906,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 17980208,
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following 2 assertions failed:\r\n1) [The EffectiveDate value is: ] expected:\u003c\"2017-12-12T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-12T[00]:00:00.000\"\u003e\r\n2) [The ExpirationDate value is: ] expected:\u003c\"2017-12-13T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-13T[00]:00:00.000\"\u003e\r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:116)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validateOffer(OfferResponseValidator.java:115)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validate(OfferResponseValidator.java:35)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.offetool.StepDefinition.validateOffer(StepDefinition.java:47)\r\n\tat ✽.Then I Verify Offer Response(features/OfferTool/NonTransactionalOfferScenarios.feature:189)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 205,
  "name": "Verify offer type and event type in offer response for event type \u0027Email add\u0027 and offer type \u0027Multiplier for non-transactional behavior (purchase required))\u0027",
  "description": "",
  "id": "non-transcational-scenarios;verify-offer-type-and-event-type-in-offer-response-for-event-type-\u0027email-add\u0027-and-offer-type-\u0027multiplier-for-non-transactional-behavior-(purchase-required))\u0027",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 204,
      "name": "@scenario11"
    }
  ]
});
formatter.step({
  "line": 206,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "eventType",
        "requestFile",
        "responseFile"
      ],
      "line": 207
    },
    {
      "cells": [
        "POST",
        "EMAIL ADD",
        "Request_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json",
        "Response_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json"
      ],
      "line": 208
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 209,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 210,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 211
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json"
      ],
      "line": 212
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 213,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 214,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 215
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 216
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 217,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 218
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 219
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 220,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 221
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 222
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 737602043,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 57953710,
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following 2 assertions failed:\r\n1) [The EffectiveDate value is: ] expected:\u003c\"2017-12-12T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-12T[00]:00:00.000\"\u003e\r\n2) [The ExpirationDate value is: ] expected:\u003c\"2017-12-13T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-13T[00]:00:00.000\"\u003e\r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:116)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validateOffer(OfferResponseValidator.java:115)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validate(OfferResponseValidator.java:35)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.offetool.StepDefinition.validateOffer(StepDefinition.java:47)\r\n\tat ✽.Then I Verify Offer Response(features/OfferTool/NonTransactionalOfferScenarios.feature:209)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 225,
  "name": "Verify offer type and event type in offer response for event type \u0027Tier upgrade\u0027 and offer type \u0027Multiplier for non-transactional behavior (purchase required))\u0027",
  "description": "",
  "id": "non-transcational-scenarios;verify-offer-type-and-event-type-in-offer-response-for-event-type-\u0027tier-upgrade\u0027-and-offer-type-\u0027multiplier-for-non-transactional-behavior-(purchase-required))\u0027",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 224,
      "name": "@scenario12"
    }
  ]
});
formatter.step({
  "line": 226,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "eventType",
        "requestFile",
        "responseFile"
      ],
      "line": 227
    },
    {
      "cells": [
        "POST",
        "TIER UPGRADE",
        "Request_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json",
        "Response_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json"
      ],
      "line": 228
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 229,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 230,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 231
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json"
      ],
      "line": 232
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 233,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 234,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 235
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 236
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 237,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 238
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 239
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 240,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 241
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 242
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 681926436,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 28887903,
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following 2 assertions failed:\r\n1) [The EffectiveDate value is: ] expected:\u003c\"2017-12-12T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-12T[00]:00:00.000\"\u003e\r\n2) [The ExpirationDate value is: ] expected:\u003c\"2017-12-13T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-13T[00]:00:00.000\"\u003e\r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:116)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validateOffer(OfferResponseValidator.java:115)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validate(OfferResponseValidator.java:35)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.offetool.StepDefinition.validateOffer(StepDefinition.java:47)\r\n\tat ✽.Then I Verify Offer Response(features/OfferTool/NonTransactionalOfferScenarios.feature:229)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("features/OfferTool/PickYourDayOfferScenarios.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: en"
    }
  ],
  "line": 2,
  "name": "pickyourday eventtype scenarios",
  "description": "",
  "id": "pickyourday-eventtype-scenarios",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Verify create Offer for eventype \u0027PICK YOUR DAY\u0027 and offertype \u0027Multiplier for any purchase get Xx points after any purchase\u0027",
  "description": "",
  "id": "pickyourday-eventtype-scenarios;verify-create-offer-for-eventype-\u0027pick-your-day\u0027-and-offertype-\u0027multiplier-for-any-purchase-get-xx-points-after-any-purchase\u0027",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I Create Offer",
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
        "Request_CreateOffer_PICKYOURDAY_Multiplierforanypurchase.json",
        "Response_CreateOffer_PICKYOURDAY_Multiplierforanypurchase.json"
      ],
      "line": 8
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 13
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_ViewOffer_PICKYOURDAY_Multiplierforanypurchase.json"
      ],
      "line": 14
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 19
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 20
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 23
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 24
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 27
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 28
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 724688231,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 39699805,
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following 2 assertions failed:\r\n1) [The EffectiveDate value is: ] expected:\u003c\"2017-11-23T[12]:00:00.000\"\u003e but was:\u003c\"2017-11-23T[00]:00:00.000\"\u003e\r\n2) [The ExpirationDate value is: ] expected:\u003c\"2017-11-30T[11]:59:00.000\"\u003e but was:\u003c\"2017-11-30T[23]:59:00.000\"\u003e\r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:116)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validateOffer(OfferResponseValidator.java:115)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validate(OfferResponseValidator.java:35)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.offetool.StepDefinition.validateOffer(StepDefinition.java:47)\r\n\tat ✽.Then I Verify Offer Response(features/OfferTool/PickYourDayOfferScenarios.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 32,
  "name": "Verify create Offer for eventype \u0027PICK YOUR DAY\u0027 and offertype \u0027Multiplier for Product Spend: Get Xx Points $Y product spend\u0027",
  "description": "",
  "id": "pickyourday-eventtype-scenarios;verify-create-offer-for-eventype-\u0027pick-your-day\u0027-and-offertype-\u0027multiplier-for-product-spend:-get-xx-points-$y-product-spend\u0027",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@scenario2"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 34
    },
    {
      "cells": [
        "POST",
        "Request_CreateOffer_PICKYOURDAY_MultiplierforProductSpend.json",
        "Response_CreateOffer_PICKYOURDAY_MultiplierforProductSpend.json"
      ],
      "line": 35
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 40
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_ViewOffer_PICKYOURDAY_MultiplierforProductSpend.json"
      ],
      "line": 41
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 46
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 47
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 50
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 51
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 54
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 55
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 924835856,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 20039353,
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following 4 assertions failed:\r\n1) [The EffectiveDate value is: ] expected:\u003c\"2017-11-29T[12]:00:00.000\"\u003e but was:\u003c\"2017-11-29T[00]:00:00.000\"\u003e\r\n2) [The ExpirationDate value is: ] expected:\u003c\"2017-12-29T[11]:59:00.000\"\u003e but was:\u003c\"2017-12-29T[23]:59:00.000\"\u003e\r\n3) [The Store value is: ] expected:\u003c\"000[37]\"\u003e but was:\u003c\"000[06]\"\u003e\r\n4) [The Store value is: ] expected:\u003c\"000[06]\"\u003e but was:\u003c\"000[37]\"\u003e\r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:116)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validateOffer(OfferResponseValidator.java:115)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validate(OfferResponseValidator.java:35)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.offetool.StepDefinition.validateOffer(StepDefinition.java:47)\r\n\tat ✽.Then I Verify Offer Response(features/OfferTool/PickYourDayOfferScenarios.feature:37)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 59,
  "name": "Verify create Offer for eventype \u0027PICK YOUR DAY\u0027 and offertype \u0027Multiplier for Transaction Spend: Get Xx Points after $Y spend\u0027",
  "description": "",
  "id": "pickyourday-eventtype-scenarios;verify-create-offer-for-eventype-\u0027pick-your-day\u0027-and-offertype-\u0027multiplier-for-transaction-spend:-get-xx-points-after-$y-spend\u0027",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 58,
      "name": "@scenario3"
    }
  ]
});
formatter.step({
  "line": 60,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 61
    },
    {
      "cells": [
        "POST",
        "Request_CreateOffer_PICKYOURDAY_MultiplierforTransactionSpend.json",
        "Response_CreateOffer_PICKYOURDAY_MultiplierforTransactionSpend.json"
      ],
      "line": 62
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 64,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 66,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 67
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_ViewOffer_PICKYOURDAY_MultiplierforTransactionSpend.json"
      ],
      "line": 68
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 72,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 73
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 74
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 77
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 78
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 81
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 82
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 751058973,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 10949178,
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following 2 assertions failed:\r\n1) [The EffectiveDate value is: ] expected:\u003c\"2017-11-23T[12]:00:00.000\"\u003e but was:\u003c\"2017-11-23T[00]:00:00.000\"\u003e\r\n2) [The ExpirationDate value is: ] expected:\u003c\"2017-11-30T[11]:59:00.000\"\u003e but was:\u003c\"2017-11-30T[23]:59:00.000\"\u003e\r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:116)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validateOffer(OfferResponseValidator.java:115)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validate(OfferResponseValidator.java:35)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.offetool.StepDefinition.validateOffer(StepDefinition.java:47)\r\n\tat ✽.Then I Verify Offer Response(features/OfferTool/PickYourDayOfferScenarios.feature:64)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("features/OfferTool/ViewOfferScenarios.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: en"
    }
  ],
  "line": 2,
  "name": "View offer scenarios",
  "description": "",
  "id": "view-offer-scenarios",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Verify sorting of GMM\u0027s in viewoffer response when all products are selected",
  "description": "",
  "id": "view-offer-scenarios;verify-sorting-of-gmm\u0027s-in-viewoffer-response-when-all-products-are-selected",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I Create Offer",
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
        "Request_CreateOffer_AllProductsSelected.json",
        "Response_CreateOffer_AllProductsSelected.json"
      ],
      "line": 8
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 13
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_ViewOffer_AllProductsSelected.json"
      ],
      "line": 14
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 19
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 20
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 23
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 24
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 705818507,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 19625385,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "duration": 754425879,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 26199255,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "duration": 5940668822,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "duration": 682945103,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Verify sorting of GMM\u0027s in viewoffer response when few products are selected",
  "description": "",
  "id": "view-offer-scenarios;verify-sorting-of-gmm\u0027s-in-viewoffer-response-when-few-products-are-selected",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@scenario2"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 29
    },
    {
      "cells": [
        "POST",
        "Request_CreateOffer_FewProductsSelected.json",
        "Response_CreateOffer_FewProductsSelected.json"
      ],
      "line": 30
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 35
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_ViewOffer_FewProductsSelected.json"
      ],
      "line": 36
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 39
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 40
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 43
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 44
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 944356040,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 64678968,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "duration": 721391032,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "duration": 2023110750,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "duration": 711919393,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "Verify sorting of GMM\u0027s in viewoffer response when GMMs,Divisions and Dept class are selected",
  "description": "",
  "id": "view-offer-scenarios;verify-sorting-of-gmm\u0027s-in-viewoffer-response-when-gmms,divisions-and-dept-class-are-selected",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 46,
      "name": "@scenario3"
    }
  ]
});
formatter.step({
  "line": 48,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 49
    },
    {
      "cells": [
        "POST",
        "Request_CreateOffer_GMMSDIVDeptClassSelected.json",
        "Response_CreateOffer_GMMSDIVDeptClassSelected.json"
      ],
      "line": 50
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 52,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 55
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_ViewOffer_GMMSDIVDeptClassSelected.json"
      ],
      "line": 56
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 59
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 60
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 63
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 64
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 1027267530,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 43272839,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "duration": 664512013,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "duration": 792102034,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "duration": 705502472,
  "status": "passed"
});
formatter.scenario({
  "line": 67,
  "name": "Verify sorting of GMM\u0027s in viewoffer response when GMMs,Divisions and Dept VendorMarkStyle are selected",
  "description": "",
  "id": "view-offer-scenarios;verify-sorting-of-gmm\u0027s-in-viewoffer-response-when-gmms,divisions-and-dept-vendormarkstyle-are-selected",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 66,
      "name": "@scenario4"
    }
  ]
});
formatter.step({
  "line": 68,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 69
    },
    {
      "cells": [
        "POST",
        "Request_CreateOffer_GMMSDIVDeptVendorMarkStyleSelected.json",
        "Response_CreateOffer_GMMSDIVDeptVendorMarkStyleSelected.json"
      ],
      "line": 70
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 72,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 74,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 75
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_ViewOffer_GMMSDIVDeptVendorMarkStyleSelected.json"
      ],
      "line": 76
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 79
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 80
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 82,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 83
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 84
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 993728054,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 31875909,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "duration": 748191566,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "duration": 776856235,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "duration": 731148345,
  "status": "passed"
});
formatter.scenario({
  "line": 87,
  "name": "Verify View offer response when no GMMs are selected",
  "description": "",
  "id": "view-offer-scenarios;verify-view-offer-response-when-no-gmms-are-selected",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 86,
      "name": "@scenario5"
    }
  ]
});
formatter.step({
  "line": 88,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 89
    },
    {
      "cells": [
        "POST",
        "Request_CreateOffer_NoGMMsSelected.json",
        "Response_CreateOffer_NoGMMsSelected.json"
      ],
      "line": 90
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 92,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 94,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 95
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_ViewOffer_NoGMMsStyleSelected.json"
      ],
      "line": 96
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 98,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 99
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 100
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 102,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 103
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 104
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 931460188,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 17577787,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "duration": 696890841,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "duration": 659952385,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "duration": 670496576,
  "status": "passed"
});
formatter.scenario({
  "line": 108,
  "name": "Verify View offer response when tier selected Gold,Platinum and Silver",
  "description": "",
  "id": "view-offer-scenarios;verify-view-offer-response-when-tier-selected-gold,platinum-and-silver",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 107,
      "name": "@scenario6"
    }
  ]
});
formatter.step({
  "line": 109,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 110
    },
    {
      "cells": [
        "POST",
        "Request_CreateOfferWithTiers_GoldPlatinumSilver_MCOM.json",
        "Response_CreateOfferWithTier_GoldPlatinumSilver_MCOM.json"
      ],
      "line": 111
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 113,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 115,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 116
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_ViewOfferWithTier_GoldPlatinumSilver_MCOM.json"
      ],
      "line": 117
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 119,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 120
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 121
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 123,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 124
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 125
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 127,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 128
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 129
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 796247694,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 39305082,
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following 2 assertions failed:\r\n1) [The EffectiveDate value is: ] expected:\u003c\"2017-12-11T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-11T[00]:00:00.000\"\u003e\r\n2) [The ExpirationDate value is: ] expected:\u003c\"2017-12-26T[11]:59:00.000\"\u003e but was:\u003c\"2017-12-26T[23]:59:00.000\"\u003e\r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:116)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validateOffer(OfferResponseValidator.java:115)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validate(OfferResponseValidator.java:35)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.offetool.StepDefinition.validateOffer(StepDefinition.java:47)\r\n\tat ✽.Then I Verify Offer Response(features/OfferTool/ViewOfferScenarios.feature:113)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 132,
  "name": "Verify View offer response when tier selected Gold and Silver",
  "description": "",
  "id": "view-offer-scenarios;verify-view-offer-response-when-tier-selected-gold-and-silver",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 131,
      "name": "@scenario7"
    }
  ]
});
formatter.step({
  "line": 133,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 134
    },
    {
      "cells": [
        "POST",
        "Request_CreateOfferWithTiers_GoldSilver_MCOM.json",
        "Response_CreateOfferWithTier_GoldSilver_MCOM.json"
      ],
      "line": 135
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 137,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 139,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 140
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_ViewOfferWithTier_GoldSilver_MCOM.json"
      ],
      "line": 141
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 143,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 144
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 145
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 147,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 148
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 149
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 151,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 152
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 153
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 957589308,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 10654953,
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following 2 assertions failed:\r\n1) [The EffectiveDate value is: ] expected:\u003c\"2017-12-15T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-15T[]:00:00.000\"\u003e\r\n2) [The ExpirationDate value is: ] expected:\u003c\"2017-12-28T[11]:59:00.000\"\u003e but was:\u003c\"2017-12-28T[23]:59:00.000\"\u003e\r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:116)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validateOffer(OfferResponseValidator.java:115)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validate(OfferResponseValidator.java:35)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.offetool.StepDefinition.validateOffer(StepDefinition.java:47)\r\n\tat ✽.Then I Verify Offer Response(features/OfferTool/ViewOfferScenarios.feature:137)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 157,
  "name": "Verify View offer response when tier selected TopOfTheList",
  "description": "",
  "id": "view-offer-scenarios;verify-view-offer-response-when-tier-selected-topofthelist",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 156,
      "name": "@scenario8"
    }
  ]
});
formatter.step({
  "line": 158,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 159
    },
    {
      "cells": [
        "POST",
        "Request_CreateOfferWithTier_TopOfTheList_BCOM.json",
        "Response_CreateOfferWithTier_TopOfTheList_BCOM.json"
      ],
      "line": 160
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 162,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 164,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 165
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_ViewOfferWithTier_TopOfTheList_BCOM.json"
      ],
      "line": 166
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 168,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 169
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 170
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 172,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 173
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 174
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 176,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 177
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 178
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 741593321,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 23933980,
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following 2 assertions failed:\r\n1) [The EffectiveDate value is: ] expected:\u003c\"2017-12-11T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-11T[00]:00:00.000\"\u003e\r\n2) [The ExpirationDate value is: ] expected:\u003c\"2017-12-31T[11]:59:00.000\"\u003e but was:\u003c\"2017-12-31T[23]:59:00.000\"\u003e\r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:116)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validateOffer(OfferResponseValidator.java:115)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validate(OfferResponseValidator.java:35)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.offetool.StepDefinition.validateOffer(StepDefinition.java:47)\r\n\tat ✽.Then I Verify Offer Response(features/OfferTool/ViewOfferScenarios.feature:162)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 182,
  "name": "Verify View offer response when tier selected BCCLoyalist",
  "description": "",
  "id": "view-offer-scenarios;verify-view-offer-response-when-tier-selected-bccloyalist",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 181,
      "name": "@scenario9"
    }
  ]
});
formatter.step({
  "line": 183,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 184
    },
    {
      "cells": [
        "POST",
        "Request_CreateOfferWithTier_BCCLoyallist_BCOM.json",
        "Response_CreateOfferWithTier_BCCLoyallist_BCOM.json"
      ],
      "line": 185
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 187,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 189,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 190
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_ViewOfferWithTier_BCCLoyallist_BCOM.json"
      ],
      "line": 191
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 193,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 194
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 195
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 197,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 198
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 199
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 201,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 202
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 203
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 977833078,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 11413609,
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following 2 assertions failed:\r\n1) [The EffectiveDate value is: ] expected:\u003c\"2017-12-11T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-11T[00]:00:00.000\"\u003e\r\n2) [The ExpirationDate value is: ] expected:\u003c\"2017-12-31T[11]:59:00.000\"\u003e but was:\u003c\"2017-12-31T[23]:59:00.000\"\u003e\r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:116)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validateOffer(OfferResponseValidator.java:115)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validate(OfferResponseValidator.java:35)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.offetool.StepDefinition.validateOffer(StepDefinition.java:47)\r\n\tat ✽.Then I Verify Offer Response(features/OfferTool/ViewOfferScenarios.feature:187)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 206,
  "name": "Verify View offer response when tier selected ThirdPartyLoyalist",
  "description": "",
  "id": "view-offer-scenarios;verify-view-offer-response-when-tier-selected-thirdpartyloyalist",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 205,
      "name": "@scenario10"
    }
  ]
});
formatter.step({
  "line": 207,
  "name": "I Create Offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 208
    },
    {
      "cells": [
        "POST",
        "Request_CreateOfferWithTier_ThirdPartyLoyalist_BCOM.json",
        "Response_CreateOfferWithTier_ThirdPartyLoyalist_BCOM.json"
      ],
      "line": 209
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 211,
  "name": "I Verify Offer Response",
  "keyword": "Then "
});
formatter.step({
  "line": 213,
  "name": "I Retrieve offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters",
        "responseFile"
      ],
      "line": 214
    },
    {
      "cells": [
        "GET",
        "offerCode\u003dofferCode",
        "Response_ViewOfferWithTier_ThirdPartyLoyalist_BCOM.json"
      ],
      "line": 215
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 217,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 218
    },
    {
      "cells": [
        "PATCH",
        "APPROVED",
        "Request_UpdateOffer.json"
      ],
      "line": 219
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 221,
  "name": "I update offer status",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "offerStatus",
        "requestFile"
      ],
      "line": 222
    },
    {
      "cells": [
        "PATCH",
        "CANCELLED",
        "Request_UpdateOffer.json"
      ],
      "line": 223
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 225,
  "name": "I Delete offer",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "pathParameters"
      ],
      "line": 226
    },
    {
      "cells": [
        "DELETE",
        "offerCode\u003dofferCode"
      ],
      "line": 227
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createOffer(DataTable)"
});
formatter.result({
  "duration": 785910914,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateOffer()"
});
formatter.result({
  "duration": 13173824,
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following 2 assertions failed:\r\n1) [The EffectiveDate value is: ] expected:\u003c\"2017-12-11T[12]:00:00.000\"\u003e but was:\u003c\"2017-12-11T[00]:00:00.000\"\u003e\r\n2) [The ExpirationDate value is: ] expected:\u003c\"2017-12-31T[11]:59:00.000\"\u003e but was:\u003c\"2017-12-31T[23]:59:00.000\"\u003e\r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:116)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validateOffer(OfferResponseValidator.java:115)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.OfferResponseValidator.validate(OfferResponseValidator.java:35)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.offetool.StepDefinition.validateOffer(StepDefinition.java:47)\r\n\tat ✽.Then I Verify Offer Response(features/OfferTool/ViewOfferScenarios.feature:211)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.retrieveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.approveOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.deleteOffer(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("features/dbConnectionCheck.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: en"
    }
  ],
  "line": 2,
  "name": "DataBase connection check feature",
  "description": "",
  "id": "database-connection-check-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "DataBase connection check",
  "description": "",
  "id": "database-connection-check-feature;database-connection-check",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@sanity"
    },
    {
      "line": 6,
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "DataBase connection check Test",
  "keyword": "Given "
});
formatter.match({
  "location": "DBConnectionCheckSteps.database_connection_check_Test()"
});
formatter.result({
  "duration": 7429198122,
  "status": "passed"
});
formatter.uri("features/tibcoConnectionCheck.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: en"
    }
  ],
  "line": 2,
  "name": "Tibco connection check feature",
  "description": "",
  "id": "tibco-connection-check-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Tibco connection check",
  "description": "",
  "id": "tibco-connection-check-feature;tibco-connection-check",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@sanity"
    },
    {
      "line": 6,
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Tibco connection check Test",
  "keyword": "Given "
});
formatter.match({
  "location": "TibcoConnectionCheckSteps.tibco_connection_check_Test()"
});
formatter.result({
  "duration": 6607847674,
  "status": "passed"
});
});
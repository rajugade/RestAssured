$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/LtyCustomer/LoyalityCusEnrollNegativeScenarios.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: en"
    }
  ],
  "line": 2,
  "name": "cusEnroll negative scenarios",
  "description": "",
  "id": "cusenroll-negative-scenarios",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Enroll Customer with IRN",
  "description": "",
  "id": "cusenroll-negative-scenarios;enroll-customer-with-irn",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I Enroll Customer with IRN",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "AccountType",
        "requestFile"
      ],
      "line": 7
    },
    {
      "cells": [
        "POST",
        "A",
        "Request_IRNCusenroll.xml"
      ],
      "line": 8
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I try to enroll Customer with enrolled phone number",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "Negative",
        "AccountType",
        "requestFile"
      ],
      "line": 10
    },
    {
      "cells": [
        "POST",
        "PHONE ALREADY EXISTS",
        "A",
        "Request_IRNCusenroll.xml"
      ],
      "line": 11
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I try to enroll Customer invalid name",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "Negative",
        "AccountType",
        "requestFile"
      ],
      "line": 13
    },
    {
      "cells": [
        "POST",
        "Name information is missing",
        "A",
        "Request_IRNCusenroll.xml"
      ],
      "line": 14
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CustomerEnrollSteps.i_Enroll_Customer(DataTable)"
});
formatter.result({
  "duration": 5884133069,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_try_to_enroll_Customer(DataTable)"
});
formatter.result({
  "duration": 2320812368,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_try_to_enroll_Customer(DataTable)"
});
formatter.result({
  "duration": 1954115168,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Enroll Customer with IRN",
  "description": "",
  "id": "cusenroll-negative-scenarios;enroll-customer-with-irn",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I Enroll Customer with IRN",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "AccountType",
        "requestFile"
      ],
      "line": 19
    },
    {
      "cells": [
        "POST",
        "A",
        "Request_IRNCusenroll.xml"
      ],
      "line": 20
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I try to enroll Customer with enrolled account number",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "Negative",
        "AccountType",
        "requestFile"
      ],
      "line": 22
    },
    {
      "cells": [
        "POST",
        "System Exception",
        "A",
        "Request_IRNCusenroll.xml"
      ],
      "line": 23
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I try to enroll Customer invalid zipcode",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "Negative",
        "AccountType",
        "requestFile"
      ],
      "line": 25
    },
    {
      "cells": [
        "POST",
        "ZIP CODE MUST BE NUMERIC",
        "A",
        "Request_IRNCusenroll.xml"
      ],
      "line": 26
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CustomerEnrollSteps.i_Enroll_Customer(DataTable)"
});
formatter.result({
  "duration": 2340881236,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_try_to_enroll_Customer(DataTable)"
});
formatter.result({
  "duration": 2401151986,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_try_to_enroll_Customer(DataTable)"
});
formatter.result({
  "duration": 1979926001,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Enroll Customer with PROP",
  "description": "",
  "id": "cusenroll-negative-scenarios;enroll-customer-with-prop",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@Scenario3"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "I Enroll Customer with PROP",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "AccountType",
        "requestFile"
      ],
      "line": 31
    },
    {
      "cells": [
        "POST",
        "P",
        "Request_IRNCusenroll.xml"
      ],
      "line": 32
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "I try to enroll Customer with enrolled phone number",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "Negative",
        "AccountType",
        "requestFile"
      ],
      "line": 34
    },
    {
      "cells": [
        "POST",
        "PHONE ALREADY EXISTS",
        "P",
        "Request_IRNCusenroll.xml"
      ],
      "line": 35
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I try to enroll Customer invalid name",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "Negative",
        "AccountType",
        "requestFile"
      ],
      "line": 37
    },
    {
      "cells": [
        "POST",
        "Name information is missing",
        "P",
        "Request_IRNCusenroll.xml"
      ],
      "line": 38
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CustomerEnrollSteps.i_Enroll_Customer(DataTable)"
});
formatter.result({
  "duration": 2705386337,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_try_to_enroll_Customer(DataTable)"
});
formatter.result({
  "duration": 2150278096,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_try_to_enroll_Customer(DataTable)"
});
formatter.result({
  "duration": 1889110836,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "Enroll Customer with PROP",
  "description": "",
  "id": "cusenroll-negative-scenarios;enroll-customer-with-prop",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 40,
      "name": "@Scenario4"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "I Enroll Customer with PROP",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "AccountType",
        "requestFile"
      ],
      "line": 43
    },
    {
      "cells": [
        "POST",
        "P",
        "Request_IRNCusenroll.xml"
      ],
      "line": 44
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "I try to enroll Customer with enrolled account number",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "Negative",
        "AccountType",
        "requestFile"
      ],
      "line": 46
    },
    {
      "cells": [
        "POST",
        "System Exception",
        "P",
        "Request_IRNCusenroll.xml"
      ],
      "line": 47
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I try to enroll Customer invalid zipcode",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "Negative",
        "AccountType",
        "requestFile"
      ],
      "line": 49
    },
    {
      "cells": [
        "POST",
        "ZIP CODE MUST BE NUMERIC",
        "P",
        "Request_IRNCusenroll.xml"
      ],
      "line": 50
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CustomerEnrollSteps.i_Enroll_Customer(DataTable)"
});
formatter.result({
  "duration": 2263616373,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_try_to_enroll_Customer(DataTable)"
});
formatter.result({
  "duration": 2153542297,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_try_to_enroll_Customer(DataTable)"
});
formatter.result({
  "duration": 1958900495,
  "status": "passed"
});
formatter.uri("features/LtyCustomer/LoyaltyCusLookupNegativeScenarios.feature");
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
  "name": "Enroll Customer with IRN",
  "description": "",
  "id": "loyalty-lookup-scenarios;enroll-customer-with-irn",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I Enroll Customer with IRN",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "AccountType",
        "requestFile"
      ],
      "line": 7
    },
    {
      "cells": [
        "POST",
        "A",
        "Request_IRNCusenroll.xml"
      ],
      "line": 8
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I do CusInfoMaint",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "Scenario",
        "requestFile",
        "responseFile"
      ],
      "line": 10
    },
    {
      "cells": [
        "POST",
        "Negative",
        "Request_cusLookup_cusInfoMaint.xml",
        "Response_cusLookup_CusInfoMaint.xml"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I do CusAcctMaint",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "Scenario",
        "requestFile",
        "responseFile"
      ],
      "line": 13
    },
    {
      "cells": [
        "POST",
        "Negative",
        "Request_cusLookup_cusAcctMaint_wrongTier.xml",
        "Response_cusLookup_CusInfoMaint.xml"
      ],
      "line": 14
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I do CusNotesMaint",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "Scenario",
        "requestFile",
        "responseFile"
      ],
      "line": 16
    },
    {
      "cells": [
        "POST",
        "Negative",
        "Request_cusLookup_cusNotesMaint_wrongNotePriority.xml",
        "Response_cusLookup_CusInfoMaint.xml"
      ],
      "line": 17
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I CusLookUp by Phone",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "Scenario",
        "requestFile",
        "responseFile"
      ],
      "line": 19
    },
    {
      "cells": [
        "POST",
        "Negative",
        "Request_cusLookup_byPhone.xml",
        "Response_cusLookup_IRN.xml"
      ],
      "line": 20
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I CusLookUp by ZipCode",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "Scenario",
        "requestFile",
        "responseFile"
      ],
      "line": 22
    },
    {
      "cells": [
        "POST",
        "Negative",
        "Request_cusLookup_byZipCode.xml",
        "Response_cusLookup_ByZipCode.xml"
      ],
      "line": 23
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I CusLookUp by Name",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "Scenario",
        "NameType",
        "requestFile",
        "responseFile"
      ],
      "line": 25
    },
    {
      "cells": [
        "POST",
        "Negative",
        "LastName",
        "Request_cusLookup_byName.xml",
        "Response_cusLookup_ByZipCode.xml"
      ],
      "line": 26
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I CusLookUp by Account Number",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "Scenario",
        "requestFile",
        "responseFile"
      ],
      "line": 28
    },
    {
      "cells": [
        "POST",
        "Negative",
        "Request_cusLookup_Scenario.xml",
        "Response_cusLookup_IRN.xml"
      ],
      "line": 29
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CustomerEnrollSteps.i_Enroll_Customer(DataTable)"
});
formatter.result({
  "duration": 2075165134,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_do_CusInfoMaint(DataTable)"
});
formatter.result({
  "duration": 1747903479,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_do_CusAcctMaint(DataTable)"
});
formatter.result({
  "duration": 1959446595,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_do_CusNotesMaint(DataTable)"
});
formatter.result({
  "duration": 1795456976,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_CusLookUp_by_Phone(DataTable)"
});
formatter.result({
  "duration": 1848007054,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_CusLookUp_by_ZipCode(DataTable)"
});
formatter.result({
  "duration": 1846431189,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_CusLookUp_by_Name(DataTable)"
});
formatter.result({
  "duration": 2041387736,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_LookUp_Customer(DataTable)"
});
formatter.result({
  "duration": 2005593573,
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following assertion failed:\r\n1) [The Fault code is: ] \r\nExpecting:\r\n \u003c\"\u003c?xml version\u003d\"1.0\" encoding\u003d\"UTF-8\"?\u003e\n\u003cSOAP-ENV:Envelope xmlns:SOAP-ENV\u003d\"http://schemas.xmlsoap.org/soap/envelope/\"\u003e\u003cSOAP-ENV:Body\u003e\u003cSOAP-ENV:Fault\u003e\u003cfaultcode\u003eSOAP-ENV:Server\u003c/faultcode\u003e\u003cfaultstring\u003eThis is an operation implementation generated fault\u003c/faultstring\u003e\u003cfaultactor/\u003e\u003cdetail\u003e\u003cns:CusFault xmlns:ns0\u003d\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns\u003d\"http://loyalty.macys.com/schemas/loyalty.customer/CusResponse/v11_0\" xmlns:xsi\u003d\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xs\u003d\"http://www.w3.org/2001/XMLSchema\"\u003e\u003cns1:ErrorCode xmlns:ns1\u003d\"http://loyalty.macys.com/schemas/loyalty.customer/MacysCommon/v11_0\"\u003e1006\u003c/ns1:ErrorCode\u003e\u003cns1:ErrorMsg xmlns:ns1\u003d\"http://loyalty.macys.com/schemas/loyalty.customer/MacysCommon/v11_0\"\u003eSystem Unavailable\u003c/ns1:ErrorMsg\u003e\u003c/ns:CusFault\u003e\u003c/detail\u003e\u003c/SOAP-ENV:Fault\u003e\u003c/SOAP-ENV:Body\u003e\u003c/SOAP-ENV:Envelope\u003e\"\u003e\r\nto contain:\r\n \u003c\"INVALID LOYALTY ID\"\u003e \r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:116)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.CusLookupRespValidator.validate500(CusLookupRespValidator.java:159)\r\n\tat com.macys.marketing.loyalty.LtyIntegrationTest.steps.ltyLookUp.CustomerEnrollSteps.i_LookUp_Customer(CustomerEnrollSteps.java:90)\r\n\tat ✽.And I CusLookUp by Account Number(features/LtyCustomer/LoyaltyCusLookupNegativeScenarios.feature:27)\r\n",
  "status": "failed"
});
formatter.uri("features/LtyCustomer/LoyaltyCustomerEnroll.feature");
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
  "name": "Enroll Customer with IRN",
  "description": "",
  "id": "loyalty-lookup-scenarios;enroll-customer-with-irn",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I Enroll Customer with IRN",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "AccountType",
        "requestFile"
      ],
      "line": 7
    },
    {
      "cells": [
        "POST",
        "A",
        "Request_IRNCusenroll.xml"
      ],
      "line": 8
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I do CusInfoMaint",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 10
    },
    {
      "cells": [
        "POST",
        "Request_cusLookup_cusInfoMaint.xml",
        "Response_cusLookup_CusInfoMaint.xml"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I CusLookUp by Phone",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 13
    },
    {
      "cells": [
        "POST",
        "Request_cusLookup_byPhone.xml",
        "Response_cusLookup_IRN.xml"
      ],
      "line": 14
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I CusLookUp by Account Number",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 16
    },
    {
      "cells": [
        "POST",
        "Request_cusLookup_Scenario.xml",
        "Response_cusLookup_IRN.xml"
      ],
      "line": 17
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I CusLookUp by ZipCode",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 19
    },
    {
      "cells": [
        "POST",
        "Request_cusLookup_byZipCode.xml",
        "Response_cusLookup_ByZipCode.xml"
      ],
      "line": 20
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I CusLookUp by Name",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 22
    },
    {
      "cells": [
        "POST",
        "Request_cusLookup_byName.xml",
        "Response_cusLookup_ByZipCode.xml"
      ],
      "line": 23
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I do CusNotesMaint",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 25
    },
    {
      "cells": [
        "POST",
        "Request_cusLookup_cusNotesMaint.xml",
        "Response_cusLookup_CusInfoMaint.xml"
      ],
      "line": 26
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I do CusAcctMaint",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 28
    },
    {
      "cells": [
        "POST",
        "Request_cusLookup_cusAcctMaint.xml",
        "Response_cusLookup_CusInfoMaint.xml"
      ],
      "line": 29
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CustomerEnrollSteps.i_Enroll_Customer(DataTable)"
});
formatter.result({
  "duration": 2208688598,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_do_CusInfoMaint(DataTable)"
});
formatter.result({
  "duration": 2082650601,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_CusLookUp_by_Phone(DataTable)"
});
formatter.result({
  "duration": 3312061505,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_LookUp_Customer(DataTable)"
});
formatter.result({
  "duration": 2517190829,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_CusLookUp_by_ZipCode(DataTable)"
});
formatter.result({
  "duration": 2535673568,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_CusLookUp_by_Name(DataTable)"
});
formatter.result({
  "duration": 2497127521,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_do_CusNotesMaint(DataTable)"
});
formatter.result({
  "duration": 2887737246,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_do_CusAcctMaint(DataTable)"
});
formatter.result({
  "duration": 2419071090,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Enroll Customer with PROP",
  "description": "",
  "id": "loyalty-lookup-scenarios;enroll-customer-with-prop",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "I Enroll Customer with PROP",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "AccountType",
        "requestFile"
      ],
      "line": 34
    },
    {
      "cells": [
        "POST",
        "P",
        "Request_IRNCusenroll.xml"
      ],
      "line": 35
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "I do CusInfoMaint",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 37
    },
    {
      "cells": [
        "POST",
        "Request_cusLookup_cusInfoMaint.xml",
        "Response_cusLookup_CusInfoMaint.xml"
      ],
      "line": 38
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "I CusLookUp by Phone",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 40
    },
    {
      "cells": [
        "POST",
        "Request_cusLookup_byPhone.xml",
        "Response_cusLookup_IRN.xml"
      ],
      "line": 41
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I CusLookUp by Account Number",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 43
    },
    {
      "cells": [
        "POST",
        "Request_cusLookup_Scenario.xml",
        "Response_cusLookup_IRN.xml"
      ],
      "line": 44
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I CusLookUp by ZipCode",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 46
    },
    {
      "cells": [
        "POST",
        "Request_cusLookup_byZipCode.xml",
        "Response_cusLookup_ByZipCode.xml"
      ],
      "line": 47
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I CusLookUp by Name",
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
        "Request_cusLookup_byName.xml",
        "Response_cusLookup_ByZipCode.xml"
      ],
      "line": 50
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "I do CusNotesMaint",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 52
    },
    {
      "cells": [
        "POST",
        "Request_cusLookup_cusNotesMaint.xml",
        "Response_cusLookup_CusInfoMaint.xml"
      ],
      "line": 53
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "I do CusAcctMaint",
  "rows": [
    {
      "cells": [
        "requestMethod",
        "requestFile",
        "responseFile"
      ],
      "line": 55
    },
    {
      "cells": [
        "POST",
        "Request_cusLookup_cusAcctMaint.xml",
        "Response_cusLookup_CusInfoMaint.xml"
      ],
      "line": 56
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CustomerEnrollSteps.i_Enroll_Customer(DataTable)"
});
formatter.result({
  "duration": 2337614042,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_do_CusInfoMaint(DataTable)"
});
formatter.result({
  "duration": 1981943194,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_CusLookUp_by_Phone(DataTable)"
});
formatter.result({
  "duration": 2582977748,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_LookUp_Customer(DataTable)"
});
formatter.result({
  "duration": 2425843676,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_CusLookUp_by_ZipCode(DataTable)"
});
formatter.result({
  "duration": 2386500929,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_CusLookUp_by_Name(DataTable)"
});
formatter.result({
  "duration": 2428575033,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_do_CusNotesMaint(DataTable)"
});
formatter.result({
  "duration": 1937452906,
  "status": "passed"
});
formatter.match({
  "location": "CustomerEnrollSteps.i_do_CusAcctMaint(DataTable)"
});
formatter.result({
  "duration": 1924148499,
  "status": "passed"
});
});
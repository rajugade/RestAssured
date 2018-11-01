function () {    
  var env = 'qa'; // get system property 'karate.env'
  karate.log('karate.env system property was:', env);
  if (!env) {
    env = 'dev';
  }
  
  var config = karate.read('classpath:properties-' +env+ '.yaml');
  //karate.log('karate.env ************', config.urls);
  
    //env: env,
	//myVarName: 'someValue',
	//someUrl: 'https://jsonplaceholder.typicode.com'
  //}
//  var config = {
//		    env: env,
//			myVarName: 'https://jsonplaceholder.typicode.com'
//		  }
  
  if (env == 'dev') {
    // customize
    // e.g. config.foo = 'bar';
	  config.someBaseUrl ='';
  } else if (env == 'e2e') {
	  config.someBaseUrl ='';
  }
  return config;
}
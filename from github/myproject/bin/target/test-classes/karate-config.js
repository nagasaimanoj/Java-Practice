function() {
  var env = karate.env || 'dev';
  karate.log('karate.env system property was:', env);
  var config = {
    env: env,
    myVarName: 'someValue'
  }
  return config;
}
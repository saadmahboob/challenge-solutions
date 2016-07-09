// function only gets called for the first time
var callMe = (function() {
  var called = false;
  return function() {
    if(!called) {
      console.log("Called");
      called = true;
    }
  };
})();

callMe();
callMe();
callMe();


api = (function () {

      function getCalculations(numbers,callback) {
          /*var url= "http://localhost:5000/Calculation";*/
          var url= "https://fast-tundra-04632.herokuapp.com/Calculation";
          axios.post(url,numbers)
              .then(res => {
                    var theObject = JSON.parse(res.data);
                    callback(theObject);
              }
          )
      }

      return {
          getCalculations: getCalculations
      }
})();
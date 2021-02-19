app = (function () {

  var numbers;
  var useModuleApiclient = "js/apiclient.js";

  function setNumbers() {
          numbers= $("#numbers").val();
      }

  function getCalculations() {
          if ($("#numbers").val() === ""){
                        alert("You must write the numbers");
          }else{
             setNumbers();
          }
          clearTableNumbers();
          $.getScript(useModuleApiclient, function(){
            api.getCalculations(numbers,convertElementsToObject);
          });
      }


  function convertElementsToObject(calculatedValues) {
          var valueMean = calculatedValues.valueMean;
          var valueDeviation = calculatedValues.valueDeviation;
          $("#Mean").text("Main: "+valueMean);
          $("#Deviation").text("Deviation: "+valueDeviation);
          updateTable();
      }

  function updateTable() {
          var len = numbers.split(" ").length;
          var numberList = numbers.split(" ");
          for(var i = 0; i < len; i++){
            var row = '<tr><td>'+numberList[i]+'</td><td>'+'</tr>';
            $("#table").append(row)
          }
      }

   function clearTableNumbers(){
           var table = document.getElementById("table");
           if (table.rows.length>1) {
                for(var i = table.rows.length - 1; i > 0; i--){table.deleteRow(i);}
           }
       }

   return {
           getCalculations: getCalculations
           }
})();
# bean-validation-demo
curl commands for verification of using validation annotations:

curl -XPOST -H "Content-type: application/json" -d '{"value1":1,"value2":"2","value3":"3"}' 'localhost:8081/data-valid'

curl -XPOST -H "Content-type: application/json" -d '{"value1":1,"value2":"2"}' 'localhost:8081/data-valid'

curl -XPOST -H "Content-type: application/json" -d '{"value1":1}' 'localhost:8081/data-valid'

curl -XPOST -H "Content-type: application/json" -d '{"value1":1,"value2":"2","value3":"3"}' 'localhost:8081/data-validated'

curl -XPOST -H "Content-type: application/json" -d '{"value1":1,"value2":"2"}' 'localhost:8081/data-validated'

curl -XPOST -H "Content-type: application/json" -d '{"value1":1}' 'localhost:8081/data-validated'






Run below curl commands also by removing @Valid annotation in NestedData.java class.

curl -XPOST -H "Content-type: application/json" -d '{"value1":1,"value2":"2","value3":"3", "nestedData":{"value1":1,"value2":"2","value3":"3"}}' 'localhost:8081/nested-data-validated'

curl -XPOST -H "Content-type: application/json" -d '{"value1":1,"value2":"2","value3":"3", "nestedData":{"value1":1,"value2":"2"}}' 'localhost:8081/nested-data-validated'

curl -XPOST -H "Content-type: application/json" -d '{"value1":1,"value2":"2","value3":"3", "nestedData":{"value1":1,"value2":"2", "value3":""}}' 'localhost:8081/nested-data-validated'

curl -XPOST -H "Content-type: application/json" -d '{"value1":1,"value2":"2", "nestedData":{"value1":1,"value2":"2","value3":"3"}}' 'localhost:8081/nested-data-validated'

curl -XPOST -H "Content-type: application/json" -d '{"value1":1,"value2":"2","value3":"3", "nestedData":{"value1":1,"value2":"2","value3":"3"}}' 'localhost:8081/nested-data-valid'

curl -XPOST -H "Content-type: application/json" -d '{"value1":1,"value2":"2","value3":"3", "nestedData":{"value1":1,"value2":"2"}}' 'localhost:8081/nested-data-validation'

curl -XPOST -H "Content-type: application/json" -d '{"value1":1,"value2":"2","value3":"3", "nestedData":{"value1":1,"value2":"2", "value3":""}}' 'localhost:8081/nested-data-valid'

curl -XPOST -H "Content-type: application/json" -d '{"value1":1,"value2":"2", "nestedData":{"value1":1,"value2":"2","value3":"3"}}' 'localhost:8081/nested-data-valid'


Use branch bean-validation-without-exception-handler for observing behaviour without exception handler.


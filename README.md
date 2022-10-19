# backend_rll
FLOW/EXECUTIONAL CONCEPT:

admin==>maintain lifecycle of customer,Manager and Engineer(crud operation)

manager==>view ticket&their status
            ==>assign complaint to engineer
             ==>view feedback
             
Engineer==>view and makes changes based on complaints
              ==>assign new status
               ==view feedback
               
Customer==>raise and track complaint
                ==>provide feedback for particular event.


SERVER PORT CONNECTION TO BE SPECIFIED FOR FRONT END CONNECTION WITH BACKEND PART=8081
->_service=>user.service.ts=>userService
i.e:PATH_OF_API='http://localhost:8081';

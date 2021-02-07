# glaucusTask

Problem statement:- Multiple thread try to update integer value of mysql database table

Project setup:- 
* Create mysql database name "testdb"
* Change username and password of mysql db in application.properties uner resources folder

Test scenario:-
* Run HTTPRequest.jx file(Current for 1000, need to edit "ThreadGroup.num_threads" XML tag for more concurrent threads and allocate jvm memory accordingly)
* Or run GET localhost:8080/counter/task

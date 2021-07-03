## SPRING SERVER FOR 'CAMSMART' - AN AI ASSISTED SURVEILLANCE SOLUTION.

THIS FOLDER ALSO CONTAINS THE DOCKER FILE FOR SPRING.
CONTAINERIZE AND RUN IN PORT 8080 TO USE THE SERVER.
ALSO, USES A MYSQL CONTAINER AS THE DATABASE.

If you want to run the entire project as logically split containerized microservices, feel free to pull the images from my dockerhub acc. 
They're public repos.

Run the following commands to run the server as containers: 

First, create a custom docker network using the command:
 
  docker network create web-application-mysql-network
  
Then:

1. docker pull mysql:5.7
2. docker pull vishakhavel/tarp:spring_v1 
3. docker run --detach --env MYSQL_ROOT_PASSWORD=vichu --env MYSQL_USER=vichu --env MYSQL_PASSWORD=vichu --env MYSQL_DATABASE=prof_data --name database --publish    3306:3306 --network=web-application-mysql-network --volume mysql-database-volume:/var/lib/mysql  mysql:5.7
4. docker container run -p 8080:8080 --network=web-application-mysql-network -e RDS_HOSTNAME=database vishakhavel/tarp:spring_v1 

 




# rapsql #
!!! For DEV purposes only, do not use in production with insecure credentials and privileges !!!

RAPSQL is a pseudonym for 'Restful Age PostgreSQL'. On the one hand, it serves to provide a ready-to-use stack to a public community for the further development of open source database services. On the other hand, features like rest-compatible queries for Apache AGE Cypher queries are implemented (currently in progress). Other features that are being developed as part of a feasibility study on the interoperability of graph databases using SPARQL with Apache AGE will also be added to this repo in the future.

## How to get started ##
You need to have [docker with compose](https://docs.docker.com/get-docker/) installed on your machine. There are just a few steps to get this rapsql-stack running. Just follow this short instrucitons (=

1. Clone this repository 
2. Configuration
    1. Change file name 'dotenv' to '.env'
    2. (Optional) Open .env and change your credentials
        1. Note that there are some dependencies to the initial building script in ./pgdbconf/schema.sql
        2. You can find comment tags where changes have no or different dependencies
    3. Since there is no official docker image for apache/age-viewer at this time, you need to build this one one your own. And If you are not familiar with creating your own local docker images or don't want to use age-viewer, you can simply open docker-compose.yml and comment out this service. But don't worry, every necessary step is described below ;)
        1. Clone repo https://github.com/apache/age-viewer to a local folder
        2. Open docker-compose.yml of rapsql
        3. Navigate to service: age-viewer 
        4. Change context "/usr/local/docker/age-viewer/" to your choosen local folder path
    4. (Optional) When your machine has an ARM architecture (e. g. Raspberry Pi) you need to change the swagger image as well
        1. Open docker-compose.yml of rapsql
        2. Navigate to service: swagger
        3. Change the image (see comments) or comment out the hole swagger section, if you don't want to use this unofficial image
3. And that's it, we're up to deploy the stack (see next section :) 

## Docker Commands on CLI
Once all the pre-settings are complete, we can get the rapsql stack up and running. Simply open a terminal or your favorite shell, navigate to your rapsql path and use the docker compose tool.

Run the stack 
~~~
    docker compose up
~~~    
This command builds and downloads all missing images from the Docker registry. The build step can take a while. Once you have downloaded all the images to your local machine, the command runs much faster.

(Optional) Run services in background using "detached" mode (-d flag)
~~~
    docker compose up -d
~~~  
See what is currently running
~~~
    docker compose ps
~~~  
Shut down containers
~~~
    docker compose stop
~~~     
Run the stopped containers again
~~~
    docker compose start
~~~ 
Delete all containers without docker volumes
~~~
    docker compose down
~~~ 
Delete all containers with volumes using -v flag
~~~
    docker compose down -v
~~~ 

## Community
There is still one thing left... the support of the open source community!

Leave [Postgres](https://github.com/postgres/postgres), [Apache AGE](https://github.com/apache/age/), [Apache AGE Viewer](https://github.com/apache/age-viewer), [pgAdmin 4](https://github.com/pgadmin-org/pgadmin4), [PostgREST](https://github.com/PostgREST/postgrest), [Swagger-UI](https://github.com/swagger-api/swagger-ui) and [RAPSQL](https://github.com/OpenSemanticLab/rapsql/) a star if like ;-)

## Further Development
The goal of this project is to enable a drop-in replacement of graph databases with Postgres.

The progress of custum- features can be found in [./dev*](https://github.com/OpenSemanticLab/rapsql/tree/main/dev).

1. Function for JSON return by a dyanamic_string query as Remote Procedure Call (in work)
2. Research and implementation of a transpiler module for SPARQL to Cypher (to do)





         
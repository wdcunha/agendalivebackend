# Agenda Live

This project was cloned from [Michelli Brito repo](https://github.com/MichelliBrito/agendalive) and it was developed in Java language. It is part of [Angular 9 tutorial](https://www.youtube.com/playlist?list=PL8iIphQOyG-DSLV6qWs8wh37o0R_F9Q_Q).

## Database (Mongo)

In the video [Curso Angular 9 #07 Criando Models](https://www.youtube.com/watch?v=_u5SOAYQhtw&list=PL8iIphQOyG-DSLV6qWs8wh37o0R_F9Q_Q&index=7) shows a database that is used to connect UI with backend, but there is no explanation how to get it. Then I looked for tutorial on her youtube channel and I found this one [API REST com Spring Webflux e MongoDB: parte1 - iniciando o projeto](https://www.youtube.com/watch?v=_u5SOAYQhtw&list=PL8iIphQOyG-DSLV6qWs8wh37o0R_F9Q_Q&index=7), but it points to MLab that now is [Atlas](https://cloud.mongodb.com/) , so there's a trick to create the project and database. When singing up, it will be offered the free project type you can create, as indicated on her video, I chose Sandbox, so the Cluster is created.

The [Atlas page](https://cloud.mongodb.com/) is completely different from the MLab, then to create an username is necessary to click on the Database Access at the aside menu on the left side of the screen and there is a green button to ADD NEW DATABASE USER, thereafter is straightforward, just to fill the fields. 

To create the database that is not so straightforward, so go back to Cluster (aside menu on the left side), click on the butto COLLECTIONS, on the page that opens, click on the button + Create Database and there's nothing special, just fill out the fields, just that have database name and collection name.

After created, go to Cluster (aside menu on the left side) and click on the button CONNECT, on the modal I chose "Connect your application" option, then Java in the DRIVER dropdown with 4.1 or later VERSION, so it will be shown the address to connect: `mongodb+srv://<username>:<password>@cluster0.vdf5v.mongodb.net/<dbname>?retryWrites=true&w=majority`. I copied this address and pasted in the application.properties preceded by `spring.data.mongodb.uri=`.

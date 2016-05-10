# abs-chat-api
Modulo server per la gestione di una comunicazione chat, testuale o video.

### Prerequisiti
- [JDK 8]
- [Maven 3.x.x]
- [Git]
- [MySql 5.x.x]
- [Tomcat 8.x.x]

### Git setup
Per configurare correttamente il vostro repo git locale eseguite i seguenti comandi:
```sh
$ git clone https://github.com/AdvancedBusinessSolutions/abs-chat-api.git
$ cd abs-chat-api
$ git config --global push.default simple
$ git config user.email "your-name@absontheweb.com"
$ git config user.name "your-name"
```

OPPURE

importate direttamente da Eclipse tramite il plugin di git il progetto:
"Import -> Project from git -> Clone URI -> Import As General Project"


### Build
Dal prompt della shell eseguire il comando:
```sh
$ mvn clean package
```
la build produrrà il file **abs-chat-api.war** che di default sarà depositato nella cartella **./deploy**. 
E' possibile modificare la cartella di deploy specificando la proprietà maven:

```sh
$ mvn clean package "-Dcontainer.deploy.dir=/opt/apache-tomcat-8.0.32/webapps"
```

La build da eclipse ovviamente sarà con i soli goal più l'eventuale opzione per specificare la directory di deploy:
```
clean package "-Dcontainer.deploy.dir=/opt/apache-tomcat-8.0.32/webapps"
```

OPPURE

da Eclipse convertire il progetto in un Maven Project ed effettuare: "Maven -> Update Project"

In fase di configurazione del progetto in Eclipse settare la corretta JDK e convertire il progetto in un JPA project
Controllare che in "Properties->Project facets" vi siano le seguenti configurazioni:

DynamicWeModule 2.X
Java 1.8
javascript 1
jpa 2.X

### MySql Setup
In progress

### Tomcat Setup
In progress

### Test 
In progress


[Connector/J]: <https://dev.mysql.com/downloads/connector/j/>
[JDK 8]: <http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html>
[Maven 3.x.x]: <https://maven.apache.org/download.cgi>
[Git]: <https://git-scm.com/downloads>
[MySql 5.x.x]: <http://dev.mysql.com/downloads/>
[Tomcat 8.x.x]: <https://tomcat.apache.org/download-80.cgi>
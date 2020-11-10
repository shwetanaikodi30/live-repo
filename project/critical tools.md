:zero: MLP251 will be used for the settings.

:one: create customScripts folder

- [user profile path]/customScripts

:two: set environment variable

- control panel
- user accounts > user accounts
- change my environment variable
- add to path [user profile path]/customScripts
- example user profile is 53427

:three: create tomcat startup inside [user profile path]/customScripts

tomcatStart.sh

```sh
#! /bin/sh

#Start Tomcat server with
# ensure tomcat is inside  [user profile path] directory
cd ~/apache-tomcat-8.5.53-windows-x64/apache-tomcat-8.5.53/bin

./startup.sh
```

:four: create tomcat shutdown inside [user profile path]/customScripts
tomcatShutdown.sh

```sh
#! /bin/sh

#Shutdown Tomcat server with

cd ~/apache-tomcat-8.5.53-windows-x64/apache-tomcat-8.5.53/bin

./shutdown.sh
```

:five: configuring maven for tomcat at the user level

copy  
C:\apache-maven-3.6.3-bin\apache-maven-3.6.3\conf\settings.xml  
to  
C:\Users\53427\.m2

:beetle: if path error try C:\Users\53427\\.m2

:eye: place inside `<servers></servers>` tag

```xml
<server>
      <id>tomcat-server-8.5.53</id>
      <username>MLP251</username>
      <password>MLP251</password>
</server>
```

:six: config tomcat for user credentials

1 edit tomcat-users.xml inside the folder  
C:\Users\53427\apache-tomcat-8.5.53-windows-x64\apache-tomcat-8.5.53\conf

- paste inside <tomcat-users> at the beginning

```xml
<user username="MLP251" password="MLP251" roles="manager-script" />
```

:seven: configure the tomcat plugin inside the application [leavemanager]

- edit pom.xml and add tag below under `<pluginManagement></pluginManagement>`

```xml
<plugin>
          <groupId>org.apache.tomcat.maven</groupId>
          <artifactId>tomcat7-maven-plugin</artifactId>
          <version>2.2</version>
          <configuration>
            <url>http://localhost:8080/manager/text</url>
            <server>tomcat-server-8.5.53</server>
            <username>MLP251</username>
            <password>MLP251</password>
            <path>/MLP251</path>
            <update>true</update>
          </configuration>
</plugin>
```

:eight: start up tomcat
tomcatStart.sh

:nine: deploy [ or redeploy]
mvn tomcat7:deploy
mvn tomcat7:redeploy

:one::zero: test in postman.

test your application in postman using the url.

:one::one: shutdown tomcat [if required]  
tomcatShutdown.sh

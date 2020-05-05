# Asset-Manager
Java application to manage business assets

Inside manager-bff/src/main/resources you must add an application.properties file
This file will be structured as follows

## Spring DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties)
spring.datasource.url = jdbc:mysql://localhost:3306/asset_manager?serverTimezone=UTC&useLegacyDatetimeCode=false
spring.datasource.username = root
spring.datasource.password = password123


## Hibernate Properties
# The SQL dialect makes Hibernate generate better SQL for the chosen database
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect

# Hibernate ddl auto (create, create-drop, validate, update)
spring.jpa.hibernate.ddl-auto = update

the datasource should be your databse instance example data has been put in for reference

the hibernate dialect is up to your choosing. I personally used MySql for ease of setup.
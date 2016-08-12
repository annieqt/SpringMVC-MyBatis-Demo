# SpringMVC-MyBatis-Demo
This is a simple demo using Spring-MVC+MyBatis+MySQL+Maven.

* With the use of annotations like @Component @Service @Repository @Controller, the classes become singleton.
* The injection of 'sqlSessionFactory' makes it easier to load 'mybatis-config.xml', and 'sqlSessionFactory' also becomes a singleton.

To try it, you can simply filled in the database host, port and db name in the 'mvc-dispatcher-servlet.xml' file.

All the Dao named 'XXXMapper' should be placed in mapper package, because a 'MapperScannerConfigurer' has been defined in the 'mvc-dispatcher-servlet.xml' file to scan all the mappers.


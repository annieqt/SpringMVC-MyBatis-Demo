# springmvc-mybatis-demo
This is a simple demo using spring-mvc+mybatis+mysql+maven.

To try it, you can simply filled in the database host, port and db name in the 'mvc-dispatcher-servlet.xml' file.
All the Dao named 'XXXMapper' should be placed in mapper package, because a 'MapperScannerConfigurer' has been defined in the 'mvc-dispatcher-servlet.xml' file to scan all the mappers.


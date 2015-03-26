# springmvc-mybatis-demo
This is a simple demo using spring-mvc+mybatis+mysql+maven.

To try it, you can simply filled in the database host, port and db name in the 'mvc-dispatcher-servlet.xml' file.

note: 
There's still some bugs withreturning json data. I've tried several approaches such as:

  1.Add 'Accept headers' and 'produce parameters' to @RequestMapping
  
  2.Degrade the version of spring framework from 4.x.x to 3.0.7
  
but none of them worked.

If you have a better solution, please let me know. Thanks!

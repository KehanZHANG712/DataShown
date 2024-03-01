
The whole program need to download the database, backend code and the front code.

First, you need to ensure the databse works well in your computer, it is better for you to use mysql workbench or Navicat to edit the database.
Then, check the backend code, change the connection settings in the file called 'application' and make sure it fits your database well. Then just run the code.

  server.port=8080
  spring.datasource.url=jdbc:mysql://localhost:3306/re?characterEncoding=UTF-8&serverTimezone=UTC(your url)
  spring.datasource.username=root (your database)
  spring.datasource.password=123456  (your databse password)
  spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

Finally,  we could run the front end code and try to use the program, remember that the website can only recognize the data stored in the databse. Remenber to check the port you open is fit for the backend and it can get the data from the backend.

    // Various Dev Server settings
    host: 'localhost', // can be overwritten by process.env.HOST
    port: 8762, // can be overwritten by process.env.PORT, if port is in use, a free one will be determined
    autoOpenBrowser: false,
    errorOverlay: true,
    notifyOnErrors: true,
    poll: false, // https://webpack.js.org/configuration/dev-server/#devserver-watchoptions-
    
    
    

To test the program:
if you just want to edit the databse, use sql sentence directly in mysql or use Navicat to edit it is able.
 Mysql:   https://www.mysql.com/
 Navicat:   https://navicat.com/en/
If you want to test the back end and the database together, i recommend you use the Postman, which can simulate the data comes from the front end.
 Postman:   https://www.postman.com/product/what-is-postman/
If you want to test the front end just remember to use the "console.log" function well to get the website data and check if it is the same as your input
  Vue:    https://vuejs.org/  
  
  For the front_end:
  Download the code from Fronr-end 
  --npm install
  --npm run dev
  then run the back-end, you can run the whole project.

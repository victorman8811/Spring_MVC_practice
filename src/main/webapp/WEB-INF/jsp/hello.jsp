<!DOCTYPE html>
<html>
    <head>
        <title>Hello</title>
    </head>
    <body>
        <h1>Task List</h1>

        <table border=1>
          <tr>
            <th>Task_Seq</th>
            <th>Task_Name</th>
            <th>Description</th>
            <th>Delete</th>
          </tr>
          <tr>
            <td>USA</td>
            <td>Washington D.C.</td>
            <td>309 million</td>
            <td>English</td>
          </tr>
          <tr>
            <td>Sweden</td>
            <td>Stockholm</td>
            <td>9 million</td>
            <td>Swedish</td>
          </tr>
        </table>

        <h1>Add New Task</h1>

        <form action="/spring-fundamentals-study-and-quiz-ch2/handleRequest" method="post">
            <span>Name:</span>
            <input type="text" name="name" value=""/><br/>

            <span>Description:</span>
            <input type="text" name="description" value=""/><br/>

            <input type="submit" value="save"/>
         </form>
    </body>
</html>
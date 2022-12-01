<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Insert Title here </title>
</head>
<body>
<a href="newTask" >Add new task</a>
<h2>TODO list</h2>
<a href="sortByPriority">Sort by priority</a><br/>
<br/>
<table>
<tr>
<td>Priority</td>
<td>Description</td>
<td>Date</td>
</tr>
<#list tasks as task>
<tr>
<td>${task.priority}</td>
<td>${task.description}</td>
<td>${task.date}</td>
<td><a href="${'tasks/'+task.id}">Done</a></td>
</tr>
</#list>
</table>
</body>
</html>
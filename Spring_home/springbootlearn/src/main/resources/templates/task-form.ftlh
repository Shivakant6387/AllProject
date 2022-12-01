<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add new task</title>
</head>
<body>
<form action="/processForm" method="post">
<div>
<label>Description</label>
<input type="text" name="description"></input>
</div>

<div>
<label>priority</label>
<input type="number" name="priority"></input>
</div>
<div>
<label>Date</label>
<input type="date" name="date   "></input>
</div>
<input type="submit" value="Add" />
</form>
</body>
</html>
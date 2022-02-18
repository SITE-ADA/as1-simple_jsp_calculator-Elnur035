<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>WM2</title>
</head>
<body>
<br/>
<div style='margin:0 auto;width: 50%; text-align:center; color:green'>
<h2>Welcome To Calculation App</h2>
<form action="cal-servlet" method="post">
  <label>First </label>
  <input type="text" name="firstDigit">
  <select name="operation" id="">
    <option value="">Select</option>
    <option value="+">+</option>
    <option value="-">-</option>
    <option value="*">*</option>
    <option value="/">/</option>
  </select>
  <label>Second </label>
  <input type="text" name="secondDigit">
  <button type="submit">Calculate</button>
</form>
</div>
</body>
</html>
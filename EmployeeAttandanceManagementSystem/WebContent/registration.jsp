<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Home- Registration</title>
<h1>REGISTRATION</h1>
<style type="text/css">
#header {
	height: 50px;
}

#body {
	height: 500px;
}

#footer {
	height: 50px;
}

#pageLayout {
	width: 100%;
	text-align: center;
	background: #ffffff;
}

#prodSearchtab {
	width: 300px;
}

body {
	background: #999fff;
}

#container {
	margin-top: -250px;
}

#menubar {
	text-align: right;
}

.tdlbl {
	text-align: left;
	font-weight: bold;
	font-family: inherit;
}

#formTable {
	margin-top: 100px;
}

#formTable td {
	padding: 5px;
}

#registerBtn {
	margin-top: 10px;
	padding: 5px;
	width: 100px;
}

#dob {
	width: 170px;
}

input {
	border: 1px solid #999fff;
	border-radius: 5px;
	padding: 5px;
}
</style>
</head>
<body>
	<table id="pageLayout" BORDER="2">
		<tr>
			<th id="header">
				
			</th>
		</tr>
		<tr>
			<td id="body">
				<div id="container">
					<form action="registration" method="post">

						<table align="center" width="80%" id="formTable">
							<tr>
							<tr>
								<td class="tdlbl">Fisrt Name</td>
								<td><input type="text" name="fname" /></td>
							</tr>
							<tr>
								<td class="tdlbl">Last Name</td>
								<td><input type="text" name="lname " /></td>
							</tr>

							<tr>
								<td class="tdlbl">Date Of Birth</td>
								<td><input type="date" name="dateOfBirth" id="dob" /></td>
							</tr>
							<tr>
								<td class="tdlbl">Address</td>
								<td><input type="text" name="address" /></td>
							</tr>
							<tr>
								<td class="tdlbl">E-Mail</td>
								<td><input type="email" name="email" /></td>
							</tr>
							<tr>
								<td class="tdlbl">Mobile No</td>
								<td><input type="number" name="mobileNo" /></td>
							</tr>
							<tr>
								<td class="tdlbl">Street</td>
								<td><input type="text" name="street" /></td>
							</tr>
							<tr>
								<td class="tdlbl">City</td>
								<td><input type="text" name="city" /></td>
							</tr>
							<tr>
								<td class="tdlbl">State</td>
								<td><input type="text" name="state" /></td>
							</tr>
							<tr>
								<td class="tdlbl">Country</td>
								<td><input type="text" name="country" /></td>
							</tr>
							<tr>
								<td class="tdlbl">Pin Code</td>
								<td><input type="number" name="pin" /></td>
							</tr>

							<tr>
								<td colspan="2"><input id="registerBtn" type="submit"
									value="Register" title="Click here to register" /></td>
							</tr>
							<tr>
								<td colspan="2"><a href="logout" title="Go To Login">Go
										To Login</a></td>
							</tr>
						</table>

					</form>
				</div>


			</td>
		</tr>
		<tr>
			<td id="footer">Owned by Online Shopping comp....</td>
		</tr>
	</table>


</body>
</html>
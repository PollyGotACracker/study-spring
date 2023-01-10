<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입을 환영합니다</h1>
	<div>USERNAME: ${USER.username}</div>
	<div>PASSWORD: ${USER.password}</div>
	<div>실명확인: ${USER.realname}</div>
	<div>닉네임: ${USER.nickname}</div>
	<div>이메일: ${USER.email}</div>
	<div>전화번호: ${USER.tel}</div>
	<div>나이: ${USER.age}</div>
</body>
</html>
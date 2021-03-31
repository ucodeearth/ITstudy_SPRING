<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <h1> JSP page </h1>
    <h2> <%=request.getAttribute("m")%> </h2>   //scriptlet
    <h2> ${m} </h2>                             //EL
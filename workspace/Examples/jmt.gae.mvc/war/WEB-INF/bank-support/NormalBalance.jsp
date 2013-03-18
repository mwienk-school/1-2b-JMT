<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
<TITLE>Your Balance</TITLE>
<link type="text/css" rel="stylesheet" href="/resources/JSP-Styles.css" />
</HEAD>
<BODY>
<TABLE BORDER=5 ALIGN="CENTER">
<TR><TH CLASS="TITLE">
Your Balance</TABLE>
<P>
<IMG SRC="/resources/Money.gif" ALIGN="RIGHT">
<jsp:useBean id="regularCustomer"
type="coreservlets.BankCustomer"
scope="request" />
<UL>
<LI>First name: <jsp:getProperty name="regularCustomer"
property="firstName" />
<LI>Last name: <jsp:getProperty name="regularCustomer"
property="lastName" />
<LI>ID: <jsp:getProperty name="regularCustomer"
property="id" />
<LI>Balance: $<jsp:getProperty name="regularCustomer"
property="balance" />
</UL>
</BODY></HTML>
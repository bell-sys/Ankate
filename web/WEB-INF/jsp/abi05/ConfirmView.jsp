<%-- 
    Document   : ConfirmView
    Created on : 2022/11/18, 10:23:36
    Author     : abi05
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>入力内容の確認</title>
    </head>
    <body>
        <h1>☆アンケート入力内容の確認☆</h1>
            <form method="POST" action="FinishController">               
                冬といえばクリスマスである：${sessionScope.answers.ans1}<br>
                好きな食べ物はカレーである：${sessionScope.answers.ans2}<br>
                サッカーよりもバスケットが好き：${sessionScope.answers.ans3}<br>

                <input type="submit" value="OK" formaction="FinishController">            
                <input type="submit" value="戻る" formaction="AnkateController">                
            </form>
    </body>
</html>

<%-- 
    Document   : AnkateForm
    Created on : 2022/11/17, 14:59:38
    Author     : abi05
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>アンケート入力</title>
    </head>
    <body>
            <h1>☆アンケート☆</h1>
        <form method="POST" action="ConfirmController">               
            <div>冬といえばクリスマスである：
                <label><input type="radio" name="ans1" value="はい" 
                              ${sessionScope.answers.ans1 == "はい" ? "checked" : ""}>はい</label>
                <label><input type="radio" name="ans1" value="いいえ"
                              ${sessionScope.answers.ans1 == "いいえ" ? "checked" : ""}>いいえ</label>
            </div>
            
            <div>好きな食べ物はカレーである：
                <label><input type="radio" name="ans2" value="はい"
                              ${sessionScope.answers.ans2 == "はい" ? "checked" : ""}>はい</label>
                <label><input type="radio" name="ans2" value="いいえ"
                              ${sessionScope.answers.ans2 == "いいえ" ? "checked" : ""}>いいえ</label>
            </div>
            
            <div>サッカーよりもバスケットが好き：
                <label><input type="radio" name="ans3" value="はい"
                              ${sessionScope.answers.ans3 == "はい" ? "checked" : ""}>はい</label>
                <label><input type="radio" name="ans3" value="いいえ"
                              ${sessionScope.answers.ans3 == "いいえ" ? "checked" : ""}>いいえ</label>
            </div>
            
                <input type="submit" value="OK">
            </form>
    </body>
</html>

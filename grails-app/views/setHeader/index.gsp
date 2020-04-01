<%--
  Created by IntelliJ IDEA.
  User: georgestewart
  Date: 06/02/2020
  Time: 14:20
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Index</title>
</head>
<g:javascript library="jquery" plugin="jquery"/>
<script>
    $( document ).ready(function() {
        $.ajax({
            type: "GET",
            url: '/set-headers/setHeader/test',
            complete: function (XMLHttpRequest, textStatus) {
                var headers = XMLHttpRequest.getAllResponseHeaders();
                console.log(headers);
            }
        });
    });
</script>
<body>
    Index Page
</body>
</html>
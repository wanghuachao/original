<%--
  Created by IntelliJ IDEA.
  User: whc
  Date: 2019/4/2
  Time: 22:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/taglib.jsp" %>
<html>
<%@include file="common/head.jsp" %>
<body>
<c:out value="Hello Word"></c:out>
<button>发送ajax请求</button>
<p id="responseContent"></p>
<%@include file="common/foot.jsp" %>
</body>
<script>
  $(document).ready(function () {
    //TODO:待优化，写成公司${ctx}的样式
    var appUrl = '<%=request.getContextPath()%>';
    requirejs.config({
      baseUrl: appUrl + '/js'
    })
    ;
    requirejs(['test/add'], function (add) {
      add.add(1, 3);
      add.useMinus(5);
      $('body').on('click', 'button', function (event) {
        var opt = {
          url: appUrl + '/testCostTimeRequest',
          dataType: 'html',
          data: {attr: '123'}
        };

        commonUtil.doAjax(opt).done(function (resp) {
          $('#responseContent').text(resp);
        })
        // commonUtil.doAjax(opt).done(function (resp) {
        //   if (resp) {
        //     $('#responseContent').text(resp);
        //   }
        // });

      });

    });
  })
</script>
</html>

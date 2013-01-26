<%@ include file="/WEB-INF/jsp/layout/common/definition.jsp" %>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>


<body>

<div class="ui-login-main-container">
	<div class="ui-login-header-container">
		<tiles:insertAttribute name="header" />	
	</div>
	<div class="ui-login-body-container">
		<div class="ui-login-body-info-container">
			info	
		</div>
		<div class="ui-login-body-form-container">
			form
		</div>		
	</div>
	
</div>

<script type="text/javascript">
 
 $(document).ready(function(){

  });
 
</script>
</body>
</html>
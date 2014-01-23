<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">                                   
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="<c:url value="/" />">Chess event</a>
        </div>
        <div class="navbar-collapse collapse">  
          <ul class="nav navbar-nav">
            <li class="active"><a href="<c:url value="/" />">Home</a></li>
            <li><a href="<c:url value="/events" />">Events</a></li>
            <li><a href="<c:url value="/users" />">Users</a></li>
            <li><a href="<c:url value="/contacts" />">Contacts</a></li>
          </ul>
        </div>   			      		 
  </div>
</div>
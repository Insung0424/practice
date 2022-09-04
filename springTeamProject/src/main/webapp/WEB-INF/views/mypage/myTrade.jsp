<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">거래 내역</h1>
	</div>
	<!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">거래 내역</div>
			
			<!-- /.panel-heading -->
			<div class="panel-body">
				<table width="100%"
					class="table table-striped table-bordered table-hover"
					id="dataTables-example">
					<thead>
						<tr>
							<th>제품아이디</th>
							<th>구매자</th>
							<th>판매자</th>
							<th>거래상태</th>
							<th>거래시간</th>
						

						</tr>
					</thead>
					<tbody>
					<input type="hidden" id="user_id" name="user_id" value="${user.user_id}">
						
							<tr>
								
								<td><c:out value="${trade.product_id}" /></td>
								<td><c:out value="${trade.buyer_user_id}"/></td>
								<td><c:out value="${trade.sell_user_id}"/></td>
								<td><c:out value="${trade.pd_status}"/></td>
								<td><c:out value="${trade.trade_time}"/></td>
								
								
								
							</tr>
				
					</tbody>

				</table>
				</div>
				</div>
				</div>
				</div>
<div class="menu">
	<ul id="menu" class="menu">
		<li><a class="menulink" href="#">Home</a></li>
		<li><a class="menulink mainmenuactive" href="#">Place Orders</a>
			<ul>
				<li><a class="sub" href="#"> Vehicle Selection</a>
					<ul>
						<li class="topline"><a href="/AutoChoice/VehicleSelection/ByType">By Type</a></li>
						<li><a href="/AutoChoice/VehicleSelection/Proprietary">Proprietary</a></li>
						<li><a href="/AutoChoice/VehicleSelection/ExpressDesk">Express Desk (Urgent and Compelling)</a></li>
						<li><a href="/AutoChoice/VehicleSelection/Multiple">Multiple Award (23V MAS)</a></li>
						<li><a href="/AutoChoice/VehicleSelection/NonStandard"> Non-Standard Vehicles</a></li>

					</ul></li>
				<li><a href="#"> Pending Orders</a></li>
				<li><a class="sub" href="#"> MIPR</a>
					<ul>
						<li class="topline"><a href="#">Upload File</a></li>
						<li><a href="#">Letter of Acceptance</a></li>
					</ul></li>
				<li><a href="/AutoChoice/VehicleAvaila">Vehicle Availability</a></li>

			</ul></li>
		<li><a class="menulink" href="#">Your History</a>
			<ul>
				<c:if test="${commonBean.userAccount.privilege == 'A' ||
						commonBean.userAccount.privilege == 'S'}">
					<li><a href="/AutoChoice/OrderStatusMainForm"> Certificate of origin</a></li>
				</c:if>
				<li><a href="/AutoChoice/OrderStatusDeliveryProc"> Delivery Procedures</a></li>
				<li><a href="#"> Motor Vehicle Delivery Order</a></li>
				<li><a href="/AutoChoice/OrderStatusMainForm"> Order Status</a></li>
				<li><a href="/AutoChoice/OrderStatusVehReceiptForm"> Vehicle Report</a></li>
			</ul></li>
		<li><a class="menulink" href="#">Reports</a>
			<ul>
				<li><a href="#"> Build Report</a></li>
				<li><a href="http://fleet.fas.gsa.gov/ROADS/VendorPerformance.pdf" target="_blank"> Vendor Performance</a></li>
			</ul></li>
		<c:if test="${commonBean.userAccount.privilege == '6' &&
			 commonBean.userAccount.agencyCode == '47' &&
			 commonBean.userAccount.bureauCode == '09'}">
			<li><a class="menulink" href="#">FSR Program</a>
				<ul>
					<li><a href="/AutoChoice/FSRList/1"> 1-New England</a></li>
					<li><a href="/AutoChoice/FSRList/2"> 2-North &amp; Caribbean</a></li>
					<li><a href="/AutoChoice/FSRList/3"> 3-Mid-Atlantic</a></li>
					<li><a href="/AutoChoice/FSRList/4"> 4-Southeast Sunbelt</a></li>
					<li><a href="/AutoChoice/FSRList/5"> 5-Great Lakes</a></li>
					<li><a href="/AutoChoice/FSRList/6"> 6-Heartland</a></li>
					<li><a href="/AutoChoice/FSRList/7"> 7-Greater Southwest</a></li>
					<li><a href="/AutoChoice/FSRList/8"> 8-Rocky Mountain</a></li>
					<li><a href="/AutoChoice/FSRList/9"> 9-Pacific Rim</a></li>
					<li><a href="/AutoChoice/FSRList/19"> 10-Northwest/Arctic</a></li>
					<li><a href="/AutoChoice/FSRList/11"> 11-National Capital Region</a></li>
					<li><a href="/AutoChoice/FSRReportBuilder"> FSR Build Report</a></li>
					<li><a href="http://www.fsrsolutions.fas.gsa.gov" target="_blank"> FSR Solution Blog</a></li>
				</ul></li>
		</c:if>
		<li class="norightborder"><a class="menulink    " href="#">Customer
				Service</a>
			<ul
				style="overflow: hidden; display: block; height: 0px; z-index: 53; opacity: 0.037037;">
				<li><a href="/AutoChoice/MyProfile"> Manage Your Account</a></li>
				<c:if test="${commonBean.userAccount.privilege == 'S' || commonBean.userAccount.privilege == 'A'}">
				<li><a href="/AutoChoice/Admin"> Manage Group Accounts</a></li>
				<li><a href="/AutoChoice/AdminGroupAssign"> Manage Group Code</a></li>
				</c:if>
				<li><a href="https://public.govdelivery.com/accounts/USGSAAUTO/subscriber/new?" title="link to mailing lists" target="_blank"> Sign Up For Our Mailing Lists</a></li>
				<li><a href="#"> Tutorials</a></li>
			</ul></li>
	</ul>
</div>
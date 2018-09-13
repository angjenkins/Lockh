/**
 * 
 */
package gov.gsa.fas.AutoChoice.controller;


/**
 * @author KarunakarChatla
 *
 */
//@Controller
//@RequestMapping("/LoginServlet")
public class LoginController {
//	//private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
//	private MasterMailListDAO masterMailListDAO;
//	private VehicleItemDAO vehicleItemDAO;
//
//	@RequestMapping(method=RequestMethod.GET)
//	public String setupForm(ModelMap model){
//		// Setup the object to receive login credentials.
//		LoginDTO enquiry = new LoginDTO();
//		model.addAttribute("login", enquiry);
//		
//		// Setup the object to receive search criteria.
//		Search search = new Search();
//		model.addAttribute("search", search);
//		
//		return "login";		
//	}
//
//	/**
//	 * Simply selects the home view to render by returning its name.
//	 */
//	/*
//	@RequestMapping(value = "/LoginServlet", method = RequestMethod.POST)
//	public String validateLogin(Locale locale, Map<?, ?> model) {
//		
//		Collection<?> email = model.values();
//		
//		logger.info(email.toString());
//		return "success";
//	}
//	*/
//	
//	@RequestMapping(method=RequestMethod.POST)
//	public String onSubmit(@ModelAttribute("login") LoginDTO login, @ModelAttribute("search") Search search, ModelMap model, @RequestParam String action, BindingResult result){
//		//logger.info("Email entered - " + login.getEmail());
//		if( true == action.equalsIgnoreCase("login") ) {
//			MasterMailList subscription = masterMailListDAO.getSubscription(login.getEmail());
//			//if( true == masterMailListDAO.validate(login.getEmail(), login.getPassword())) {
//			if( null != subscription ) {
//				model.put("subscription", subscription);
//				masterMailListDAO.setUserDetail(subscription);
//				//ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("/WEB-INF/spring/appServlet/servlet-context.xml");
//				//MasterMailList subscriptionInSession = (MasterMailList) appContext.getBean("subscription");
//				//subscriptionInSession = subscription;
//				return "redirect:/SubscriptionController";
//			}
//			else {
//				return "failure";
//			}
//		} 
//		else if( true == action.equalsIgnoreCase("search") ) {
//			List<VehicleItem> vehicleList = vehicleItemDAO.searchForVehicles(search.getMake(), search.getModel(), search.getYear());
//			model.addAttribute("searchResult", vehicleList);
//			return "searchResults";
//		}
//		else {
//			return "failure";
//		}
//	}
//
//	public void setMasterMailListDAO(MasterMailListDAO masterMailListDAO) {
//		this.masterMailListDAO = masterMailListDAO;
//	}
//
//	public void setVehicleItemDAO(VehicleItemDAO vehicleItemDAO) {
//		this.vehicleItemDAO = vehicleItemDAO;
//	}	
}

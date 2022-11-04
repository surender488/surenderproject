

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageModel extends BaseClass {
	
	public PageModel() {
		PageFactory.initElements(driver, this);
		}

		@FindBy(name="username")
		private WebElement txtUsername;
		
		@FindBy(name="password")
		private WebElement txtPass;
		
		@FindBy(name="login")
		private WebElement btnLogin;
		
		@FindBy(name="location")
		private WebElement selectLocation;
		
		@FindBy(name="hotels")
		private WebElement selectHotel;
		
		@FindBy(name="room_type")
		private WebElement selectRoom;
		
		@FindBy(name="room_nos")
		private WebElement selectnoRoom;
		
		@FindBy(name="datepick_in")
		private WebElement txtInDate;
		
		@FindBy(id="datepick_out")
		private WebElement txtOutDate;
		
		@FindBy(id="adult_room")
		private WebElement selectAdltroom;
		
		@FindBy(name="child_room")
		private WebElement selectChildroom;
		
		@FindBy(id="Submit")
		private WebElement btnSearch;
		
		@FindBy(name="radiobutton_0")
		private WebElement btnclick;
		
		@FindBy(name="continue")
		private WebElement btnContinue;
		
		@FindBy(name="first_name")
		private WebElement txtFirstname;
		
		@FindBy(name="last_name")
		private WebElement txtLastname;
		
		@FindBy(name="address")
		private WebElement txtaddress;
		
		@FindBy(id="cc_num")
		private WebElement txtCCnum;
		
		@FindBy(id="cc_type")
		private WebElement selectCCtype;
		
		@FindBy(name="cc_exp_month")
		private WebElement selectMonth;
		
		@FindBy(name="cc_exp_year")
		private WebElement selectYear;
		
		@FindBy(name="cc_cvv")
		private WebElement txtCVVnum;
		
		@FindBy(name="book_now")
		private WebElement btnBook;
		
		@FindBy(xpath="//input[@name='text']")
		private WebElement txtOrdreno;

		public WebElement getTxtUsername() {
			return txtUsername;
		}

		public WebElement getTxtPass() {
			return txtPass;
		}

		public WebElement getBtnLogin() {
			return btnLogin;
		}

		public WebElement getSelectLocation() {
			return selectLocation;
		}

		public WebElement getSelectHotel() {
			return selectHotel;
		}
		
		public WebElement getselectnoRoom() {
			return selectnoRoom;
			
		}

		public WebElement getSelectRoom() {
			return selectRoom;
		}

		public WebElement getTxtInDate() {
			return txtInDate;
		}

		public WebElement getTxtOutDate() {
			return txtOutDate;
		}

		public WebElement getSelectAdltroom() {
			return selectAdltroom;
		}

		public WebElement getSelectChildroom() {
			return selectChildroom;
		}

		public WebElement getBtnSearch() {
			return btnSearch;
		}

		public WebElement getBtnclick() {
			return btnclick;
		}

		public WebElement getBtnContinue() {
			return btnContinue;
		}

		public WebElement getTxtFirstname() {
			return txtFirstname;
		}

		public WebElement getTxtLastname() {
			return txtLastname;
		}

		public WebElement getTxtaddress() {
			return txtaddress;
		}

		public WebElement getTxtCCnum() {
			return txtCCnum;
		}

		public WebElement getSelectCCtype() {
			return selectCCtype;
		}

		public WebElement getSelectMonth() {
			return selectMonth;
		}

		public WebElement getSelectYear() {
			return selectYear;
		}

		public WebElement getTxtCVVnum() {
			return txtCVVnum;
		}

		public WebElement getBtnBook() {
			return btnBook;
		}

		public WebElement getTxtOrdreno() {
			return txtOrdreno;
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


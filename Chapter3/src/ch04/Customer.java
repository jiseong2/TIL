package ch04;
/*04. �޼��� �������ϱ�(overring)
���� Ŭ�������� �޼��� ������ �ϱ�
- �������̵�(overriding) : ���� Ŭ������ ���ǵ� �޼����� ���� ������ ���� Ŭ�������� ������ ����� ���� �ʴ� ���
���� Ŭ�������� ������ �̸��� �޼��带 ������ �� �� ����.
- VIPCustomer Ŭ������ calcPrice()�� �������� ������� ����.
- ������ �Ͽ� �����ؾ� �� */

public class Customer {
	
	protected int customerID; // ���� ID ����Ŭ���������� �����Ҽ��ִ� protected Ű���� ���.(�ܺ�Ŭ������ ������.)
	protected String customerName; // ���� �̸�
	protected String customerGrade; // �������
	int bonusPoint; // ���ʽ�������Ʈ
	double bonusRatio; // ���ʽ� ����Ʈ ���� ����
	
//	public Customer() { // default constructor -> super
//		
//		customerGrade = "SILVER"; //�����ڸ� �������.
//		bonusRatio = 0.01;
//		
//		System.out.println("Customer() call");    
//		
//	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
	}
	
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio; // ���ʽ�����Ʈ ��������.
		return price;
		
	}
	/* private �� ��� ���̾Ƹ�� ǥ�ö� source -> getter setter*/
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String showCustomerInfo() {
		
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�."; 
	}

}
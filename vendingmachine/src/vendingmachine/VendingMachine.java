package vendingmachine;

public class VendingMachine {
	int price = 80;
	int balance;
	int total;
	VendingMachine() // ���캯��1������newһ������ʱû�д�������������������
	{
		total = 0;
	}
	VendingMachine(int price) // ���أ����캯��2���������˲����������������
	{
		this.price = price;
	}
	void showPrompt()
	{
		System.out.println("Welcome!");
	}
	
	void insertMoney(int amount)
	{
		balance += amount;
	}
	void setPrice(int price)
	{
		this.price = price;
	}
	void showBalance()
	{
		System.out.println(balance);
	}
	
	void getFood()
	{
		if(balance >= price) {
			System.out.println("Here you are.");
			balance -= price;
			total += price;
		}
	}
	
	public static void main(String[] args) {
		VendingMachine  vm = new VendingMachine();
		vm.showPrompt();
		vm.showBalance();
		vm.insertMoney(100);
		vm.getFood();
		vm.showBalance();
		VendingMachine vm1 = new VendingMachine(100);
		vm1.insertMoney(100);
		vm1.getFood();
		vm1.showBalance();
	}

}

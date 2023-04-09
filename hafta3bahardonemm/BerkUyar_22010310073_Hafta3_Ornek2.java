package hafta3bahardonemm;

public class BerkUyar_22010310073_Hafta3_Ornek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount a1 = new BankAccount ();
		System.out.println("a1 account : " + a1.getId()+ " , " + a1.getName());
		
		BankAccount a2 = new BankAccount ();
		System.out.println("a2 account : " + a2.getId()+ " , " + a2.getName());
		
		
		BankAccount[] accounts = new BankAccount[5];
		
		String [] names = {"Ahmet" , "Ali" , "Ayse" , "Veli" , "Osman" };
		
		for(int i = 0; i < accounts.length; i++) {
			accounts[i] = new BankAccount(names [i]);
			System.out.println(i + ". account : " + accounts[i].getId()+ " , " +accounts[i].getName());
		} 
		
		System.out.println(a1.numbers_accounts());
	}

}

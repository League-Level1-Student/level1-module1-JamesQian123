package _06_vault;

public class VaultRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vault vault = new Vault();
		for(int i = 0; i<1000000;i++ ) {
			boolean hi = vault.tryCode(i);
			if(vault.tryCode(i)) {
				System.out.println(i);
			}
		}
	}

	

}

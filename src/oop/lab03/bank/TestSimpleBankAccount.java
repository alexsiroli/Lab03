package oop.lab03.bank;

public final class TestSimpleBankAccount {

    private TestSimpleBankAccount() { }

    public static void main(final String[] args) {

        // 1) Creare l' AccountHolder relativo a Mario Rossi con id 1
    	
    	AccountHolder ah1 = new AccountHolder("Mario", "Rossi", 1);
    	
    	// 2) Creare l' AccountHolder relativo a Luigi Bianchi con id 2
    	
    	AccountHolder ah2 = new AccountHolder("Luigi", "Bianchi", 2);
    	
    	// 3) Creare i due SimpleBankAccount corrispondenti
    	
    	SimpleBankAccount sb1 = new SimpleBankAccount(ah1.getUserID(), 0);
    	SimpleBankAccount sb2 = new SimpleBankAccount(ah2.getUserID(), 0);
    	
    	// 4) Effettuare una serie di depositi e prelievi
    	
    	sb1.deposit(1, 1_000);
    	sb1.withdraw(1, 500);
    	sb1.depositFromATM(1, 100);
    	sb1.withdrawFromATM(1, 200);
    	
    	sb2.deposit(2, 10_000);
    	sb2.withdraw(2, 9_000);
    	sb2.depositFromATM(2, 50_000);
    	sb2.withdrawFromATM(2, 1_000);
    	
        // 5) Stampare a video l'ammontare dei due conti e verificare la correttezza del risultato
    	
    	System.out.println(sb1.toString());
    	System.out.println(sb2.toString());
    	
        // 6) Provare a prelevare fornendo un idUsr sbagliato
    	
    	sb1.withdraw(3, 500);
    	
        // 7) Controllare nuovamente l'ammontare
		
    	System.out.println(sb1.toString());
    	
    }
}

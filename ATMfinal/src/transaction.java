import java.util.ArrayList;
public class transaction {
	
int Balance ;
int i=0;


ArrayList<Mytransaction>trans = new ArrayList<Mytransaction>();

public transaction() {
	
int Balance=0;

this.Balance = Balance;

}



public void withdraw(int amount) {


if(amount <= Balance) {
	
Balance-=amount;

if(trans.size()>4) {
	
	trans.remove(0);
	i--;
	trans.add(i,new Mytransaction("WITHDRAWED :",amount));
	i++;
}	
else {

trans.add(i,new Mytransaction("WITHDRAWED :",amount));
i++;
}

}

}



public void deposit(int amount) {

Balance+=amount;
if(trans.size()>4) {
	
	trans.remove(0);
	i--;
	trans.add(i,new Mytransaction("DEPOSITED :",amount));
	i++;
}	
else {

trans.add(i,new Mytransaction("DEPOSITED :",amount));
i++;
}

}




public int balanceInquiry(){


	return Balance;
 
}
	

}

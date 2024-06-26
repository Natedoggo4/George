
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mail coolMail = new Mail();
		System.out.println(coolMail.getAddress());
		coolMail.setAddress(15);
		coolMail.setName("Daniel");
		coolMail.setDelivered(true);
		System.out.println(coolMail.Address());
		System.out.println(coolMail);
		
		
		Card shuffle = new Card();
		System.out.println(shuffle.getNum());
		
		Card[] deck=new Card[52];
		for (int i=0; i < 52; i++) {
			deck[i]=new Card();
		}
		for (int j=40; j <52; j++) {
			deck[j].setSuit('D');
			deck[j].setColor(true);
			deck[j].setNum(j);
		}
		for (int k=27; k <40; k++) {
			deck[k].setSuit('H');
			deck[k].setColor(true);
			deck[k].setNum(k);
		}
		for (int l=13; l <27; l++) {
			deck[l].setSuit('S');
			deck[l].setColor(false);
			deck[l].setNum(l);
		}
		for (int m=0; m <13; m++) {
			deck[m].setSuit('C');
			deck[m].setColor(false);
			deck[m].setNum(m);
		}
		for (int n=0; n<52; n++) {
			System.out.println(deck[n]);
		}
	}
	
}

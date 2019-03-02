import java.util.Random;
@ManagedBean(name = "guessBean")
@ApplicationScoped

public class BackingBean {
	private int intento;
	private int number;
	private int numberTry;
	private int prize;
	private boolean win;
	private String estado;
	public BackinBean() {
		intento=0;
		number=(int) (Math.random() * 100) + 1;
		numberTry=0;
		prize=100000;
		win=false;
		estado='No ha ganado';
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado=estado;
	}
	public int getNumber() {
		return this.number;
	}
	
	public int getNumberTry() {
		return this.numberTry;
	}
	
	public int getPrize() {
		return this.prize;
	}
	
	public void setNumber(int number) {
		this.number=number;
	}
	public void setNumberTry(int numberTry) {
		this.numberTry=numberTry;
	}
	public void setPrize(int prize) {
		this.prize=prize;
	}
	
	public boolean isWin() {
		return this.win;
	}
	
	public void setWin(boolean s) {
		this.win=s;
	}
	
	public boolean guess() {
		if( this.intento==number) {
			this.win=true;
			estado='Has ganado:'+Integer.toString(prize);
		}
		else {
			if(prize==0) {
				estado="Has perdido";
			}
			else {
				numberTry+=1;
				prize-=10000;
		}
	}
	}
	
	public void restart() {
		this.number=(int) (Math.random() * 100) + 1;
		prize=100000
		numberTry=0;
		this.win=false;		
	}
}

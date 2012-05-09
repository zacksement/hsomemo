import java.awt.Image;


public class Card {
	
	private int number;	

	private boolean turned;
	
	private boolean visible;
	
	private Image icon;
	
	public int getNumber() {
		
		return number;
		
	}

	public void setNumber(int number) {
		
		this.number = number;
		
	}

	public boolean isTurned() {
		
		return turned;
		
	}

	public void setTurned(boolean turned) {
		
		this.turned = turned;
		
	}

	public boolean isVisible() {
		
		return visible;
		
	}

	public void setVisible(boolean visible) {
		
		this.visible = visible;
		
	}
	
	public Image getIcon() {
		
		return icon;
		
	}

	public void setIcon(Image icon) {
		
		this.icon = icon;
		
	}
}

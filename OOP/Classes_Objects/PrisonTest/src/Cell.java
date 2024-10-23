
public class Cell {

	private String cellName;
	private boolean isDoorOpen;
	
	public Cell(String cellName, boolean isDoorOpen) {
		super();
		this.cellName = cellName;
		this.isDoorOpen = isDoorOpen;
	}

	public String getCellName() {
		return cellName;
	}

	public void setCellName(String cellName) {
		this.cellName = cellName;
	}

	public boolean getisDoorOpen() {
		return isDoorOpen;
	}

	public void setDoorOpen(boolean isDoorOpen) {
		this.isDoorOpen = isDoorOpen;
	}
	


}

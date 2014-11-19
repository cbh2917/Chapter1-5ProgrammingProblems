import javax.swing.JOptionPane;


public class testday {

	public static void main(String[] args) {
		Day day = new Day();
		day.setDay(Integer.parseInt(JOptionPane.showInputDialog("Enter the current day of the week")));
		day.setDay(Integer.parseInt(JOptionPane.showInputDialog("Enter number of days you wish to go the next or previous day")));
		System.out.println(day.getDay());
	}

}

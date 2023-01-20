/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Controller to edit this template
 */
package Controllers;



import javax.swing.JInternalFrame;
import views.Window;

public class Controller extends JInternalFrame {

	private Window window;

	public Controller() {
		window = new Window();
	}
	
	public static void main(String[] args) {
		new Controller();
	}
}

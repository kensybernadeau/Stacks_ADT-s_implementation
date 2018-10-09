package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;

public class DeleteFromListAction implements Action {

	@Override
	public void execute(Object args) {
		// TODO Auto-generated method stub
		IOComponent io = IOComponent.getComponent(); 
		DMComponent dm = (DMComponent) args; 
		String name = io.getInput("Enter the name of the list in which will delete: ");
		int value = Integer.parseInt(io.getInput("Enter the value to delete: ")); 
		dm.removeElementFromList(name, value);
	}

}

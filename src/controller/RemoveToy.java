package controller;

import view.AppMenus;

public class RemoveToy {
	AppMenus appMenu;
	ToyList toyList;

	public void launchRemove() {
		ToyList toyList=new ToyList();
		appMenu= new AppMenus();
		Remove();
		//locate sn  
		//print out all attrbutes in relation to that sn 
		
	}

	private void Remove() {
		String sn = appMenu.promptSN();
		boolean state = (toyList.getSerialNumber(sn));
		
		if (state== false) {
			System.out.println("ITEM NOT FOUND");
		}
		else {
			String formatedResults= toyList.getString(sn);
			String confirmation = appMenu.removeResults(formatedResults);
				if (confirmation=="y") {
					toyList.remove(sn);
				}
				else {
					break;
				}
			//PRESS TO CONTINUE 
			//GET STRIGN WILL RETURN 
		}
	}

}

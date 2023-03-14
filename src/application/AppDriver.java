package application;

import java.io.IOException;

import controller.ToyManager;
import exceptions.InvalidPlayerRangeException;
import exceptions.NegativePriceException;
/**

This class represents the driver class for the Toy Management Application.

It creates a new instance of the ToyManager class to run the application.
@author romag

@throws IOException if an I/O error occurs while reading from the input stream
@throws NegativePriceException if a negative price is entered for a toy
@throws InvalidPlayerRangeException if an invalid age range is entered for a player toy
*/
public class AppDriver {

	/**
	The main method of the application. It creates a new instance of the ToyManager class to run the application.
	@param args the command-line arguments for the application
	*/
		public static void main(String[] args) throws IOException, NegativePriceException, InvalidPlayerRangeException {
			
			
			new ToyManager(); 
		}
	}




package com.sii.rental.ui.views;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

import com.opcoach.training.rental.Rental;
import com.sii.rental.core.RentalCoreActivator;

public class RentalPart {

	private Label rentedObjectLabel, customerLabel;
	private Group grpDatesDeLocation;
	
	@PostConstruct
	public void createUI(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		
		Group infoGroup = new Group(parent, SWT.NONE);
		infoGroup.setText("Informations");
		infoGroup.setLayout(new GridLayout(2,false));
		
		rentedObjectLabel = new Label(infoGroup, SWT.BORDER);
		GridData gd = new GridData();
		gd.horizontalSpan = 2;
		gd.horizontalAlignment = SWT.FILL;
		rentedObjectLabel.setLayoutData(gd);
		rentedObjectLabel.setText("Perceuse Electrique");
		Label l=new Label(infoGroup, SWT.NONE);
		l.setText("Loué à:");
		
		customerLabel =  new Label(infoGroup, SWT.BORDER);
		customerLabel.setText("John Wayne");
		
		grpDatesDeLocation = new Group(parent, SWT.NONE);
		grpDatesDeLocation.setLayout(new GridLayout(2, false));
		grpDatesDeLocation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpDatesDeLocation.setText("Dates de location");
		
		Label lblDu = new Label(grpDatesDeLocation, SWT.NONE);
		lblDu.setText("du: ");
		
		Label label = new Label(grpDatesDeLocation, SWT.NONE);
		label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		label.setText("15/03/2011");
		
		Label lblAu = new Label(grpDatesDeLocation, SWT.NONE);
		lblAu.setText("au:");
		
		Label label_1 = new Label(grpDatesDeLocation, SWT.NONE);
		label_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		label_1.setText("22/03/2011");
		
		setRental(RentalCoreActivator.getAgency().getRentals().get(0));
	}

	@Focus
	public void onFocus() {
		
	}
	
	public void setRental(Rental r) {
		rentedObjectLabel.setText(r.getRentedObject().getName());
		customerLabel.setText(r.getCustomer().getDisplayName());
	}
}
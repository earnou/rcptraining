
package com.sii.rental.ui.views;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;

public class RentalPart {

	private Label rentedObjectLabel, customerLabel;
	private Group grpDatesDeLocation;
	private Label label, label_1;
	
	@Inject
	private ESelectionService e;
	
	@PostConstruct
	public void createUI(Composite parent, RentalAgency a) {
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
		
		 label = new Label(grpDatesDeLocation, SWT.NONE);
		label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		label.setText("15/03/2011");
		
		Label lblAu = new Label(grpDatesDeLocation, SWT.NONE);
		lblAu.setText("au:");
		
		 label_1 = new Label(grpDatesDeLocation, SWT.NONE);
		label_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		label_1.setText("22/03/2011");
		
		setRental(a.getRentals().get(0));
	}
	

	@Focus
	public void onFocus() {
		
	}
	
	public void setRental(Rental r) {
		if(rentedObjectLabel != null) {
			rentedObjectLabel.setText(r.getRentedObject().getName());
			customerLabel.setText(r.getCustomer().getDisplayName());
			label.setText(r.getStartDate().toString());
			label_1.setText(r.getEndDate().toString());
		}
	}
	
	@Inject @Optional
	public void receiveSelection(@Named(IServiceConstants.ACTIVE_SELECTION)Rental r) {
		setRental(r);
	}
}
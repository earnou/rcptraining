package com.sii.rental.ui.views;

import java.util.Collection;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;
import com.sii.rental.ui.RentalUIConstants;

public class RentalProvider extends LabelProvider implements ITreeContentProvider, IColorProvider, RentalUIConstants{

	@Override
	public Object[] getElements(Object inputElement) {
		Object[] result = null;
		
		if (inputElement instanceof Collection<?>) {
			result=((Collection<?>) inputElement).toArray();
		}
		
		return result;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if(parentElement instanceof RentalAgency) {
			RentalAgency a = (RentalAgency) parentElement;
			return new Node[] {
					new Node(Node.CUSTOMERS, a),
					new Node(Node.LOCATIONS, a),
					new Node(Node.OBJETS_À_LOUER, a),
			};
		}
		else if(parentElement instanceof Node) {
			return ((Node) parentElement).getChildren();
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		if(element instanceof EObject)
			return ((EObject) element).eContainer();
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return element instanceof RentalAgency || element instanceof Node;
	}
	
	@Override
	public String getText(Object element) {
		if(element instanceof RentalAgency)
			return ((RentalAgency) element).getName();
		else if (element instanceof Customer)
			return ((Customer) element).getDisplayName();
		else if(element instanceof RentalObject) {
			return ((RentalObject) element).getName();
		}
		
		return super.getText(element);
	}
	
	class Node{
		public static final String OBJETS_À_LOUER = "Objets à louer";
		public static final String LOCATIONS = "Locations";
		public static final String CUSTOMERS = "Customers";
		private String title;
		private RentalAgency a;
		
		public Node(String title, RentalAgency a) {
			super();
			this.title = title;
			this.a = a;
		}
		
		public Object[] getChildren()
		{
			if(title==CUSTOMERS)
				return a.getCustomers().toArray();
			else if(title == LOCATIONS)
				return a.getRentals().toArray();
			else if(title == OBJETS_À_LOUER)
				return a.getObjectsToRent().toArray();
			
			
			return null;
		}
		
		@Override
		public String toString() {
			return title;
		}
		
	}

	@Override
	public Color getForeground(Object element) {
		if(element instanceof Customer) {
			return Display.getCurrent().getSystemColor(SWT.COLOR_BLUE);
		}
		else if(element instanceof Rental) {
			return Display.getCurrent().getSystemColor(SWT.COLOR_MAGENTA);
		}
		else if(element instanceof RentalObject) {
			return Display.getCurrent().getSystemColor(SWT.COLOR_GRAY);
		}
		
		return null;
	}

	@Override
	public Color getBackground(Object element) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Inject @Named(RENTAL_UI_IMG_REGISTRY)
	private ImageRegistry registry;
	
	@Override
	public Image getImage(Object element)
	{
		if(element instanceof Customer) {
			return registry.get(IMG_CUSTOMER);
		}
		return null;
	}
	
}

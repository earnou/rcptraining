package com.sii.rental.ui.views;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;

public class RentalProvider extends LabelProvider implements ITreeContentProvider{

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
	
}

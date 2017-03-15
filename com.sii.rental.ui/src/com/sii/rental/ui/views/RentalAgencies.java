package com.sii.rental.ui.views;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

import com.opcoach.training.rental.RentalAgency;

public class RentalAgencies {
	public static final String COM_SII_RENTAL_EAP_POPUPMENU_0 = "com.sii.rental.eap.popupmenu.0";

	@Inject
	private ESelectionService selectionService;
	
	@PostConstruct
	public void createPartControl(Composite parent, RentalAgency a, IEclipseContext context, EMenuService menuService) {
		TreeViewer tv = new TreeViewer(parent);
		tv.setContentProvider(ContextInjectionFactory.make(RentalProvider.class, context));
		tv.setLabelProvider(ContextInjectionFactory.make(RentalProvider.class, context));
		
		Collection<RentalAgency> agencies = new ArrayList<>();
		agencies.add(a);
		tv.setInput(agencies);
			
		tv.addSelectionChangedListener(new ISelectionChangedListener() {
			
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection sel = (IStructuredSelection) event.getSelection();
				selectionService.setSelection(sel.size() == 1 ? sel.getFirstElement():sel.toArray());
				
			}
		});
		tv.expandAll();
		
		menuService.registerContextMenu(tv.getControl(), COM_SII_RENTAL_EAP_POPUPMENU_0);
	
	}

}

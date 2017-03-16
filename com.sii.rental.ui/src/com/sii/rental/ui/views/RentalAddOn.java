package com.sii.rental.ui.views;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.IColorProvider;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.RentalAgency;
import com.sii.rental.core.RentalCoreActivator;
import com.sii.rental.ui.Palette;
import com.sii.rental.ui.RentalUIConstants;

public class RentalAddOn implements RentalUIConstants{

	private Map<String,Palette> paletteManager = new HashMap<>();
	
	@PostConstruct
	public void initContext(IEclipseContext ctx) {
		ctx.set(RentalAgency.class, RentalCoreActivator.getAgency());
		ctx.set(RENTAL_UI_IMG_REGISTRY, getLocalImageRegistry());
		ctx.set(PALETTE_MANAGER, paletteManager);
	}
	
	ImageRegistry getLocalImageRegistry()
	{
		Bundle b = FrameworkUtil.getBundle(getClass());
		
		ImageRegistry reg = new ImageRegistry();
		
		reg.put(IMG_CUSTOMER, ImageDescriptor.createFromURL(b.getEntry(IMG_CUSTOMER)));
		reg.put(IMG_RENTAL, ImageDescriptor.createFromURL(b.getEntry(IMG_RENTAL)));
		reg.put(IMG_RENTAL_OBJECT, ImageDescriptor.createFromURL(b.getEntry(IMG_RENTAL_OBJECT)));
		reg.put(IMG_AGENCY, ImageDescriptor.createFromURL(b.getEntry(IMG_AGENCY)));
		
		return reg;
	}
	
	@Inject
	@Optional
	void reactOnCustomEvent(@UIEventTopic("copyCustomer") Customer custom) {
		System.out.println(custom.getDisplayName());
	}
	
	@Inject
	public void readPaletteExtensions(IExtensionRegistry reg) {
		for(IConfigurationElement elt : reg.getConfigurationElementsFor("com.sii.rental.ui.palette")) {
			Palette pal = new Palette();
			pal.setId(elt.getAttribute("id"));
			pal.setName(elt.getAttribute("name"));
			try {
				pal.setProvider((IColorProvider) elt.createExecutableExtension("paletteClass"));
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			paletteManager.put(pal.getId(), pal);
			System.out.println(pal.getName());
		}
	}
	
	@Inject
	public void getExtensions(IExtensionRegistry reg) {
		for(IConfigurationElement elt : reg.getConfigurationElementsFor("org.eclipse.e4.workbench.model")) {
			if(elt.getName().equals("fragment")) {
				String frg = elt.getAttribute("uri");
				System.out.println("fragment:" + frg);
				System.out.println("fragment.plugin:" + elt.getNamespaceIdentifier());
			}
			else if(elt.getName().equals("processor")) {
				String prc = elt.getAttribute("class");
				System.out.println("processor:" + prc);
			}
		}
	}
}

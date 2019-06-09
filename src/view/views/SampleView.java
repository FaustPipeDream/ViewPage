package view.views;


import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.*;
import org.eclipse.ui.*;
import javax.inject.Inject;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class SampleView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "view.views.SampleView";

	@Inject IWorkbench workbench;
	
	Button button1;
	Button button2;
	Button button3;
	Button button4;



	@Override
	public void createPartControl(Composite composite) {
		
		Image image= new Image(composite.getDisplay(), "C:\\Users\\Index\\eclipse-workspace\\view\\icons\\center.png");
		
		button1 = new Button(composite, SWT.NONE);
		button1.setImage(image);
		
		button2 = new Button(composite, SWT.NONE);
		button2.setImage(image);
		
		button3 = new Button(composite, SWT.NONE);
		button3.setImage(image);
		
		button4 = new Button(composite, SWT.NONE);
		button4.setImage(image);
		
		RowLayout rowLayout = new RowLayout();
		rowLayout.marginTop = 200;
		rowLayout.marginLeft = 80;
		rowLayout.spacing = 80;
		
		composite.setLayout(rowLayout);
		
	}




	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}
}

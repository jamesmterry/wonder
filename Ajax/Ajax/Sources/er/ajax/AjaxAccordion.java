package er.ajax;

// Generated by the WOLips Templateengine Plug-in at Apr 28, 2006 9:47:15 PM

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WORequest;
import com.webobjects.appserver.WOResponse;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSMutableDictionary;

import er.extensions.ERXWOContext;
import er.extensions.ERXStringUtilities;

public class AjaxAccordion extends AjaxComponent {
  private String _accordionID;
  
  public AjaxAccordion(WOContext context) {
    super(context);
  }

  public boolean isStateless() {
    return true;
  }

  public boolean synchronizesVariablesWithBindings() {
    return false;
  }

  public void appendToResponse(WOResponse response, WOContext context) {
    _accordionID = (String) valueForBinding("id", ERXWOContext.safeIdentifierName(context, true) + "Accordion");
    super.appendToResponse(response, context);
  }

  public String accordionID() {
    return _accordionID;
  }

  public NSDictionary createAjaxOptions() {
    NSMutableArray ajaxOptionsArray = new NSMutableArray();
    ajaxOptionsArray.addObject(new AjaxOption("expandedBg", AjaxOption.STRING));
    ajaxOptionsArray.addObject(new AjaxOption("hoverBg", AjaxOption.STRING));
    ajaxOptionsArray.addObject(new AjaxOption("collapsedBg", AjaxOption.STRING));
    ajaxOptionsArray.addObject(new AjaxOption("expandedTextColor", AjaxOption.STRING));
    ajaxOptionsArray.addObject(new AjaxOption("expandedFontWeight", AjaxOption.STRING));
    ajaxOptionsArray.addObject(new AjaxOption("hoverTextColor", AjaxOption.STRING));
    ajaxOptionsArray.addObject(new AjaxOption("collapsedTextColor", AjaxOption.STRING));
    ajaxOptionsArray.addObject(new AjaxOption("collapsedFontWeight", AjaxOption.STRING));
    ajaxOptionsArray.addObject(new AjaxOption("hoverTextColor", AjaxOption.STRING));
    ajaxOptionsArray.addObject(new AjaxOption("borderColor", AjaxOption.STRING));
    ajaxOptionsArray.addObject(new AjaxOption("panelHeight", AjaxOption.NUMBER));
    ajaxOptionsArray.addObject(new AjaxOption("onHideTab", AjaxOption.SCRIPT));
    ajaxOptionsArray.addObject(new AjaxOption("onShowTab", AjaxOption.SCRIPT));
    ajaxOptionsArray.addObject(new AjaxOption("onLoadShowTab", AjaxOption.SCRIPT));
    NSMutableDictionary options = AjaxOption.createAjaxOptionsDictionary(ajaxOptionsArray, this);
    return options;
  }

  protected void addRequiredWebResources(WOResponse response) {
    addScriptResourceInHead(response, "prototype.js");
    addScriptResourceInHead(response, "rico.js");
  }

  public WOActionResults handleRequest(WORequest request, WOContext context) {
    return null;
  }
}
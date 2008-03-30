/**
 * 
 */
package org.pentaho.ui.xul.components;

import java.awt.Font;

import org.pentaho.ui.xul.XulComponent;

/**
 * The interface for the XUL label widget.
 * 
 * @author nbaker
 *
 */
public interface XulLabel extends XulComponent {
  
  /**
   * Sets the text on the label
   * 
   * @param value The text that should display on the label.
   */
  public void setValue(String value);

  /**
   * Sets the font to use to render the label's text. This is 
   * a java.awt.Font. 
   * 
   * @param font The font to use for the label's text. 
   */
  public void setFont(Font font);
  
  
  /**
   * XUL's attribute is "disabled", thus this acts
   * exactly the opposite of SWT/Swing/AWT. If the property is not 
   * available, then the control is enabled. 
   *
   * @return boolean true if the control is disabled.
   */
  public boolean isDisabled();
  
  /**
   * 
   * @param dis If true, disable this button. Otherwise,
   * attribute should be removed. 
   */
  public void setDisabled(boolean dis);

}
